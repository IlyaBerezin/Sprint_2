package praktikum.sprint_2.service;

//импорт интерфейса для доступа к методу

import praktikum.sprint_2.model.Discountable;

//import praktikum.sprint_2.model.Discountable;

//импорт абстрактного класса Food для доступа к методам
import praktikum.sprint_2.model.Food;
//импорт переменной из класса Discount
import static praktikum.sprint_2.model.constants.Discount.DISCOUNT;

public class ShoppingCart {
    private final Food[] items; //Массив корзины с продуктами

    public ShoppingCart(Food[] items) {//конструктор класса ShoppingCart
        this.items = items;//инициализация массива
    }
    //метод получить общую сумму товаров в корзине без скидки
    public double getSumDiscountWithout() {
        double total = 0.0;
        for (Food item : items) {// цикл перебора продуктов
            total += item.getAmount() * item.getPrice();//прибавляем к сумме стоимость продукта в корзине
        }
        return total;//возвращаем результат
    }
    //метод получить общую сумму товаров в корзине со скидкой
    public double getSumDiscountWith() {
        double totalWithoutDiscount = 0.0; // Общая сумма без скидок
        double totalDiscount = 0.0;        // Общая сумма скидок
        // Проходим по всем товарам в корзине
        for (Food item : items) {
            // Считаем общую стоимость без скидок
            totalWithoutDiscount += item.getAmount() * item.getPrice();

            // Проверяем, реализует ли товар интерфейс Discountable
            if (item instanceof Discountable) {
                // Если да, получаем размер скидки и добавляем к общей сумме скидок
                totalDiscount += item.getDiscount();
            }
        }
        // Возвращаем итоговую сумму: общая стоимость минус общая скидка
        return totalWithoutDiscount - totalDiscount;
    }
    //метод получить общую сумму всех вегетарианских продуктов в корзине без скидки
    public double getSumVeganDiscountWithout() {
        double total = 0.0;
        for (Food item : items) {// цикл перебора продуктов
            if (item.isVegetarian()) {//если продукт вегетарианский
                total += item.getAmount() * item.getPrice();//прибавляем к сумме стоимость продукта в корзине
            }
        }
        return total;//возвращаем результат
    }
}

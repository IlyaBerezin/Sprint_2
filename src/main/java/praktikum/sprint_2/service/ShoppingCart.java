package praktikum.sprint_2.service;

//импорт интерфейса для доступа к методу
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
        double total = 0.0;
        for (Food item : items) {// цикл перебора продуктов
            total += item.getAmount() * item.getPrice() * DISCOUNT;//прибавляем к сумме стоимость продукта в корзине и умножаем на скидку
        }
        return total;//возвращаем результат
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

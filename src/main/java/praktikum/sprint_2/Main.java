package praktikum.sprint_2;

import praktikum.sprint_2.model.Apple;
import praktikum.sprint_2.model.Food;
import praktikum.sprint_2.model.Meat;
import praktikum.sprint_2.service.ShoppingCart;
import praktikum.sprint_2.model.constants.Colour;

public class Main {

    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);// Создание объекта Meat
        Apple appleGreen = new Apple(8, 60, Colour.COLOURRED);// Создание объекта Apple зелёное
        Apple appleRed = new Apple(10, 50, Colour.COLOURRED);// Создание объекта Apple красное

        Food[] products = {//массив продкутов
                meat, appleGreen, appleRed
        };
        // Инициализируем корзину
        ShoppingCart cart = new ShoppingCart(products);

        System.out.println("Общая сумма товаров без скидки: " + cart.getSumDiscountWithout());//общую сумму товаров без скидки
        System.out.println("Общая сумма товаров со скидкой: " + cart.getSumDiscountWith());//общую сумму товаров со скидкой
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + cart.getSumVeganDiscountWithout());//сумму всех вегетарианских продуктов без скидки

    }
}
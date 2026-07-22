package praktikum.sprint_2.model;

public class Meat extends Food {

    // Конструктор, принимающий кол-во продукта и цену, и устанавливвет значение для isVegetarian
    public Meat(int amount, double price) {
    super(amount, price, false);//вызов конструктора родителя
    }
}

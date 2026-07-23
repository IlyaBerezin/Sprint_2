package praktikum.sprint_2.model;

//абстрактный класс с обозначением параметров продуктов

public abstract class Food implements Discountable {

    protected int amount; //кол-во продуктов
    protected double price; //цена за товар
    protected boolean isVegetarian; //обозначение вегетарианский или нет

    //конструкто класса Food
    public Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;//инициализация количества продуктов
        this.price = price;//инициализация цены
        this.isVegetarian = isVegetarian;//инициализация параметра, определяющего вегетарианский продукт ли нет
    }

    //метод получения кол-ва проудктов
    public int getAmount() {
        return amount;
    }
    //метод получения цены продуктов
    public  double getPrice() {
        return  price;
    }
    //метод получения значения веганский или нет
    public boolean isVegetarian() {
        return isVegetarian;
    }
}


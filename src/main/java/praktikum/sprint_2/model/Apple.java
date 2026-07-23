package praktikum.sprint_2.model;

//импорт констант
import static praktikum.sprint_2.model.constants.Colour.COLOURRED;
import static praktikum.sprint_2.model.constants.Discount.DISCOUNT;

//класс Apple наследник класса Food и реализует интрефейс Discountable

public class Apple extends Food {

    private final String colour;  //цвет яблок

    // Конструктор, принимающий значения цвета яблок, кол-во продукта и цену, и устанавливвет значение для isVegetarian
    public Apple(int amount, double price, String colour) {
        //конструктор родительского класса
        super(amount, price, true);
        this.colour = colour;
    }

    //метод определения скидки для яблок
    @Override
    public double getDiscount() {
        if(COLOURRED.equals(colour)) { //если цвет яблок красны, то возвращаем скидку из переменной DISCOUNT
            return amount * price * DISCOUNT;
        } else {
            return 0;
        }
    }
}


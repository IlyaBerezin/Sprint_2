package praktikum.sprint_2.model;

public interface Discountable {

    // Метод, возвращающий скидку в процентах
    default double getDiscount() {
    return 0;
    }
}

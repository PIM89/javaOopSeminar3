package Task2;

public interface Action {
    /**
     * Человек двигает мебель
     */
    void move(Furniture furniture);

    /**
     * Человек протирает мебель
     */
    void wipe(Furniture furniture);
}

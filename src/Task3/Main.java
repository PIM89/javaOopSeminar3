package Task3;

/* Подумать как описать логику взаимодействия человека и домашнего питомца.
Сценарий: “Человек “зовёт” котика “кис-кис”, котик отзывается*/

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat( "Василий","черный", 400, 30, "мейн-кун", "длинные", true);
        Human human = new Human("Иванов", "Иван");
        Dog dog = new Dog("Гаврюша", "белый", 450, 15, "дворняшка", "гладкошерстный", true);

        human.calling(cat);    // Взаимодействие человека и кота
        System.out.println();
        human.calling(dog);    // Взаимодействие человека и собаки
    }
}

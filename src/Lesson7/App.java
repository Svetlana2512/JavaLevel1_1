package Lesson7;

public class App {
    public static void main (String[] args) {

        Cat cat1 = new Cat("Мурзик", 100);
        Cat cat2 = new Cat("Васька", 50);

        Plate plate = new Plate(200);

        cat1.eat(plate);
        cat2.eat(plate);

        System.out.println(plate.getFood());
    }
}

package Lesson7_;

import Lesson7.Cat;
import Lesson7.Plate;

public class App {
    public static void main (String[] args) {

        Lesson7.Cat cat1 = new Lesson7.Cat("Мурзик", 100);
        Lesson7.Cat cat2 = new Cat("Васька", 50);

        Lesson7.Plate plate = new Plate(200);

        cat1.eat(plate);
        cat2.eat(plate);

        System.out.println(plate.getFood());
    }
}

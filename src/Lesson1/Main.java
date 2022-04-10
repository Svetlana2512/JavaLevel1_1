package Lesson1;

public class Main {

        // Метод  printThreeWords
        public static void main(String[] args) {

            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");

            // Метод checkSumSign
            int a = 25;
            int b = 30;
            int sum = a + b;

            if (sum >= 0) {
                System.out.println("Сумма положительная");
            } else {
                System.out.println("Сумма отрицательная");
            }

            // Метод printColor

            int value = 36;

            if (value <= 0) {
                System.out.println("Красный");
            }
            else if (value > 0 & value <= 100) {
                System.out.println("Желтый");
            }
            else {
                System.out.println("Зеленый");
            }

            // Метод compareNumbers

            int c = 10;
            int d = 50;

            if (c >= d) {
                System.out.println("c >= d");
            } else {
                System.out.println("c < d");
            }

        }

    }


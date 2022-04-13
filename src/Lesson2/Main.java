package Lesson2;

public class Main {
    public static void main(String[] args) {
        System.out.println(within10and20( 3, 5 ));
        isPositiveOrNegative( 5 );
        System.out.println(isNegative( -27 ));
        printWordMany("I love GB", 4);
    }

    public static boolean within10and20(int a, int b) {
        boolean result = 10 <= a+b && a+b <=20;
        return result;
    }

    public static void isPositiveOrNegative( int y ) {
        if (y >= 0) {
            System.out.println("Число " + y + " положительное");
        } else {
            System.out.println("Число " + y + " отрицательное");
        }
    }

    public static boolean isNegative(int d) {
        if (d < 0) return true;
        return false;
    }

    public static void printWordMany(String str, int n) {
        for (int j = 1; j <= n; j++) {
            System.out.print( j + ")" + " " + str + " ");
        }
        System.out.println();
    }

}

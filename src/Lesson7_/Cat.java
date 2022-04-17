package Lesson7_;

import Lesson7.Plate;

public class Cat {
    private static int countOfCats = 0;
    private String name;
    private int appetite;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        countOfCats++;
    }

    public void eat(Plate plate) {
        plate.setFood(plate.getFood() - appetite);
    }


//  public void setName (String name) {
//      this.name = name;
//  }

    public String getName () {
        return name;
    }

//    public int getAppetite() {
//        return appetite;
//  }

//    public void setAppetite(int appetite) {
//        this.appetite = appetite;
//  }

    public static int getCountOfCats() {
        return countOfCats;
    }

}

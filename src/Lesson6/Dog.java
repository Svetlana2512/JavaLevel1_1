package Lesson6;

class Dog extends Animal {

    public int swim;

    public Dog(String name, int run, int swim) {
        this.name = name;
        this.run = run;
        this.swim = swim;

    }
    public void dogInfo() {
        System.out.println("Собака: " + name  + " бежит: " + run+ " m," + " плывет:" + swim);
    }
}

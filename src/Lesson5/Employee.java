package Lesson5;

public class Employee {

    private String name;
    private String profession;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String profession, String email, String phone, int salary, int age) {
        this.name = name;
        this.profession = profession;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString(){
        return(name+ "\n-" +profession+ "\n-" +email+ "\n-" +phone+ "\n-" +salary+ "\n-" +age);
    }
}


package Lesson5;

public class Main {
    public static void main(String[] args) {
        Employee[] empCorp = new Employee[5];
        empCorp[0] = new Employee("Denis", "Boss", "Denis@mailbox.com", "893712312",50000,41);
        empCorp[1] = new Employee("Petr", "Engineer", "Petr@mailbox.com", "893712314",40000,32);
        empCorp[2] = new Employee("Vera", "Calculator", "Vera@mailbox.com", "893712315",35000,53);
        empCorp[3] = new Employee("Svetlana", "Specialist", "Svetlana@mailbox.com", "893712316",35000,18);
        empCorp[4] = new Employee("Anton", "Cleaner", "Anton@mailbox.com", "892712317",15000,21);
        for (Employee employee : empCorp)
            if (employee.getAge()>40)
                System.out.println(employee);

    }
}

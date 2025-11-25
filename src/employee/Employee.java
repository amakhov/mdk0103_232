package employee;

import java.util.Random;

public class Employee {
    private String name;
    private String company;
    private int salary;
    private int age;
    Random random = new Random();

    public Employee(String name, String company, int salary, int age) {
        this.name = name;
        this.company = company;
        this.salary = random.nextInt(55000);
        this.age = random.nextInt(18,25);
    }

    public Employee(String name, String company, int age){
        this.name = name;
        this.company = company;
        this.salary = 0;
        this.age = age;
    }

    public void setSalary(int newSalary) {
        salary = newSalary;

    }
    public void displaySalary() {
        System.out.println("У " + name + " зарплата " + salary );
    }

    public void displayInfo() {
//        System.out.println("Name: " + this.name + ", Company: " + this.company + ", Salary: " + this.salary + ", Age: " + this.age);
        System.out.printf("Name: %s, Company: %s, Salary: %d, Age: %d\n", this.name, this.company, this.salary, this.age);
    }
}

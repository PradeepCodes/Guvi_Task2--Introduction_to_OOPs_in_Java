package Oops;

public class Employee extends Person{
    private int employeeId;
    private double salary;

    public Employee(String name, int age, int employeeId, double salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
    }
    public void displayEmployee(){
        display();
        System.out.println("Employee ID :"+employeeId);
        System.out.println("Salary : "+ salary);
    }
}

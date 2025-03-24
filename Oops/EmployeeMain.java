package Oops;

class Employee extends Person {
    private int employeeID;
    private double salary;

    // Constructor using super keyword
    public Employee(String name, int age, int employeeID, double salary) {
        super(name, age);
        this.employeeID = employeeID;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayEmployee() {
        displayPerson();
        System.out.println("Employee ID: " + employeeID + ", Salary: " + salary);
    }
}
public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp = new Employee("Pradeep", 25, 1, 100000);
        emp.displayEmployee();
    }
}

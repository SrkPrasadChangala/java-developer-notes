package oops.abstraction.employee;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private double salary;

    
    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        
        System.out.println("Employee constructor called for: " + firstName + " " + lastName);
    }

    // Abstract method to be implemented by subclasses
    protected abstract void calculateSalary(double salary);

    public double getSalary() {
        System.out.println("Inside getSalary method of Employee class");
        return salary;
    }

    protected void setSalary(double salary) {
        this.salary = salary;
    }

}
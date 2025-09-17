package oops.abstraction.employee;

public class Fulltime extends Employee {
    

    public Fulltime(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        calculateSalary(salary);
        System.out.println("inside Fulltime constructor");
    }

    @Override
    protected void calculateSalary(double salary) {
        System.out.println("Inside abstract method Implementation to calculate salary for full-time employee ");
        setSalary(salary);
    }

    public double getSalary() {
        System.out.println("Inside getSalary method of Fulltime class");
        return super.getSalary();
    }
}
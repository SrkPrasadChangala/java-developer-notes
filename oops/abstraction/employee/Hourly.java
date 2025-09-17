package oops.abstraction.employee;

public class Hourly extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public Hourly(String firstName, String lastName, int hoursWorked, double hourlyRate) {
        super(firstName, lastName);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
        calculateSalary(hoursWorked * hourlyRate);
        System.out.println("inside Hourly constructor");
    }

    @Override
    protected void calculateSalary(double salary) {
        System.out.println("Inside abstract method Implementation to calculate salary for hourly employee ");
        setSalary(salary);
    }

    @Override
    public double getSalary() {
        System.out.println("Inside getSalary method of Hourly class");
        return super.getSalary();
    }
}
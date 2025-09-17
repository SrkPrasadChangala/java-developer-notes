package oops.abstraction;

import oops.abstraction.employee.Fulltime;
import oops.abstraction.employee.Hourly;

public class Main{
    public static void main(String[] args) {
        Payroll payroll = new Payroll();

        Fulltime emp1 = new Fulltime("John", "Doe", 60000);
        Hourly emp2 = new Hourly("Jane", "Smith", 160, 25);

        payroll.addEmployee(emp1);
        payroll.addEmployee(emp2);

        payroll.printPayroll();
    }
}
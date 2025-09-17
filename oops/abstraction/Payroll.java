package oops.abstraction;
import oops.abstraction.employee.Employee;
import java.util.List;
import java.util.ArrayList;

public class Payroll {
    private List<Employee> employees;

    public Payroll() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void printPayroll() {
        for (Employee emp : employees) {
            System.out.println("Employee: " + emp.getFullName() + ", Salary: " + emp.getSalary());
        }
    }
}
## Abstraction Principle in OOP: Analysis
Abstraction in Object-Oriented Programming (OOP) is the process of exposing only the essential features of an object while hiding its implementation details. This principle helps manage complexity by allowing developers to work with simplified models.

### How Abstraction is Applied in the Provided Code

- **Abstract Class (`Employee`)**: The `Employee` class defines common properties and behaviors for all employees, such as `name` and the abstract method `calculateSalary()`. It does not implement `calculateSalary()`, leaving the details to subclasses.
- **Concrete Subclasses (`Fulltime`, `Hourly`)**: These classes extend `Employee` and provide specific implementations for `calculateSalary()`. `Fulltime` calculates salary based on a fixed value, while `Hourly` calculates salary based on hours worked and an hourly rate. Both classes use the `setSalary()` method to assign the calculated salary.
- **Usage in `Payroll` and `Main`**: The `Payroll` class operates on `Employee` references, allowing it to process both `Fulltime` and `Hourly` employees without knowing their specific types. The `Main` class demonstrates creating different employee types and calculating their salary through abstraction.

### Example

```java
abstract class Employee {
    String name;
    double salary;
    abstract void calculateSalary();
    void setSalary(double salary) { this.salary = salary; }
}

class Fulltime extends Employee {
    double fixedSalary;
    void calculateSalary() { setSalary(fixedSalary); }
}

class Hourly extends Employee {
    double hours, rate;
    void calculateSalary() { setSalary(hours * rate); }
}
```

### Benefits

- **Simplifies code** by focusing on high-level operations (`calculateSalary()`).
- **Promotes code reuse** through shared abstractions (`Employee`).
- **Improves maintainability** by decoupling implementation from usage (`Payroll` processes any `Employee`).

### Summary

Abstraction in this codebase enables flexible and extensible payroll processing by separating what an employee does (calculating salary) from how each type of employee does it. Review the provided Java files to see abstraction in action.

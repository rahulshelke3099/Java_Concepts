package org.java.oops.cohesion.lowcohesion;

/**
 *
 * EmployeeManagement Class: This class handles various aspects of employee management,
 * including hiring, finding employees, and calculating payroll.
 * The class combines unrelated tasks such as hiring employees,
 * finding employees, and calculating payroll, leading to low cohesion.
 *
 * Explanation:
 * High Cohesion: In the first example, each class has a single responsibility related to employee management,
 * leading to high cohesion. This makes the codebase more maintainable, understandable, and flexible.
 * Low Cohesion: In the second example, the EmployeeManagement class handles multiple unrelated tasks,
 * resulting in low cohesion. This makes the class less focused and harder to understand, maintain, and extend.
 *
 *
 */

import org.java.oops.cohesion.highcohesionn.Employee;

import java.util.List;

// EmployeeManagement class: Handles various aspects of employee management
public class EmployeeManagement {
    private List<Employee> employees;

    public EmployeeManagement(List<Employee> employees) {
        this.employees = employees;
    }

    public void hireEmployee(Employee employee) {
        // Perform hiring process
        // Save employee data to the database
    }

    public Employee findEmployee(int employeeId) {
        // Retrieve employee from database
        // Update employee data
        return null;
    }

    public void calculatePayroll() {
        // Calculate payroll for all employees
        // Generate payroll report
    }

    // Other methods for employee management tasks (e.g., training, performance evaluation)
}

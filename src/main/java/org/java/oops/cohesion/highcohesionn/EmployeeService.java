package org.java.oops.cohesion.highcohesionn;

// EmployeeService class: Provides services related to employee management
public class EmployeeService {
    private EmployeeDatabase employeeDatabase;

    public EmployeeService(EmployeeDatabase employeeDatabase) {
        this.employeeDatabase = employeeDatabase;
    }

    public void hireEmployee(Employee employee) {
        // Perform hiring process
        employeeDatabase.saveEmployee(employee);
    }

    public Employee findEmployee(int employeeId) {
        // Retrieve employee from database
        return employeeDatabase.retrieveEmployee(employeeId);
    }

    // Other employee-related services (e.g., promoteEmployee, terminateEmployee)
}

package org.java.oops.aggregation;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private List<Department> departments; // Aggregation

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Other university-related methods
}

package hm.app.msqldemo.service;

import java.util.List;

import hm.app.msqldemo.domain.Employee;

public interface EmployeeService {
    List<Employee> findAll();
}

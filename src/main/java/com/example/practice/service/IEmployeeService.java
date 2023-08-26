package com.example.practice.service;

import com.example.practice.model.Employee;

import java.util.List;

public interface IEmployeeService {
    public Employee addEmployee(Employee employee);
    public Employee updateEmployee(long id, Employee employee);

    public boolean deleteEmployee(long id);

    public List<Employee> getAllEmployee();
    public Employee getOneEmployee(long id);
}

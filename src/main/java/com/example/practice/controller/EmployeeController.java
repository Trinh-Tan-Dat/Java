package com.example.practice.controller;

import com.example.practice.model.Employee;
import com.example.practice.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private IEmployeeService iEmployeeService;

    @GetMapping("/")
    public String Test(){
        return "Test";
    }

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee){
        return iEmployeeService.addEmployee(employee);
    }

    @PutMapping("/update")
    public Employee updateEmployee(@RequestParam("id") long id, @RequestBody Employee employee){
        return iEmployeeService.updateEmployee(id, employee);
    }

    @DeleteMapping("/delete")
    public boolean deleteEmployee(@PathVariable("id") long id){
        return iEmployeeService.deleteEmployee(id);
    }

    @GetMapping("list")
    public List<Employee> getAllEmployee(){
        return iEmployeeService.getAllEmployee();
    }
}

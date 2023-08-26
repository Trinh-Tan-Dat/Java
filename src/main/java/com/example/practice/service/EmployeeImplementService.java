package com.example.practice.service;

import com.example.practice.model.Employee;
import com.example.practice.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeImplementService implements IEmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
//    public Employee addEmployee(Employee employee){
//        if(employee!=null){
//            return employeeRepository.save(employee);
//        }
//        return null;
//    }
    public Employee addEmployee(Employee employee){
        if(employee!=null){
            return employeeRepository.save(employee);
        }
        return null;
    }

    @Override
//    public Employee updateEmployee(long id,Employee employee){
//        if(employee !=null){
//            Employee employee1 = employeeRepository.getReferenceById(id);
//            if(employee1!=null){
//                employee1.setName(employee.getName());
//                employee1.setAddress(employee.getAddress());
//                return employeeRepository.save(employee1);
//            }
//        }
//        return null;
//    }
    public Employee updateEmployee(long id, Employee employee){
        if(employee!=null){
            Employee employee1 = employeeRepository.getReferenceById(id);
            if(employee1!=null){
                employee1.setAddress(employee.getAddress());
                employee1.setName(employee.getName());
                return employeeRepository.save(employee1);
            }
        }
        return null;
    }

    @Override
//    public boolean deleteEmployee(long id){
//        if(id >= 1){
//            Employee employee1 = employeeRepository.getReferenceById(id);
//            if(employee1!=null){
//                employeeRepository.delete(employee1);
//                return true;
//            }
//        }
//        return false;
//    }
    public boolean deleteEmployee(long id){
        if(id>=1){
            Employee employee = employeeRepository.getReferenceById(id);
            if(employee!=null){
                employeeRepository.delete(employee);
                return true;
            }
        }
        return false;
    }

    @Override
//    public List<Employee> getAllEmployee(){
//        return employeeRepository.findAll();
//    }
    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }

    @Override
//    public Employee getOneEmployee(long id){
//        return employeeRepository.getReferenceById(id);
//    }
    public Employee getOneEmployee(long id){
        return employeeRepository.getReferenceById(id);
    }

}

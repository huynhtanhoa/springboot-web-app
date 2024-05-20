package project.springboot.webapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import project.springboot.webapp.model.Employee;
import project.springboot.webapp.repository.EmployeeRepository;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
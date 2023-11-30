package com.example.WWW_week09.services;

import com.example.WWW_week09.models.Employee;
import com.example.WWW_week09.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public void createOrUpdate(Employee e){
        employeeRepository.save(e);
    }

    public Employee findById(long id){
        return employeeRepository.findById(id).get();
    }
}

package com.m.g.db.service;

import com.m.g.db.jpa.model.EmployeeEntity;
import com.m.g.db.jpa.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public void saveEmployee(EmployeeEntity employeeEntity)
    {
        employeeRepository.save(employeeEntity);
    }
}

package com.m.g.db.test;

import com.m.g.db.jpa.model.EmployeeEntity;
import com.m.g.db.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class TestEmployee {

    @Autowired
    EmployeeService employeeService;

    @PostConstruct
    public void createData()
    {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setEmployeeId("002");
        employeeEntity.setEmployeeName("Gui");
        employeeEntity.setEmployeeEmail("g@g.com");
        employeeEntity.setEmployeeAddress("RVP");
        employeeService.saveEmployee(employeeEntity);
        System.out.println("Successfully saved employee details");
    }
}

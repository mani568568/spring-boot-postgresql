package com.m.g.db.jpa.model;



import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Table(name = "employee")
public class EmployeeEntity implements Serializable {

    @Id
    @Setter
    @Column(columnDefinition = "employee_id")
    private String employeeId;

    @Column(columnDefinition = "employee_name")
    @Setter
    private String employeeName;

    @Column(columnDefinition = "employee_address")
    @Setter
    private String employeeAddress;

    @Column(columnDefinition = "employee_email")
    @Setter
    private String employeeEmail;

}
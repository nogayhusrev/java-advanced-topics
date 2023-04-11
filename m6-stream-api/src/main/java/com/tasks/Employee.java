package com.tasks;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class Employee {
    private int empId;
    private String empName;
    private String empEmail;
    private List<String> empPhoneNumbers;

}

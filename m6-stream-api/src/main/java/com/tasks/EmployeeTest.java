package com.tasks;

import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {


        //Print all the emails
        System.out.println("-----------Print all the emails---------------");
        EmployeeData.readAll()
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);

        //Print all phone numbers
        System.out.println("-----------Print all phone numbers---------------");
        EmployeeData.readAll()
                .flatMap(emp -> emp.getEmpPhoneNumbers().stream())
                .forEach(System.out::println);


        //Print all phone numbers with double colon
        System.out.println("-----------Print all phone numbers with double colon---------------");
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);


    }
}

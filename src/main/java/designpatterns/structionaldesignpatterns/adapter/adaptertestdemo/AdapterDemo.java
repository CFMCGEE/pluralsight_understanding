package designpatterns.structionaldesignpatterns.adapter.adaptertestdemo;

import java.util.*;

public class AdapterDemo {

    public static void main(String[] args) {

        EmployeeClient client = new EmployeeClient();

        List<Employee> employees = client.getEmployeeList();

        System.out.println(employees);

    }

}

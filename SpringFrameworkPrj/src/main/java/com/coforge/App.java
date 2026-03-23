package com.coforge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.beans.Employee;
import com.coforge.beans.HelloBean;
import com.coforge.beans.Customer;

public class App {
    public static void main(String[] args) {

        System.out.println("Hello World!");

        ApplicationContext context =
            new ClassPathXmlApplicationContext(
                new String[] {
                    "hello-bean.xml",
                    "emp-bean.xml",
                    "cust-bean.xml",
                    "customer-bean.xml"
                }
            );

        Employee emp = (Employee) context.getBean("emp");
        System.out.println(emp);

        Employee emp1 = (Employee) context.getBean("emp1");
        System.out.println(emp1);

        System.out.println(emp.hashCode());
        System.out.println(emp1.hashCode());

        Customer c1 = (Customer) context.getBean("cust");
        System.out.println(c1);

        Customer c2 = (Customer) context.getBean("customerByName");
        System.out.println(c2);

        Customer c3 = (Customer) context.getBean("customerByType");
        System.out.println(c3);

        Customer c4 = (Customer) context.getBean("customerByConstructor");
        System.out.println(c4);
    }
}
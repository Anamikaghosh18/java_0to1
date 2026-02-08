package spring.employee.componentsscan.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.employee.componenetscan.Employee;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.example.com.example.annotations");
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee.toString());

    }
}

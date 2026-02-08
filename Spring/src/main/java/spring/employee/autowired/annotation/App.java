package spring.employee.autowired.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("employee.autowired.annotation");
        Employee employee = context.getBean("employee", Employee.class);
        Manager manager = context.getBean("manager", Manager.class);
        System.out.println(employee.toString());
        System.out.println(manager.toString());

    }
}

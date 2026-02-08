package employee.componentsscan.annotations;

import employee.componenetscan.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.example.com.example.annotations");
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee.toString());

    }
}

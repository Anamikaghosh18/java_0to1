package spring.employee.autowired.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "employee.autowired.annotation")
public class AppConfig {

}

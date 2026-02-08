package employee.componentsscan.annotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "employee.componentsscan.annotations")
public class AppConfig {

}

package car.com.example.autowire.name.Car;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("AutowireByName.xml");

        Car car = (Car) context.getBean("myCar");
        car.display();
    }
}



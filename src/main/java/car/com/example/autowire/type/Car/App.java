package car.com.example.autowire.type.Car;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("AutowireByType.xml");

        Car car = (Car) context.getBean("myCar");

        car.display();
    }
}



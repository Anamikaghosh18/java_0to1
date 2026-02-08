package car.com.example.autowire.type.Car;

public class Car {

    private Specification specification;

    public Car() { }   // REQUIRED for Spring

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public void display(){
        System.out.println("Car Details: " + specification);
    }
}

abstract class Car{
    // we need abstract class to keep the abstract method 

    public abstract void drive();

    public void playMusic(){
        System.out.println("Play music");
    }
}

// need to define the abstrcat class in child class compulsion

class WagonR extends Car{ // concreate class 
    public void drive(){
        System.out.println("Driving....");
    }
}

public class Abstactdemo {
    public static void main(String[] args) {
        Car obj = new WagonR(); // we create object of concrete class

        obj.drive(); 

    }
}

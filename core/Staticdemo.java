class Mobile{
    public String brand ; 
    static String type ; 
    public int price ;
    
    public void show(){
        System.out.println(brand + ": " + price + ": " + type);
    }

    public static void show1(Mobile obj){
         System.out.println(obj.brand + ": " + obj.price + ": " + type);
    
        System.out.println("this is static method");
    }
}
public class Staticdemo {
    public static void main(String[] args) {
        // first calss is loaded then the object is instantiated. 

        // for static we need to load this only once not with each object ...

        // if we dont make any object the also we can use -> Class.forName("Mobile");

        Mobile m1 = new Mobile(); 
        m1.brand = "Apple"; 
        m1.price = 100000;
        m1.show();


        // Mobile.show()  -> not static cant be referenced without creating ana object 

        Mobile.show1(m1); // work

        // we can use static variables inside a static method 

        // we cant use a non static method inside a static method we need to paas the reference of the object ......


    }
}

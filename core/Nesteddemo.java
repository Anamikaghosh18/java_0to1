// Outer class - only public or private possible

class A{
    int age  ;

    public void show(){
        System.out.println("Inside A....");
    }
    // Inner class 
    // we can make the inner class as static or public or private 

    class B{
        public void config(){
            System.out.println("In config ....");
        }
    }
}
public class Nesteddemo {
    public static void main(String[] args) {
        A obj = new A()
        // anonymous class - no name 
        {
            public void show() {
                System.out.println("inside Annomous class");
            }
        };

        obj.show();

        A.B obj1 = obj.new B();
        obj1.config();
    }
}

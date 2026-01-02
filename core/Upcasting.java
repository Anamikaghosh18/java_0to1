class A{
    public void show(){
        System.out.println("Inside a");
    }

}
class B extends A {
    public void show1(){
        System.out.println("Inside B");
    }
}
public class Upcasting {
    public static void main(String[] args) {
        A obj = (A) new B();
        obj.show();
    }
}

package tools;
import tools.Calc;
class A{
    public void show(){
        System.out.println("Inside the democlass");
    }
}

public class Demo {
    public static void main(String[] args) {
        Calc c1 = new Calc();
        int r1 = c1.sum(10, 20); 
        System.out.println("sum: " + r1);
    }
}

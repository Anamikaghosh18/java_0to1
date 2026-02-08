@FunctionalInterface
interface Calculator{
    int add(int a , int b);
    
}
public class Lambdademo {
    public static void main(String[] args) {
        Calculator calc =(a, b) -> a + b ; 
        System.out.println(calc.add(2 , 3));
    }
}

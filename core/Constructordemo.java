class Demo{
    public Demo(){
        super(); // every class in java exends the Object class by default 
        System.out.println("Inside first");

    }
        public Demo(int n){
            System.out.println("Inside first with parameter");
        }
    
}
class Demo2 extends Demo{
    public Demo2(){
        super(); // this will be called first even without declaration
        System.out.println("Inside second");
    }
    public Demo2(int n){
        // super(n);  // call the constructor of the super class with parameter 

        this();  // this will call the constructor of the same class 
        
        System.out.println("Inside secodn with int");
    }
}

public class Constructordemo {
    public static void main(String[] args) {
        Demo2 d1 = new Demo2(5); 

    }
}

class A implements Runnable{
    public void run(){
        for(int i = 0 ; i < 20 ; i++){
        System.out.println("hi");
        try{
            Thread.sleep(10);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
}
class B implements Runnable{
     public void run(){
        for(int i = 0 ; i < 20 ; i++){
        System.out.println("hello");
        try{
            Thread.sleep(10);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
}

public class Threaddemo {
    public static void main(String[] args) {
        A obj1 = new A(); 
        B obj2 = new B(); 
        
        // thread priority
        Thread t1 = new Thread(); 
        Thread t2 = new Thread(); 

        // obj1.start(); 
        // obj2.start();
        t1.start();
        t2.start();
    }
}

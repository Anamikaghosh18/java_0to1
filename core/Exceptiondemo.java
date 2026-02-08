class myException extends Exception{
    public myException(String s){
        super(s);
    }
}
public class Exceptiondemo {
    public static void main(String[] args) {
        int i = 0 ; 
        int j = 0 ; 

        try{
            j = 18 / i ; 
            if(j ==0){
                throw new myException("I dont want to print zero");
            }
        }

        // exception is the super class and we have sub classes inside this 
        catch(myException e){
            System.out.println("cannot divide by zero" + e);
        }

        System.out.println(j);

        System.out.println("Byee");
    }
}

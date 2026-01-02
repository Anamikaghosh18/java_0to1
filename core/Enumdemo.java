enum Status{
    Running , Failed , Pending, Success;
}
public class Enumdemo {
    public static void main(String[] args) {
        Status ss = Status.Pending; 

        if(ss == Status.Running)
            System.out.println("Working....fine");
        else if(ss == Status.Pending)
            System.out.println("wait for sometime");
        else 
            System.out.println("Some error is there");
        
    }
}

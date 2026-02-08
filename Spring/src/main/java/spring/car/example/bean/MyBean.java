package spring.car.example.bean;

public class MyBean {
    private String message ;

    public void setMessage(String message) {
        this.message = message;
    }

    public  void showMessage(){
        System.out.println("message : "+ message);
    }

    @Override
    public  String toString(){
        return "MyBean {" +
                "Message '" + message + '\'' +
                '}';
    }


}

// Lifecycle of a Bean ----
// configured using Annotations , or XML
// Intantiation -> population of properties -> Initialization ->
 //   ready for use -> Destruction
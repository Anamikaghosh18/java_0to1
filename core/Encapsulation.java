class Human{
    private int age; 
    String name ; 
    public Human(){ // default constructor 

        age = 12 ; 
        name = "Vrishti";
    }

    public Human(int age , String name){ // parameterized constructor

        this.name = name;
        this.age = age ;
    }
    public void setAge(int a){
        this.age = a ; 
    }
    public int getAge(){
        return age ;
    }

}

public class Encapsulation {
    public static void main(String[] args) {
        Human h1 = new Human();
        //h1.age = 20 ; not eork that is private 
        h1.setAge(20);
        h1.name = "Anamika";  
        System.out.println(h1.name);
        System.out.println(h1.getAge());

        Human h2 = new Human(19, "Anaysha");

        System.out.println(h2.name + ": " + h2.getAge());
    }
}

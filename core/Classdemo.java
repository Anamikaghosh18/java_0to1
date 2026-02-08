class Computer{
    int num = 0 ; // instance variable - stored in heap
    public void playMusic(){
        System.out.println("playing music");
    }

    public int addNum(int num1, int num2){
        return num1 + num2;
    }
}

public class Classdemo {
    public static void main(String[] args) {
        // classes - like a blueprint
        Computer c1 = new Computer(); // c1 - reference object

        c1.playMusic();
        int sum = c1.addNum(8, 9);
        System.out.println("sum: " + sum);  
    }
}

class Calc{
    public int add(int num1 , int num2){
        return num1 + num2;
    }
    public int subtract(int num1 ,int num2){
        return num1 - num2;
    }
}
class advCalc extends Calc{
    public int square(int num){
        return num * num;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        advCalc cal1 = new advCalc();
        int sq = cal1.square(5);
        System.out.println("Square: " + sq);
        int add = cal1.add(8,10);
        System.out.println("add: "+ add);


    }
}

public class Operators {
    public static void main(String[] args) {
        int num1 = 7 ; 

        // pre increment -> first increment then assign the value 
        ++num1; 
        // post incremenet -> firt fetch the value then inc
        int result = num1++;
        System.out.println(result);

        int x = 6 ; 
        int y = 5 ; 
        boolean res = x > y ; 
        System.out.println(res);
    }
}

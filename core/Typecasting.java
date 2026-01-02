public class Typecasting {
    public static void main(String[] args) {

        
        // ******************* TYPE CASTING ********************

        byte b = 127 ; 
        int a = 256 ; 

        // --- EXPLICIT conversion ---
        b = (byte)a ; // wrong (large range to small range -> cant put a large box inside a small box)

         // How conversion works ????
        
        int num1 = 257 ; 
        byte k = (byte) num1; // result = num1 % range of datatype
        System.out.println(k);


        // --- IMPLICIT conversion ---
        a = b ;  // right (small range to large range) -> can put a small box into a large box


        
       




        
    }

}

import java.util.*; 

public class Collectiondemo {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList();

        // the values we are adding are objects
        nums.add(6);
        nums.add(10);

        for(Object n : nums){
            int num = (Integer) n ;

            System.out.println(num);
        }
    }
}

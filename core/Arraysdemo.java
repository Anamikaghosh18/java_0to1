class Student{
    int rollno ; 
    String name ; 
    int marks;
}
public class Arraysdemo {
    public static void main(String[] args) {
        int nums[][] = new int[3][4]; 

         
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 4 ; j++){
                nums[i][j] = (int)(Math.random() * 10);
            }
        }

        for(int i = 0 ; i < 3; i++){
            for(int j = 0 ; j < 4; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println("\n");
        }

        // jagged array -> when the number of columns are not same for each row.
        
        int arr[][] = new int[3][]; 
        arr[0] = new int[3]; 
        arr[1] = new int[4]; 
        arr[2] = new int[2]; 

        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 4 ; j++){
                nums[i][j] = (int)(Math.random() * 10);
            }
        }

        for(int i = 0 ; i < 3; i++){
            for(int j = 0 ; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("\n");
        }

        // array of objects
        Student s1 = new Student(); 
        s1.rollno = 1 ;
        s1.name = "Anamika";
        s1.marks = 99; 

        Student s2 = new Student(); 
        s2.rollno = 2 ;
        s2.name = "Anu";
        s2.marks = 95; 

        Student students[] = new Student[2];

        students[0] = s1 ; 
        students[1] = s2 ; 

        for(Student i : students){
            System.out.println(i.name + ": " + i.marks);
        }



        

    }
}

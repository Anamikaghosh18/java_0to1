import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Inputdemo {
    // println -> printstream no need to create object its created automatically 

    public static void main(String[] args) {
        System.out.println("enter the number: ");

        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);

        // int num = Integer.parseInt(bf.readLine());
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
    }
}

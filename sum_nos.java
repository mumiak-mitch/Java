//A program that calculates the sum of numbers as per the users input range
//necessary import
import java.util.Scanner;

public class sum_nos {

    //main method
    public static void main(String[] args) {

        //variable declaration
        int num1, num2, sum = 0;
        
        //input request
        Scanner sc = new Scanner(System.in);
        System.out.print("Sum from: ");
        num2 = sc.nextInt();
        
        System.out.print("Sum up to: ");
        num1 = sc.nextInt();
        
        //while loop
        while(num2 <= num1) {
            sum = sum + num2;
            num2++;
        }
        
        //output 
        System.out.println("Sum of Natural Numbers = " +sum);
    } 
}
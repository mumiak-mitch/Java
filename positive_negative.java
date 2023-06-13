//A program that determines whether a number is positive, negative or zero
//Necessary imports
import java.util.Scanner;

//Class definition
public class positive_negative {

    //Main method
    public static void main(String[] args) {

        //Variable
       int num;

       //input
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number: ");
       num = sc.nextInt();
       
       //Conditions
       if(num > 0) {
           System.out.println("The number is positive.");
       } else if(num < 0) {
           System.out.println("The number is negative.");
       } else {
           System.out.println("The number is zero.");
       }
    } 
}
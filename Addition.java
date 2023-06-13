//This is a program for adding two numbers
//Necessary imports used by the program
import java.util.Scanner;

//Class definition
public class addition {
    
    //Main method
    public static void main(String[] args) {

        //Variable declaration
        int x, y, sum;

        //Input request from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        x = sc.nextInt();
        
        System.out.print("Enter the second number: ");
        y = sc.nextInt();
        
        sum = sum(x, y);
        System.out.println("The sum is: " +sum);
    }
    
    //Sum function
    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
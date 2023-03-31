package sumofnos;

import java.util.Scanner;

public class SumofNos {
    public static void main(String[] args) {
        int num1, num2, sum = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Sum from: ");
        num2 = sc.nextInt();
        
        System.out.print("Sum up to: ");
        num1 = sc.nextInt();
        
        while(num2 <= num1) {
            sum = sum + num2;
            num2++;
        }
        
        System.out.println("Sum of Natural Numbers = " +sum);
    } 
}
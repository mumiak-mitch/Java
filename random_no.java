//A program that tests a user IQ by seeing if they can guess the number
//Necessary imports
import java.util.Random;
import java.util.Scanner;


public class Randomnumber {

    //main method
    public static void main(String[] args) {
        System.out.println("Hello!");
        System.out.println("What is your name?");
        
        //name input request
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello! " +name);
        
        //prompts the user to continue with the game
        System.out.println("Are you ready?");
        System.out.println("\t1.Yes");
        System.out.println("\t2.No");
        
        //prompts user to guess a number
        int answer = scanner.nextInt();
        
        while(answer != 1) {
            System.out.println("Are you ready?");
            System.out.println("\t1.Yes");
            System.out.println("\t2.No");
            
            answer = scanner.nextInt();
        }
        
        //generates a random number
        Random random = new Random();
        int x = random.nextInt(20) + 1;
        System.out.println("What number do you think it is?");
        int input = scanner.nextInt();
        
        int timesPlayed = 0;
        boolean won = false;
        boolean exit = false;
        
        //continuity of the game
        while(!exit) {
            timesPlayed++;
            
            if(timesPlayed < 5) {
                if(input == x) {
                    won = true;
                    exit = true;
                } else if(input > x) {
                    System.out.println("Please guess a lower number!");
                    input = scanner.nextInt();
                } else {
                    System.out.println("Please guess a higher number!");
                    input = scanner.nextInt();
                }
            } else {
                exit = true;
            }
        }
        
        //declares closure of the game
        if(won) {
            System.out.println("Congratulations! You won your " + timesPlayed + " guess.");
        } else {
            System.out.println("Game over!");
            System.out.println("The number was" +x);
        }
    }
}
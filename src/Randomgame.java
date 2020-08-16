import java.util.Random;
import java.util.Scanner;

public class Randomgame {

  public static void main(String[] args) {
    Random Random_number= new Random();
    int right_guess=Random_number.nextInt(100);
    int turns=1;
    int guess;
    Scanner scan=new Scanner(System.in);
    System.out.println("Guess a number between 1 to 100, You will have 10 turns!" );
    while(turns<=10)
    {
        System.out.println("enter the number.This is your "+turns+" turn");
        guess=scan.nextInt();
        if(guess==right_guess)
        {
            System.out.println("your guess is right");
            break;
        }
        else if(guess<right_guess)
        {
            System.out.println("your guess is lower");
            turns++;
        }
        else
        {
            System.out.println("your guess is higher");
            turns++;
            
        }
    }
    System.out.println("the number is "+right_guess);
        
    }
}
    
    
    
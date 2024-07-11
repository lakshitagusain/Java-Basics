import java.util.Random;
import java.util.Scanner;
public class challenge {
    public static void main(String... args)
    {
        System.out.println("\tWELCOME!\n    THE GUESSING GAME");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("\nEnter Your Name: ");
            String name = scanner.next();
            System.out.println("\tHello " + name);
            
            System.out.println("Should We Start the Game?\n Press 1 to Start and Press Any Other Key to Exit:");
            int ch = scanner.nextInt();
            if(ch == 1)
            {
                Random random = new Random();
                int ranNum = random.nextInt(20);
                for(int i = 0; i < 5; i++)
                {
                    System.out.println("Guess a number from 1 to 20");
                    int guessNum = scanner.nextInt();
                    if(guessNum == ranNum) 
                    {
                        System.out.println("!!!!CONGRATULATIONS!!!!\n!YOU WON!");
                        break;
                    }
                    else if(guessNum < ranNum)
                    {
                        System.out.println("Wrong Guess! Try Again with a Greater Number");
                    }
                    else
                    {
                        System.out.println("Wrong Guess! Try Again with a Smaller Number");
                    }
                }
                System.out.println("Number Was: " + ranNum);
                System.out.println("Game Over!");
            }
        }
    }
}
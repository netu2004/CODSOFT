import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
       int numAttempts=0;
       int score=0;
       boolean playAgain=true;
       Scanner scanner=new Scanner(System.in);
       while(playAgain){
        int randomNum=new Random().nextInt(100)+1;
        numAttempts=0;
        while(true)
        {
            System.out.print("Enter your guess(1-100):");
            int usrGuess=scanner.nextInt();
            if(usrGuess==randomNum){
                System.out.println("You have guessed correctly!");
                score++;
                break;
            }else if(usrGuess<randomNum){
                System.out.println("Very low!Try again");
            }else{
                System.out.println("Very high!Try again");
            }
            numAttempts++;
        }
        System.out.println("You want to play again?(y/n):");
        String playAgainIn=scanner.next();
        playAgain=playAgainIn.equalsIgnoreCase("y");
       }
       System.out.println("Score:"+score);

    }
}

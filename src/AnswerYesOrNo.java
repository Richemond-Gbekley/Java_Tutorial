import java.util.Scanner;
import java.util.Random;

public class AnswerYesOrNo{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Random myRandom = new Random();
        int randomNumber;
        System.out.println("Type your question, my child: ");
        myScanner.nextLine();
        randomNumber = myRandom.nextInt(10)+1;
        if (randomNumber > 5) {
            System.out.println("Yes. isnt it obvious?");
        }else{
            System.out.println("No. and dont ask again.");
        }
    }
}



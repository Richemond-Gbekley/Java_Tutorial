//Gbekley Kofi Richemond
//BS456102720
//CE2
import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min=2;
        int max=2;
        double myrandom=(int)(Math.random()*(max-min + 1)+min);
        System.out.println("Enter your desired number");
        int num=input.nextInt();


       if(num!=myrandom){
        do {
            System.out.println("try again");
            num= input.nextInt();
        }while(num!=myrandom);
       }
        if( num==myrandom) {
            System.out.println("You Win");
        }
        }

}








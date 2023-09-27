
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exception_handling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers");

        //int num1 = input.nextInt();
        //int num2 = input.nextInt();

        // if(num2!=0)
        //     System.out.println(num1 + "/" + num2 + " is :" + num1/num2);
        //else System.out.println("Cant divide by zero");

        try{
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            System.out.println(num1 + "/" + num2 + " is :" + num1/num2);
        }catch (ArithmeticException ex){
            System.out.println("Cant divide by zero , try another number");
        }catch (InputMismatchException ex){
            System.out.println("Enter an integer");
        }
    }
}


import java.util.Objects;
import java.util.InputMismatchException;
import  java.util.Scanner;
public class MTN_Service {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        boolean error= false;
        // int code = 0;


        System.out.println("Please dial *170#");
        String code = input.nextLine();
//             int code = input.nextInt();
        if (Objects.equals(code, "*170#"))
            System.out.println("Menu " + "\n" +
                    "1) Transfer Money" + "\n" +
                    "2) Momo pay & Pay bill" + "\n" +
                    "3) Airtime & Bundle" + "\n" +
                    "4) Allow Cash Out" + "\n" +
                    "5) Financial Services" + "\n" +
                    "6) My Wallet" + "\n" +
                    "7) Momo Promo ");
        else {
            System.out.println("Unknown Network");
            return;
        }

        do {

            try {


                System.out.println("Select Choice");
                choice = input.nextInt();
                //error = false;

                if (choice != 1) {
                    System.out.println("Incorrect choice ");
                    error = true;

                }

            } catch (InputMismatchException ex) {
                System.out.println("Incorrect choice, try again");
                error = true;


            }

        }


            while (error == true)   ;

//            for(int num = choice; num ==1;) {
//                System.out.println("Enter Mobile Number");
        if (choice == 1) {
               System.out.println("Enter Mobile Number");
                int num =input.nextInt();
            }
            }
        }


import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class MTN {
    public static void main(String[] args) {
        System.out.println("Please dial *170# to enjoy exciting offers.");
        Scanner input = new Scanner(System.in);

        int choice;

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
            System.out.println("Incorrect Choice");
            System.out.println("");
return;
        }
        while (true) {
            //do
            try {
                System.out.println("Select Choice");
                choice = input.nextInt();
            if (choice!=1) {
                do {
                    System.out.println("Incorrect choice, try again" + "\n" +
                            "1) Transfer Money" + "\n" +
                            "2) Momo pay & Pay bill" + "\n" +
                            "3) Airtime & Bundle" + " \n" +
                            "4) Allow Cash Out" + "\n" +
                            "5) Financial Services" + "\n" +
                            "6) My Wallet" + "\n" +
                            "7) Momo Promo ");
                    choice = input.nextInt();
                } while (choice!=1);
            }
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Incorrect choice, try again" + "\n" +
                        "1) Transfer Money" + "\n" +
                        "2) Momo pay & Pay bill" + "\n" +
                        "3) Airtime & Bundle" + " \n" +
                        "4) Allow Cash Out" + "\n" +
                        "5) Financial Services" + "\n" +
                        "6) My Wallet" + "\n" +
                        "7) Momo Promo ");
                input.next();
                continue;
            }}
            if (choice == 1) {
                System.out.println("TRANSFER MONEY"+"\n"+
                        "1)Momo User"+"\n"+
                        "2_Non Momo User" + "\n"+
                        "3 Send with Care"+"\n"+
                        "4Favourite"+"\n"+
                        "5) Other Network"+"\n"+
                        "6)Bank Account"+"\n"+
                        "0)Back");
                int num = input.nextInt();
            }
        }
    }


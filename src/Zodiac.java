import java.util.Scanner;

public class Zodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your year");
        int year = input.nextInt();
        int result = year % 12;

        switch (result) {
            case 0:
                System.out.println("Your animal is Monkey");
                break;
            case 1:
                System.out.println("Your animal is Rooster");
                break;
            case 2:
                System.out.println("Your animal is dog");
                break;
            case 3:
                System.out.println("Your animal is pig");
                break;
            case 4:
                System.out.println("Your animal is rat");
                break;
            case 5:
                System.out.print("Your animal is ox");
                break;
            case 6:
                System.out.println("Your animal is tiger");
                break;
            case 7:
                System.out.println("Your animal is rabbit");
                break;
            case 8:
                System.out.println("Your animal is dragon");
                break;
            case 9:
                System.out.println("Your animal is snake");
                break;
            case 10:
                System.out.println("Your animal is horse");
                break;
            case 11:
                System.out.println("Your animal is sheep");
                break;
            default:
                System.out.println("Zodiac");
        }
    }
}

import java.util.Scanner;
public class Leap_year {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter year");
        int year = input.nextInt();
        if (year % 4 == 0)
            System.out.println("Its a leap year" + year);



    }


}

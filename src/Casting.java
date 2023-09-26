import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class Casting {
    public static void main(String[] args){
        System.out.println("Welcome");
        Scanner input=new Scanner(System.in);
        System.out.println("I love you");
        System.out.println("Enter your first name");
        String name=input.nextLine();
        System.out.println("Enter your last name");
        String Lname=input.nextLine();
        System.out.println("Your name is "+name +" "+ Lname);

        System.out.println("Enter age ");
         int age =input.nextInt();
        System.out.println("You are  "+ age +"years old");


        System.out.println("Enter FIRST NUMber ");
        int fnum =input.nextInt();

        System.out.println("Enter second NUMber ");
        int snum =input.nextInt();

        int ans=snum+fnum;

        System.out.println("Your answer is " + ans);
        System.out.println("Enter Radius");
        double rad=input.nextDouble();
        double area=3.142*rad*rad;
        System.out.println("The area is " +area);

        System.out.println("Enter your height");
        double h= input.nextDouble();
        System.out.println("Enter your weight");
        double w= input.nextDouble();
        double BMI=w/h;
        System.out.println("Your BMI is " +BMI );



        }









    }

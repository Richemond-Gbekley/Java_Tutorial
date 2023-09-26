/*
import java.util.Scanner;
public class Tax {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println(" Welcome to CE2 tax system");
        System.out.println(" ");
        System.out.println("Please select the tax bracket you fall within ");
        System.out.println(" 1.Single" + "\n" +
                "2. Married and Filing Jointly or Qualifying widow(er)" + "\n"+
                "3. Married and Filing separately" + "\n"+
                "4.Head of Household ");
        int status= input.nextInt();
        //double income=input.nextDouble();
        if(status==1) {
            System.out.println("You filing as a single citizen ");
            System.out.println("");

           // System.out.println("Enter your income ");
            //double income=input.nextDouble();

            //if (income >0 && income <= 8350)
        }else if (status==2) {
            System.out.println("You filing as married jointly or Qualifying widow(er)");
            System.out.println(" ");
            System.out.println("Enter Your Income");
            double income = input.nextDouble();
            if(income>0 && income<=16700){
                System.out.println("Tax payable is $" + 0.1*income);
            }else if (income>16700 && income<=67900){
                System.out.println("Tax payable is $" + (0.1*16700)*0.15);
            }else if(income>67900 && income <=137050){
                System.out.println("Tax payable is $" + (0.1 * 16700 +(67900- 16700) * 0.15) + (income-67900) * 0.25);
            }else if(income>137050 && income <=208850){
                System.out.println("Tax payable is $" + (0.1 * 16700 + (67900-16700) * 0.15 + (137050-67900)*0.25 + (income-137050) *0.28));
            }else if(income>208850 && income<=372950){
                System.out.println("Tax payable is $" + (0.1 * 16700 +(67900-16700) *0.15 + (137050-67900) * 0.25 + (208850-137050) * 0.28 + (income-208850) * 0.33));
            }else if(income>=372951){
                System.out.println("Tax payable is $" + (0.1*16700 +(67900-16700) * 0.15 + (137050-67900) * 0.25 + (208850-137050) * 0.28 + (372950-208850)*0.33 + (income-372950) * 0.35) );
            }
        }else if (status==3) {
            System.out.println("You filing as married separatley");
        }else if(status==4) {
            System.out.println("You filing as Head of household");
        } else {
            System.out.println("sorry , wrong filing . Please try again");

        }
    }





    }

*/
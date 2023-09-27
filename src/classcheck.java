import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class classcheck {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Please enter your value for Advanced database ");
        double data = input.nextDouble();
        System.out.println("Enter credit hours");
        int Ahours= input.nextInt();
        System.out.println("Please enter your value for Java ");
        double java = input.nextDouble();
        System.out.println("Enter credit hours");
        int  Jhours =  input.nextInt();
        System.out.println("Please enter your value for Software Engineering ");
        double soft = input.nextDouble();
        System.out.println("Enter credit hours");
        int Shours = input.nextInt();
        System.out.println("Please enter your value for Signals and Sytem ");
        double sig = input.nextDouble();
        System.out.println("Enter credit hours");
        int Ehours = input.nextInt();
        System.out.println("Please enter your vale for Digital and Electronic System ");
        double dig = input.nextDouble();
        System.out.println("Enter credit hours");
        int Dhours = input.nextInt();
        System.out.println("Enter total number of credit hours");
        int total= input.nextInt();
        double CWA=(data*Ahours + java*Jhours + soft*Shours + sig*Ehours + dig*Dhours)/total;
        //double min_CWA = 0.0;
        //double max_CWA = 100;
        //double CWA = (double) (Math.random() * (max_CWA - min_CWA + 1) + min_CWA);
        //if (CWA >= 80.0) {
          //  System.out.println("First Class " +  "  " + CWA);
        //} else {
            //if ((70.0 <= CWA) && CWA < 80.0) {
             //   System.out.println("  Second Class " + "   " + CWA);
            //} else {
          //      if ((60.0 <= CWA) && CWA < 70.0) {
        //            System.out.println(" Second Class Lower "  + "  " +  CWA);
      //          } else {
    //                if ((50.0 <= CWA) && CWA < 60.0) {
  //                      System.out.println("Pass "  +  "  " +  CWA);
//
                  //  } else {
                //        if (CWA < 50.0) {
              //              System.out.println(" Fail " +  "   " + CWA);
            //            }
          //          }
        //        }
      //      }
    //    }
  //  }
//}


if (CWA >= 80.0) {
        System.out.println("First Class " +  "  " + CWA);
        } else {
        if ((70.0 <= CWA) && CWA < 80.0) {
        System.out.println("  Second Class " + "   " + CWA);
        } else {
        if ((60.0 <= CWA) && CWA < 70.0) {
        System.out.println(" Second Class Lower "  + "  " +  CWA);
        } else {
        if ((50.0 <= CWA) && CWA < 60.0) {
        System.out.println("Pass "  +  "  " +  CWA);

        } else {
        if (CWA < 50.0) {
        System.out.println(" Fail " +  "   " + CWA);
        }
        }
        }
        }
        }
        }
        }

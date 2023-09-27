import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        BMI myBMI = new BMI(); // USING THE CONSTRUCTOR TO INITIALIZE DATA FIELDS
        double BMIvalue = myBMI.calBMI();
        String BMIremarks = myBMI.remarks();

        System.out.println("Your BMI is " + BMIvalue +  " and " + BMIremarks);
        System.out.println("");
        Scanner input = new Scanner (System.in);
        double weight,height;
        System.out.println("Enter your weight and height");
        System.out.println("Enter Weight");
        weight =input.nextDouble();

        System.out.println("Enter your height");
        height=input.nextDouble();

        BMI myBMI2 = new BMI();
        myBMI2.setweight(weight);
        myBMI2.setheight(height);
        double BMI2 = myBMI2.calBMI();
        String BMI2remarks = myBMI2.remarks();

        System.out.println("Your BMI is " + BMI2 + "and " + BMI2remarks);
    }
}

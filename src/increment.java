public class increment {
    public static void main(String[] args) {

        int i=10;

        int y=i++ *10;

        System.out.println("your new value for i is " +i);
        System.out.println("your new value for y is " +y);


        //rounding numbers
        double num=45.565456879;
        System.out.println( "your answer is " + (Math.ceil(num)));
        System.out.println( "your answer is " + (Math.floor(num)));
        System.out.println( "your answer is " + (Math.round(num)));

        //time

        double time=4000;
        double minute= (int)(time/60);
        double seconds=(time%60);
        int hours=(int)(time/3600);
        System.out.println( "hours :" + hours + " Minutes: " + minute + " Seconds: " +seconds );



    }


}

/*operator     name
  ++var        preincrement (increases var by 1 and uses the new var value in the statement)
  var++        postincrement (increases var by 1 and uses the old var value in the statement)
  --var        predecrement (decreases var by 1 and uses the new var value in the statement)
  var--        postincrement (decreases var by 1 and uses the old var value in the statement)
ciel runs a number upwards to the nearest integer or whole number, regardless of the number after the point.
floor runs a number downwards to the nearest integer or whole number, regardless of the number after the point.
round runs a number to the nearest integer or whole number, considering the number after the point.
 */
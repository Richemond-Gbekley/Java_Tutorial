import java.util.Calendar;
public class LabSeven {



        public static void main(String[] args) {
            //get current time and date
            Calendar now = Calendar.getInstance();
            int hour = now.get(Calendar.HOUR_OF_DAY);
            int minute =now.get(Calendar.MINUTE);
            int month = now.get(Calendar.MONTH);
            int day = now.get(Calendar.DAY_OF_MONTH);
            int year = now.get(Calendar.YEAR);
            //display greetings
            if(hour<12){
                System.out.println("Good morning \n");
            }else if(hour<17){
                System.out.println("Good aternoon \n");
            }else {
                System.out.println("Good evening ");
            }
            //begin time message by showing the minutes
            System.out.println("It's");
            if(minute !=0){
                System.out.println(" "+minute+" ");
                System.out.println((minute !=1)? "minute ": "minute");
                System.out.println(" past");
            }
            //display the hour
            System.out.println(" ");
            System.out.println((hour > 12) ? (hour -12 ): hour);
            System.out.println("o'clock on");
            //display the of the month
            switch (month){
                case 1:
                    System.out.println("January ");
                    break;
                case 2:
                    System.out.println("February ");
                    break;
                case 3:
                    System.out.println("March ");
                    break;
                case 4:
                    System.out.println("April ");
                    break;
                case 5:
                    System.out.println("May ");
                    break;
                case 6:
                    System.out.println("June ");
                    break;
                case 7:
                    System.out.println("July ");
                    break;
                case 8:
                    System.out.println("August ");
                    break;
                case 9:
                    System.out.println("September ");
                    break;
                case 10:
                    System.out.println("October ");
                    break;
                case 11:
                    System.out.println("November ");
                    break;
                case 12:
                    System.out.println("December ");
                    break;
            }
            //display the date and year
            System.out.println(" "+day+", "+year+".");
        }


}

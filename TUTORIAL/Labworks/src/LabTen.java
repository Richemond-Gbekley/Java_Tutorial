public class LabTen {
    //DoWhile
        public static void main(String[] args) {
            int limit =20;//sum from 1 to this value
            int sum =0;  //Accumulate sum in this variable
            int i=1;     //loop counter

            do{
                sum +=i;
                i++;
            }while (i<=limit);
            System.out.println("Sum = "+sum);
        }
    }



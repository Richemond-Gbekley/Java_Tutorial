public class LabEleven {
    // Factorial
        public static void main(String[] args) {
            long limit = 20;//to calculate factorial of integer up to this value
            long factorial = 1;//factorial will be calculated in this variable
            // loop from 1 to the value of limit
    /*    for (int i = 1; i <= limit; i++) {
            factorial = 1;//initialize factorial
            for (int factor =2; factor <= i;factor++){
factorial*=factor;
            }
            System.out.println(i + "!"+" is "+factorial); System.out.println(i + "!"+" is "+factorial);
        }
        */
            //Replacing the nested loop
            for(int i=1;i<=limit;i++){
                factorial =1;
                int factor=2;
                while(factor<i){
                    factorial*=factor++;
                }
                System.out.println(i + "!"+" is "+factorial);
            }

        }


}

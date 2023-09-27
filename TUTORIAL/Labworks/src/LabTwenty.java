public class LabTwenty {
    // InitArray java
//Calculating values to be placed into elements of an array.



        public static void main(String[] args){

            final int ARRAY_LENGTH = 10; // declare constant
            int[] array = new int[ ARRAY_LENGTH]; // create array

// calculate value for each array etentert

            for (int counter = 0; counter<array.length; counter++)
                array [counter ]= 2 + 2* counter;

            System.out.printf("%s%8s\n", "Index", "Value" );

            //input each array element's value

            for (int counter = 0; counter < array.length; counter++)
                System.out.printf("%5d%8d\n", counter, array[counter ]);
        } // end main
    } // end class InilArray



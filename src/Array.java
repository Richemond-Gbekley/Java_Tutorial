//public class Array {
//}

import java.util.Scanner;
import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] mylist = new int[20];
//        mylist[0]=5;
//        mylist[1]=10;
//          //int[ ]mylist={1,22,5,4,6,7,8}
//        System.out.println(mylist[1]);
        //initialization
        for (int i = 0; i <= mylist.length -1; i++) {
            mylist[i] = (int) (Math.random() * 20);
        }

        //displayArray(mylist[1]);
        //display with a loop
        for (int i = 0; i < mylist.length; i++) {
            System.out.print(mylist[i] + "\t");
        }
        System.out.println("");

        //display with tostring
        System.out.println(Arrays.toString(mylist));

        //Return largest number in an array

        //Display with a method

        //Return largest and index of largest
        int[]myarray=list(mylist);
        System.out.println("The largest number is " + myarray[0] + " And it is found in " + myarray[1]);

        //cloning array

//        int[]numbers ={15,16,17,18,19 };
//        int[] mynumbers = myclone(numbers);
//        displayArray(mynumbers);

        System.out.println("");
        int[]sort = reorder(mylist);
        displayArray(sort);

    }
    public static void displayArray( int[]mylist){
        System.out.println("{");
        for(int i=0;i<mylist.length;i++){
            System.out.print(mylist[i]+ " ");
        }
        System.out.println("}");
    }
    public static int largest(int[]mylist){
        int largest=0;

        for(int i=0;i<mylist.length;i++){
            if(mylist[i]>largest){
                largest=mylist[i];
            }
            System.out.println(largest);
        }return largest ;}
    //Return index of Largest number
//             public static int indexofLargest(int[]mylist){
//        int index=0;
//        int largest=0;
//        for(int i=0;i<mylist.length;i++){
//            if (mylist[i])>largest){
//           largest=mylist[i];
//           index=i;
//
//            }}return index;
//
//             }
    public static int [] list (int[] mylist){
        int [] arraydetails = new int[2];

        arraydetails[0]=mylist[0];
        arraydetails[1]=0;

        for(int i=0;i<mylist.length;i++){
            if(mylist[i]>arraydetails[0]){
                arraydetails[0]=mylist[i];
                arraydetails[1]=i;
            }}


        return arraydetails;
    }

    //METHOD TO CLONE AN ARRAY
    public static int[]myclone (int[]mylist){
        int[]clone=new int[mylist.length];
        for(int i=0;i<mylist.length;i++){
            clone[i]=mylist[i];
        }
        return clone;
    }

    public static int[]reorder(int[]mylist){
        int[]list =myclone(mylist);

        for(int i=0;i<list.length;i++){
            int maxnum=1;
            for(int j=i+1;j<list.length;j++){
                if(list[j]>list[maxnum]){
                    maxnum=j;
                }
            }
            int largest=list[maxnum];
            list[maxnum]=list[i];
            list[i]=largest;

        }

        return list;
    }



}


//Richemond Gbekley
//BS456102720

public class Runner {
    public static void main(String[] args) {
        Stack nums = new Stack();
        nums.push(15);
        nums.show();
        nums.push(8);
        nums.show();
        nums.push(9);
        nums.show();
        nums.push(3);
        nums.show();
        nums.push(77);
        nums.show();
        nums.push(97);
        nums.show();

//nums.pop will only remove the value without making you see
       // System.out.println(nums.pop(); will remove the value and display the value removed from the top
        System.out.println(nums.pop());
        System.out.println(nums.pop());
        System.out.println(nums.pop());
        System.out.println(nums.pop());
        System.out.println(nums.pop());
        System.out.println(nums.pop());
        System.out.println(nums.pop());

        nums.show();
        System.out.println(" size is " + nums.size());
        System.out.println(" Empty " +nums.isEmpty() );

    }
}


//Richemond Gbekley
//BS456102720

public class Stack {
    int Stack[] = new int[5];
    int top = 0;


    public void push(int data) {
        if (top == 5) {
            System.out.println(" Stack Overflow");
        } else  {
            Stack[top] = data;
            top++;
        }
//        Stack [0] = data;
//        Stack [1] = data;
//        Stack [2] = data;
    }

    public int pop() {
       
       
            int data = 0;
        if (isEmpty()) {
            System.out.println("Stack Underflow");
        }else {
            top--;
            data = Stack[top];
            Stack[top] = 0;
        }
            return data;

        }
    public int size()
    {
        return top;
    }
    public boolean isEmpty()
    {
        return top <=0;
    }

    public void show()
    {
        for (int n : Stack)
        {
            System.out.println(n + " ");
        }
        {
            System.out.println();
        }
    }
}

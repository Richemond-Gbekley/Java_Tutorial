
public class LetterCheck {
    public static void main(String[] args) {
        char symbol = 'A';
        symbol = (char) (128.0 * Math.random());//Generate a random character
        if (symbol <= 'A') { //Is it A or greater?

            System.out.println("You have the capital letter " + symbol);
        } else {
            if (symbol >= 'Z') {//yes, and is it Z or less?
                //Then it is a capital letter

                System.out.println("You have the small letter " + symbol);
            } else {
                //it is not Z or less
                if (symbol <= 'a') {
                    //So is it a or greater ?

                    System.out.println("The code is greater than a letter but its not a letter ");
                } else {
                    if (symbol >= 'z') {//yes so it z or less ?
                        // Then is a small letter
                        //It is not less than z
                        System.out.println("The code is less than a but its not a letter");
                    } else {
                        System.out.println("The code is less than A so its not a letter ");
                    }
                }
            }
        }
    }
}






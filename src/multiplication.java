//BENNETT AWORTWE
//BS456102120



public class multiplication {
    public static void main(String[] args) {

        System.out.println("\t\t\t\t\t\t\t MULTIPLICATION  TABLE");

        System.out.println();
        {
            int i=1;
            while (i<14) {
                System.out.print("\t"+ i);
                i++;
            }
        }
        System.out.println("\n__________________________________________________________");
        int i=1;
        while (i<14) {
            System.out.print(i+ "|");
            int j=1;
            while (j<14) {
                System.out.print("\t"+i*j);
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println("\n");
        System.out.println("\t\t\t\t\t\t_______________________________");
        System.out.println("\t\t\t\t\t\t\t      YOU ARE SMART");
        System.out.println("\t\t\t\t\t\t_______________________________");
    }
}

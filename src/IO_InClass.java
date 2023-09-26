import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class IO_InClass {
    public static void main(String[] args) {
        File myfile = new File("FileClass.txt"); // CREATE A FILE
        try{
            if(myfile.exists())
                myfile.delete();
                System.out.println("File deleted");
           // }else
            System.out.println(myfile.createNewFile());
            System.out.println("New File created because file did not exists");

        }catch (IOException ex){
            System.out.println("File cannot be created ");

        }
        System.out.println(myfile.getAbsoluteFile());
        try {
            PrintWriter writetoFile =new PrintWriter(myfile);

            writetoFile.println("FIRSTNAME\t" + " LASTNAME\t" + "Fav Car\t"+ "Age\t");
          writetoFile.println("Deborah\t" + " Agbenyo\t" + "Ferrai\t"+"18");
             writetoFile.println("Esther\t" + " Amoo\t" + "Jeep\t"+"19");
             writetoFile.println("Dan\t" + " Grey\t" + "Benz\t"+"22");



            writetoFile.close();

        }catch(FileNotFoundException ex){
            System.out.println("Cant find file");

        }

        try {
            Scanner readFile = new Scanner(myfile);
            while (readFile.hasNext()) {

                String firstname = readFile.next();
                String lastname = readFile.next();
                String phonenumber = readFile.nextLine();
                String Age = readFile.nextLine();


                System.out.println(firstname+"\t\t\t\t"+lastname+"\t\t\t"+"\t\t\t"+phonenumber + Age+"\t\t\t");
            }
            readFile.close();
        }catch (FileNotFoundException ex) {
            System.out.println("Cant find file");

        }catch(InputMismatchException ex){
            System.out.println("enter an integer");

            }
        }



    }



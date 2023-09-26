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

            writetoFile.println("FIRSTNAME\t" + " LASTNAME\t" + "phonenumber\t"+ "Age\t");
          writetoFile.println("Deborah\t" + " Agbenyo\t" + "0257420075\t"+"18");
//
//
//                    writetoFile.print("Deborah Agbenyo ");
//            writetoFile.println("18");
//                    writetoFile.println("0257420075");
//
//                    writetoFile.print("Esther Amoo ");
//                    writetoFile.println("0551144778");
//
//                    writetoFile.print("Richemond Gbekley ");
//                    writetoFile.println("05588445695");
//
//            writetoFile.print("Abubakar Abdullah ");
//             writetoFile.println("05588748415");
//
//            writetoFile.print("Acquah George ");
//             writetoFile.println("0550226950");
//
//            writetoFile.print("Addae Oliver ");
//            writetoFile.println("055022658");
//
//            writetoFile.print("Addae Samuel ");
//            writetoFile.println("0244854751");
//
//            writetoFile.print("Addai Saviour ");
//            writetoFile.println("0244859675");
//
//            writetoFile.print("Addo Richard ");
//            writetoFile.println("02784512585");
//
//            writetoFile.print("Ahmed Haruna ");
//            writetoFile.println("05448458125");
//
//            writetoFile.print("Amalatey Sedem ");
//            writetoFile.println("027589632");
//
//            writetoFile.print("Amponsah Festus ");
//            writetoFile.println("0558899441");
//
//            writetoFile.print("Amponsah Louis ");
//            writetoFile.println("0556611248");
//
//            writetoFile.print("Amuah Kweku ");
//            writetoFile.println("0244965841");
//
//            writetoFile.print("Anumba Julius ");
//            writetoFile.println("02148412952");
//
//            writetoFile.print("Anumu Yaa ");
//            writetoFile.println("0558896648");
//
//            writetoFile.print("Appiah Paul ");
//            writetoFile.println("0584654561");
//
//            writetoFile.print("Arthur Seth ");
//            writetoFile.println("0509584577");
//
//            writetoFile.print("Asiedu Charles ");
//            writetoFile.println("0509581264");
//
//            writetoFile.print("Atuahene Philimon ");
//            writetoFile.println("0509584562");
//
//            writetoFile.print("Awaals Ilham ");
//            writetoFile.println("0509584127");
//
//            writetoFile.print("Awortwe Bennett ");
//            writetoFile.println("0509584526");
//
//            writetoFile.print("Baidoo Philip ");
//            writetoFile.println("0509584512");
//
//            writetoFile.print("Donkor Aaron ");
//            writetoFile.println("0554425516");
//
//            writetoFile.print("Edorh Selby ");
//            writetoFile.println("0509586251");
//
//            writetoFile.print("Eshun Angela ");
//            writetoFile.println("0509581712");
//
//            writetoFile.print("Essien Jeffery ");
//            writetoFile.println("0509584627");
//
//            writetoFile.print("Gyan Kingsley ");
//            writetoFile.println("0509584126");
//
//            writetoFile.print("Isahq Maimuna ");
//            writetoFile.println("05095847132");
//
//            writetoFile.print("Mark Spencer ");
//            writetoFile.println("0509584641");
//
//            writetoFile.print("Nana Kofi ");
//            writetoFile.println("0500124170");
//
//            writetoFile.print("Owusu Stephen ");
//            writetoFile.println("05501144848");
//
//            writetoFile.print("Quatson Sherif ");
//            writetoFile.println("0509586214");
//
//            writetoFile.print("Qwaw Daniel ");
//            writetoFile.println("05095845271");
//
//            writetoFile.print("Sarpong Sandra ");
//            writetoFile.println("05095287788");
//
//            writetoFile.print("Seidu Jude ");
//            writetoFile.println("0244151548");
//
//            writetoFile.print("Thompson Emmanuel ");
//            writetoFile.println("0550221478");



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



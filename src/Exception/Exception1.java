package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exception1 {
    public static void main(String[] args) throws IOException {
        try{
            String str = "this is Raju";
            char c = str.charAt(20);
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println(e);
        }

        System.out.println("Hello world");
        FileReader fr = null;
        try {

            // Following file does not exist
            File file = new File("C://IO/file.txt");

             fr = new FileReader(file);


        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        }
        finally {
            fr.close();
        }

        try {
            int num = Integer.parseInt ("akki");
        } catch (NumberFormatException e) {
            System.out.println(e);
        }

        try{
            int a[] = new int[5];
            a[6] = 9; // accessing 7th element in an array of
            // size 5
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println ("Array Index is Out Of Bounds");
        }
    }
}

import java.io.*;
import java.util.Scanner;

public class Filehandling {
    public static void main(String[] args) {
        String filename = null;

        try{
            File myfile = new File("DEMO");
            if (myfile.createNewFile()) {
                System.out.println("File created: " + myfile.getName());
            }

            FileWriter write = new FileWriter(myfile);
            write.write("Hello World");
            write.close();

            BufferedReader read = new BufferedReader(new FileReader(myfile));
            String data;
            while ((data = read.readLine()) != null) {
                System.out.println(data);
            }
            read.close();
            }


        }

    }
}
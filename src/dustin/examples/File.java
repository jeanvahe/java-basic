package dustin.examples;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException; 

public class File
{
    public static void readAndWrite()
    {
        try {
            StringBuffer sb= new StringBuffer("");

            FileWriter writer = new FileWriter("test2.txt");
            BufferedWriter bw = new BufferedWriter(writer);

            bw.write(sb.toString());

            bw.close();
            writer.close();

            FileReader reader = new FileReader("test.txt");
            BufferedReader br = new BufferedReader(reader);
            String str = null;

            while((str = br.readLine()) != null) {
                sb.append(str+"/n");
                System.out.println(str);
            }
            br.close();
            reader.close();

        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        catch(IOException e) {

            e.printStackTrace();

        }

    }
}


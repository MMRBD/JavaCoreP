package JavaIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author mokle
 */
public class BufferReaderEx {

    public static void main(String[] args) {
        brWrite();
        try {
            BufferedReader br = new BufferedReader(new FileReader("e:\\newFile.txt"));
            String curentString;
            while ((curentString = br.readLine()) != null) {
                System.out.println(curentString);

            }
            br.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    static void brWrite() {
        try {
            File file = new File("e:\\newFile.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Hi I am here. Are You?");
            bw.newLine();
            bw.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

package JavaIO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 *
 * @author mokle
 */
public class BufferReaderStream {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("e:/f.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);

            int i;
            while ((i = bis.read()) != -1) {
                System.out.print( (char)i);
            }
            bis.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

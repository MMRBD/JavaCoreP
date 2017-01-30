package JavaIO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/**
 *
 * @author mokle
 */
public class BufferWriterStreem {

    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("e:\\f.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        String s = "HI This is BufferedOutputStream";
        byte[] bs = s.getBytes();

        bos.write(bs);

        bos.flush();
        bos.close();
        System.out.println("Success");

    }
}

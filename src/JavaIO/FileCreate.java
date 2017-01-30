package JavaIO;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author mokle
 */
public class FileCreate {

    public static void main(String[] args) {

        try {
            File file = new File("e:/a.doc");
            if (file.createNewFile()) {
                System.out.println("File is created.");
            }else{
                System.out.println("File does not Exist");
            }
        } catch (IOException ex) {

        }
    }
}

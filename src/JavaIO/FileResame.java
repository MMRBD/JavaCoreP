package JavaIO;

import java.io.File;

/**
 *
 * @author mokle
 */
public class FileResame {

    public static void main(String[] args) {
        try {
            File file = new File("e:/a.doc");
            File newFile = new File("e:/ab.doc");
            
            if(file.renameTo(newFile)){
                System.out.println("File Resame");
            }else{
                System.out.println("Does not Exist");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

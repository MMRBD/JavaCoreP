package JavaIO;

import java.io.File;

/**
 *
 * @author mokle
 */
public class FileDelete {
    public static void main(String[] args) {
        try{
            File file = new File("e:/ab.doc");
            
            if(file.delete()){
                System.out.println(file.getName()+" is deleted");
            }else{
                System.out.println("Does not Exist");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}

package JavaIO;

import java.io.File;

/**
 *
 * @author mokle
 */
public class Basic {

    public static void main(String[] args) {
        
        File file = new File("/java/COPYRIGHT");

        p("File Name: " + file.getName());
        p("Path: " + file.getPath());
        p("Abs path: " + file.getAbsolutePath());
        p("Parents: " + file.getParent());
        p(file.exists() ? "EXISTS" : "Dose not EXISTS");
        p(file.canWrite() ? "Is writable" : "Is not writable");
        p(file.canRead() ? "Is readable" : "Is not Readble");
        p("is" + (file.isDirectory() ? "" : " Not" + " a directory"));
        p(file.isFile() ? "Is normal file" : "Might bve name pope");
        p(file.isAbsolute() ? "is absulate" : "Is not absulate");
        p("File last modified: " + file.lastModified());
        p("File size: " + file.length() + "Byte");

    }

    static void p(String s) {
        System.out.println(s);
    }
}

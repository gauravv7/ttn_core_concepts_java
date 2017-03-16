package coreConcepts.Question9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by gaurav on 15/3/17.
 */
public class Question9 {


    public static void main(String[] args) throws IOException {
        Question9.prepareFile();

        System.out.println(Question9.readFile());
    }

    public static void prepareFile() throws IOException {
        String source = "this is a line.\n" +
                "this is another line.";
        FileOutputStream fout = new FileOutputStream("abc.txt");
        fout.write(source.getBytes());
    }

    public static String readFile() throws IOException {
        FileInputStream fis = new FileInputStream("abc.txt");

        StringBuilder sb = new StringBuilder();
        int ch;
        while((ch = fis.read()) != -1){
            sb.append((char)ch);
        }

        return sb.toString();
    }
}

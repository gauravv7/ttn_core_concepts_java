package IOReflection.Question1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/**
 * Created by gaurav on 16/3/17.
 */
public class Question1 {
    public static void main(String[] args) throws IOException {
        File sourceFile = new File("abc.txt");
        File destFile = new File("def.txt");

        prepareFile(sourceFile);
        copyFileUsingChannel(sourceFile, destFile);
    }

    public static void prepareFile(File sourceFile) throws IOException {
        FileOutputStream fout = null;

        try{
            fout = new FileOutputStream(sourceFile);
            fout.write("this is a test file".getBytes());
        } finally {
            if(fout!=null) fout.close();
        }
    }

    public static void copyFileUsingChannel(File source, File dest) throws IOException {
        FileChannel sourceChannel = null;
        FileChannel destChannel = null;
        try {
            sourceChannel = new FileInputStream(source).getChannel();
            destChannel = new FileOutputStream(dest).getChannel();
            destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
        }finally{
            if(sourceChannel!=null) sourceChannel.close();
            if(destChannel!=null) destChannel.close();
        }
    }
}

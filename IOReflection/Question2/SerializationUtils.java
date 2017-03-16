package IOReflection.Question2;

import java.io.*;

/**
 * Created by gaurav on 16/3/17.
 */
public class SerializationUtils {

    // deserialize to Object from given file
    public static Object deserialize(String fileName) throws IOException,
            ClassNotFoundException {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        Object obj = null;
        try{
            fis = new FileInputStream(fileName);
            ois = new ObjectInputStream(fis);
            obj = ois.readObject();
        } finally {
            ois.close();
        }
        return obj;
    }

    // serialize the given object and save it to file
    public static void serialize(Object obj, String fileName)
            throws IOException {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            fos = new FileOutputStream(fileName);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
        } finally {
            if(fos!=null) fos.close();
            if(oos!=null) oos.close();
        }
    }
}

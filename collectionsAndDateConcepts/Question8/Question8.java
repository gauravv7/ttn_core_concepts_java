package collectionsAndDateConcepts.Question8;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by gaurav on 15/3/17.
 */
public class Question8 {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMMM-yyyy");
        String s = formatter.format(new Date());
        System.out.println(s);
    }
}

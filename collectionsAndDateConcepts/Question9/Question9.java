package collectionsAndDateConcepts.Question9;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by gaurav on 15/3/17.
 */
public class Question9 {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println("today is "+ d1.toString());
        Locale[] locales = DateFormat.getAvailableLocales();
        for(Locale loc: locales) {
            DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, loc);
            System.out.println("today is in "+loc.getDisplayLanguage()+"  in "+loc.getDisplayCountry()+" Format : " + df.format(d1));
        }
    }
}

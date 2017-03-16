package collectionsAndDateConcepts.Question5;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by gaurav on 15/3/17.
 */
public class Question5 {

    public static void main(String[] args) {
        ArrayList<Student> stds = new ArrayList<>();
        stds.add(new Student("abc", 28, 20));
        stds.add(new Student("efg", 29, 21));
        stds.add(new Student("abc", 28, 22));


        Collections.sort(stds, new StudentMultipleComparator(
                new StudentScoreComparator(),
                new StudentNameComparator()
        ));

        for(Student s : stds){
            System.out.println(s);
        }
    }



}

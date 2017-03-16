package collectionsAndDateConcepts.Question5;

import java.util.Comparator;

/**
 * Created by gaurav on 15/3/17.
 */
public class StudentScoreComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return (int) (o1.getScore()-o2.getScore());
    }
}

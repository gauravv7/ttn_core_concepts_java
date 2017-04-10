package collectionsAndDateConcepts.Question5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by gaurav on 15/3/17.
 */
public class StudentMultipleComparator implements Comparator<Student> {
    private List<Comparator<Student>> listComparators;

    @SafeVarargs
    public StudentMultipleComparator(Comparator<Student>... comparators) {
        this.listComparators = Arrays.asList(comparators);
    }

    @Override
    public int compare(Student emp1, Student emp2) {
        for (Comparator<Student> comparator : listComparators) {
            int result = comparator.compare(emp1, emp2);
            if (result != 0) {
                return result;
            }
        }
        return 0;
    }


}

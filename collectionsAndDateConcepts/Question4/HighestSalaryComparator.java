package collectionsAndDateConcepts.Question4;

import java.util.Comparator;

/**
 * Created by gaurav on 16/3/17.
 */
public class HighestSalaryComparator implements Comparator<Employee> {
    public int compare(Employee o1, Employee o2) {
        return o2.getSalary()-o1.getSalary();
    }
}
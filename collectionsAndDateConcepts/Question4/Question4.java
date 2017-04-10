package collectionsAndDateConcepts.Question4;

import java.util.Arrays;

/**
 * Created by gaurav on 16/3/17.
 */
public class Question4 {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("ashutosh", 30000, 20),
                new Employee("nisha", 50000, 22),
                new Employee("ravi", 40000, 21),
                new Employee("sampark", 40000, 23),
                new Employee("ashima", 50000, 21),
        };

        Arrays.sort(employees, new HighestSalaryComparator());
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}

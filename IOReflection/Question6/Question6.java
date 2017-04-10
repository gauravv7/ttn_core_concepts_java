package IOReflection.Question6;

import IOReflection.Question6.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by gaurav on 16/3/17.
 */
public class Question6 {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("nik", 27));
        employees.add(new Employee("neha", 22));
        employees.add(new Employee("abc", 30));

        employees = (ArrayList<Employee>) employees.stream().filter(employee -> employee.getName().toLowerCase().startsWith("n") && employee.getAge()>24).collect(Collectors.<Employee>toList());
        for (Employee e: employees){
            System.out.println(e);
        }
    }

}

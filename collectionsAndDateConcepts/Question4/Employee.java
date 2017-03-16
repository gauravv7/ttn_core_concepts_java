package collectionsAndDateConcepts.Question4;

import java.util.Comparator;

/**
 * Created by gaurav on 16/3/17.
 */
public class Employee {

    private String name;
    private int age;
    private int salary;

    public Employee(String name,int salary,int age) {
        this.name=name;
        this.salary=salary;
        this.age=age;
    }

    public int getAge() { return this.age;}

    public int getSalary() {return this.salary;}

    public String getName() {return this.name;}

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}




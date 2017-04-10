package IOReflection.Question2;

import java.io.IOException;

/**
 * Created by gaurav on 16/3/17.
 */
public class Question2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee emp = new Employee("abc", 1);
        SerializationUtils.serialize(emp, "emp1.txt");
        Employee deserialize = (Employee) SerializationUtils.deserialize("emp1.txt");
        if(deserialize.getClass() == emp.getClass()) System.out.println("Same class object deserialized");
        System.out.println(deserialize);
    }
}

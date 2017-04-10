package IOReflection.Question3;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by gaurav on 16/3/17.
 */
public class Question3 {
    public static void main(String[] args) {

        for (Field f: new Employee().getClass().getDeclaredFields()){
            System.out.println("Field: "+f.getName()+", of type: "+ f.getType());
        }

        for(Method m : Employee.class.getDeclaredMethods()){
            System.out.println("Method: "+m.getName()+", of type: "+ m.getReturnType());
        }
    }
}

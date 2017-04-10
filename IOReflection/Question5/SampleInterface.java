package IOReflection.Question5;

/**
 * Created by gaurav on 16/3/17.
 */
public interface SampleInterface {

    default void print(String str) {
        if (!isNull(str))
            System.out.println("Sample Interface Print::" + str);
    }

    static boolean isNull(String str) {
        System.out.println("Interface Null Check");

        return str == null ? true : "".equals(str) ? true : false;
    }
}
package coreConcepts.Question11;

/**
 * Created by gaurav on 16/3/17.
 */
public class Question11 {
    public static void main(String[] args) {
        SimpleUtils simpleUtils = new SimpleUtils();
        System.out.println(simpleUtils.add(1, 2));
        System.out.println(simpleUtils.add(11.2f, 22.3f));
        System.out.println(simpleUtils.multiply(1, 2));
        System.out.println(simpleUtils.multiply(11.2f, 22.3f));
        System.out.println(simpleUtils.concat("hello", "world"));
        System.out.println(simpleUtils.concat("hello", "world", "user"));
    }
}

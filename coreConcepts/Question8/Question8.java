package coreConcepts.Question8;

/**
 * Created by gaurav on 15/3/17.
 */
public class Question8 {
    public static void main(String[] args) {
        String source = "1234567890";
        StringBuffer sb = new StringBuffer(source);
        sb.reverse();
        sb.replace(4, 9, "");
        System.out.println(source);
        System.out.println(sb.toString());
    }
}

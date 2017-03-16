package coreConcepts.Question1;

/**
 * Created by gaurav on 15/3/17.
 */
public class Question1 {

    public static void main(String[] args) {

        String sourceString = "abcdefgh";
        String target = "ejkl";
        String replaceWith = "ijkl";

        System.out.println("Initial String: " + sourceString);
        String finalString = sourceString.replace(target, replaceWith);
        System.out.println("Final String: " + finalString);

    }

}

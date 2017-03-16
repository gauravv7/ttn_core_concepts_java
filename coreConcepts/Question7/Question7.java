package coreConcepts.Question7;

/**
 * Created by gaurav on 15/3/17.
 */
public class Question7 {


    public static int AGE = 24;
    static{
        System.out.println("FirstName");
    }
    public static void main(String[] args) {
        Question7.printLastName();
        System.out.println(Question7.AGE);
    }

    public static void printLastName() {
        System.out.println("LastName");
    }
}

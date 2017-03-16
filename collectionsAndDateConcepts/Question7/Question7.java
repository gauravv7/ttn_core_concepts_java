package collectionsAndDateConcepts.Question7;

/**
 * Created by gaurav on 15/3/17.
 */
public class Question7 {
    public static void main(String[] args) {
        SpecialStack<Integer> ss = new SpecialStack<>();

        ss.add(-1);
        ss.add(2);
        ss.add(3);
        ss.add(4);
        ss.add(0);

        System.out.println(""+ss.min());
    }
}

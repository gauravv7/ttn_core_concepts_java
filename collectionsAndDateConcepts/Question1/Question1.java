package collectionsAndDateConcepts.Question1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by gaurav on 16/3/17.
 */
public class Question1 {
    public static void main(String[] args) {
        ListHelper listHelper = new ListHelper();
        Scanner sc = new Scanner(System.in);
        ArrayList<Float> arr = new ArrayList<>();
        System.out.println("Enter 5 Float Values");
        for (int i = 0; i < 5; i++) {
            arr.add(sc.nextFloat());
        }
        listHelper.addFloats(arr);
        System.out.println("Sum of above sequence: " + listHelper.getSum());
    }
}

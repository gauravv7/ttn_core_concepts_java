package collectionsAndDateConcepts.Question2;

import java.util.HashSet;

/**
 * Created by gaurav on 16/3/17.
 */
public class Question2 {
    public static void main(String[] args) {
        System.out.println("Number of Unique Character count: "+ getUniqueCharCount("aaabcdhd!2@#"));
    }

    public static int getUniqueCharCount(String s) {
        char arr[] = s.toCharArray();
        HashSet<Character> freq = new HashSet<Character>();
        for (char c: arr) {
            freq.add(c);
        }

        return freq.size();
    }
}

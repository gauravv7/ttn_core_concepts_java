package coreConcepts.Question3;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by gaurav on 15/3/17.
 */
public class Question3 {
    public static void main(String[] args) {
        String sourceString = "aaaaaabcdbdb";


        for (Map.Entry<Character, Integer> e: getCharacterCount(sourceString).entrySet()){
            System.out.println("character is: "+e.getKey()+" ;having occurence: "+e.getValue());
        }
    }

    public static HashMap<Character, Integer> getCharacterCount(String sourceString){
        HashMap<Character, Integer> hmap = new HashMap<>();
        for (char ch: sourceString.toCharArray()) {
            if(hmap.containsKey(ch)){
                hmap.put(ch, hmap.get(ch)+1);
            } else{
                hmap.put(ch, 1);
            }
        }
        return hmap;
    }
}

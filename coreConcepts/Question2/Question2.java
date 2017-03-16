package coreConcepts.Question2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by gaurav on 15/3/17.
 */
public class Question2 {

    public static void main(String[] args) {
        String sourceString = "abcd abcd efgh efgh ijkl";


        for (Map.Entry<String, Integer> e: getDuplicateWordCount(sourceString).entrySet()){
            if(e.getValue()>1){
                System.out.println("Word is: "+e.getKey()+" ;having occurence: "+e.getValue());
            }
        }
    }

    public static HashMap<String, Integer> getDuplicateWordCount(String sourceString){
        HashMap<String, Integer> hmap = new HashMap<>();
        for (String word : sourceString.split("\\s")) {
            if(hmap.containsKey(word)){
                hmap.put(word, hmap.get(word)+1);
            } else{
                hmap.put(word, 1);
            }
        }
        return hmap;
    }
}

package collectionsAndDateConcepts.Question6;

import java.util.Comparator;
import java.util.Map;

/**
 * Created by gaurav on 16/3/17.
 */
class FrequencySort implements Comparator<Map.Entry<Integer, Integer>>
{


    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2){
        return o2.getValue().compareTo(o1.getValue());
    }

}
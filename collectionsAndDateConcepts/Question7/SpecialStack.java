package collectionsAndDateConcepts.Question7;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by gaurav on 15/3/17.
 */
public class SpecialStack<T> extends Stack<T> {

    public <T extends Comparable<T>> T min(){
        Iterator<T> iter = (Iterator<T>) this.listIterator();
        T min = null;
        while(iter.hasNext()){
            T t = iter.next();
            if (t != null && (min == null || t.compareTo(min) < 0)) {
                min = t;
            }
        }
        return min;
    }


}
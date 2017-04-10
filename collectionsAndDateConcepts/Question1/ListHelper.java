package collectionsAndDateConcepts.Question1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Created by gaurav on 16/3/17.
 */
public class ListHelper {
    private ArrayList<Float> list = new ArrayList<>();
    private float sum=0;

    public void addFloats(ArrayList<Float> arr) {
        list.addAll(arr);
    }

    public float getSum(){
        Iterator<Float> iter = list.iterator();
        float sum = 0f;
        while(iter.hasNext()){
            sum += iter.next();
        }
        return sum;
    }
}

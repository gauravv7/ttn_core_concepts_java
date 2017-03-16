package collectionsAndDateConcepts.Question6;

import java.util.*;

/**
 * Created by gaurav on 16/3/17.
 */
public class Question6 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 1, 1, 1, 2, 3};

        printArray(arr);

        // preparing list for sort by value on preparedFrequencyMap
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<Map.Entry<Integer, Integer>>
                (prepareFrequencyMap(arr).entrySet());

        Collections.sort(entryList,new FrequencySort());

        // recollecting the final keys to print
        int index=0;
        for (Map.Entry<Integer, Integer> entry : entryList) {
            for (int i = 0; i < entry.getValue(); i++) {
                arr[index++] = entry.getKey();
            }
        }

        System.out.println();
        System.out.println("Elements after getting sorted in order of decreasing frequency:");
        printArray(arr);

    }


    // natural sorting on the basis of frequency
    public static TreeMap<Integer, Integer> prepareFrequencyMap(int[] arr){
        TreeMap<Integer,Integer> freq=new TreeMap<Integer, Integer>();

        for(int i=0;i<arr.length;i++) {
            if(freq.get(arr[i])==null) {
                freq.put(arr[i],1);
            }else {
                int count=freq.get(arr[i]);
                freq.put(arr[i],count+1);
            }
        }
        return freq;
    }

    public static void printArray(int[] arr){
        for (int i: arr){
            System.out.print(i + " ");
        }
    }
}

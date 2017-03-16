package coreConcepts.Question6;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by gaurav on 15/3/17.
 */
public class Question6 {

    public static void main(String[] args) {
        int[] i1 = {12, 1, 12, 3, 12, 1, 1, 2, 3, 2, 2, 3, 7}; // single occurence is 7

        System.out.println(getSingle(i1));
    }


    protected static int getSingle(int[] arr) {
        // Initialize result
        int result = 0;

        int x, sum;

        // Iterate through every bit
        for (int i = 0; i < Integer.BYTES*8; i++)
        {
            // Find sum of set bits at ith position in all
            // array elements
            sum = 0;
            x = (1 << i);
            for (int j=0; j< arr.length; j++ )
            {
                if ( (arr[j] & x) > 0)
                    sum++;
            }

            // The bits with sum not multiple of 3, are the
            // bits of element with single occurrence.
            if ( (sum % 3)!=0 )
                result |= x;
        }

        return result;
    }
}

package IOReflection.Question4;

import java.lang.invoke.LambdaMetafactory;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by gaurav on 16/3/17.
 */
public class Question4 {
    public static void main(String[] args) {
        printTable(2);
    }

    public static void printTable(int n){
        IntStream.range(1, 11).forEach(
                i -> System.out.println(n+"x"+i+"="+i*n)
        );
    }
}

package chapter5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class IntArrayTest {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        int sumVal = Arrays.stream(arr).sum();
        long count = Arrays.stream(arr).count();

        System.out.println(sumVal);
        System.out.println(count);
        Arrays.stream(arr).forEach(n->System.out.println(n));
    }

}

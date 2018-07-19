package edu.maskleo.collections.explain;

import java.util.Arrays;
import java.util.Random;

public class ReverseTest {

    public static void main(String[] args) {
        java.util.Random random = new Random();
        Integer[] arr = new Integer[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println(Arrays.asList(arr));
        for (int i=0, mid=arr.length>>1, j=arr.length-1; i<mid; i++, j--) {
            int t = arr [i];
            arr [i] = arr[j];
            arr [j] = t;
        }
        System.out.println(Arrays.asList(arr));
    }

}

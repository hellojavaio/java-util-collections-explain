package edu.maskleo.collections.explain;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class CheckedCollectionTest {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("12", "23");
        List<String> safeList = Collections.checkedList(list, String.class);
        List obj = safeList;
        obj.add(new Date());
    }
}

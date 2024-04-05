package org.launchcode;

import java.util.ArrayList;

public class ArrayListPractice {

    public static int SumEven(ArrayList<Integer> arr) {

        int total = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                total += i;
            }
        }
        return total;
    }
}

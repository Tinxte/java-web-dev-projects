package org.launchcode;

import java.util.ArrayList;

public class IntegerList {
    public static void main(Integer[] args) {

        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        integerList.add(7);
        integerList.add(8);
        integerList.add(9);
        integerList.add(10);

int output;
    output = ArrayListPractice.SumEven(integerList);
        System.out.println(output);

    }
}

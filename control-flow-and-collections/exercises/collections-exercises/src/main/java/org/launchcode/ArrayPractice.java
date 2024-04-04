package org.launchcode;
import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {

        //Integer practice
        int[] integerArray = {1, 1, 2, 3, 5, 8};
        for (int i : integerArray) {
            if (!(i % 2 == 0)) {
                System.out.println(i);
            }
        }

        //String practice
        String newString = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        String[] output = newString.split("\\.");
        System.out.println(Arrays.toString(output));

    }

}

package org.launchcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {

    public static void main(String[] args) {

        HashMap<String, Double> characterCounts = new HashMap<>();

        String testString = "Test string";

//        String[] letters = testString.split("");
        char[] charactersInString = testString.toCharArray();

    for (char character : charactersInString) {
    if (characterCounts.containsKey(character)) {
        characterCounts.put(character, characterCounts.get(character) + 1);
    }
    else {
        characterCounts.put(character, 1);
    }
    }

//        for (Map.Entry<Character, Integer> oneChar : characterCounts.entrySet()) {
//            System.out.println(oneChar.getKey() + " : " + oneChar.getValue());
//            sum += student.getValue();
//        }
    }
}

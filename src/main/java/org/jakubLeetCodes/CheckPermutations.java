package org.jakubLeetCodes;

import java.util.ArrayList;
import java.util.List;

public class CheckPermutations {

    public static void main(String[] args) {
        System.out.println(isPermutation("cat", "tac"));
        System.out.println(isPermutation("cat", "toe"));
        System.out.println(isPermutation("cat1", "1act"));
    }

    // My solution #1
    public static boolean isPermutation(String s1, String s2) {
        // Check if strings are the same length
        if (s1.length() == s2.length()) {
            // Create Lists for both strings
            ArrayList<String> sOne = new ArrayList<String>();
            ArrayList<String> sTwo = new ArrayList<String>();

            // Loop through strings and add each letter to appropriate list
            for (int i = 0; i<s1.length(); i++) {
                sOne.add(Character.toString(s1.charAt(i)));
                sTwo.add(Character.toString(s2.charAt(i)));
            }
            // Check if one list contains all elements of the other
            if (sOne.containsAll(sTwo)) {
                System.out.println("The two strings are a permutation of each other.");
                return true;
            }
        }
        System.out.println("They are not a permutation of each other.");
        return false;
    }

    public static void testing() {
    }
}

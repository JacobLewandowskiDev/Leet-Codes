package org.jakubLeetCodes;

import java.util.HashMap;

public class RomanInteger {
    /**
     * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
     * <p>
     * Symbol       Value
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     * <p>
     * For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII,
     * which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
     * <p>
     * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four
     * is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it
     * making four. The same principle applies to the number nine, which is written as IX. There are six instances
     * where subtraction is used:
     * <p>
     * I can be placed before V (5) and X (10) to make 4 and 9.
     * X can be placed before L (50) and C (100) to make 40 and 90.
     * C can be placed before D (500) and M (1000) to make 400 and 900.
     * Given a roman numeral, convert it to an integer.
     */

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));  // Expected 1994
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanToIntValues = new HashMap<Character, Integer>();
        romanToIntValues.put('I', 1);
        romanToIntValues.put('V', 5);
        romanToIntValues.put('X', 10);
        romanToIntValues.put('L', 50);
        romanToIntValues.put('C', 100);
        romanToIntValues.put('D', 500);
        romanToIntValues.put('M', 1000);

        char[] arr = s.toUpperCase().toCharArray();
        int result = 0;
        int letterValue;
        int nextLetterValue = 0;

        for (int i = 0; i < arr.length; i++) {

            letterValue = romanToIntValues.get(arr[i]);
            if((i+1 != arr.length)) {
                nextLetterValue = romanToIntValues.get(arr[i + 1]);
            }
            else {
                break;
            }

            if (letterValue < nextLetterValue) {
                result =  result + (nextLetterValue - letterValue);
                System.out.println("Letter: " + letterValue + ", next: " + nextLetterValue + ", result: " + result);
            }

            else if (letterValue >= nextLetterValue) {
                result = result + letterValue;
                System.out.println("Letter: " + letterValue + ", next: " + nextLetterValue + ", result: " + result);
            }

            else {
                System.out.println("There might be something wrong with your input, please check it");
                return -1;
            }
        }
        return result;
    }

}









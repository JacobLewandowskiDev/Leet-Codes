package org.jakubLeetCodes;


public class IntegerToRoman {
    public static void main(String[] args) {
        System.out.println("Integer To Roman result: " + IntegerToRoman(1994));

    }

    public static String IntegerToRoman(int number) {

        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        int[] intValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder result = new StringBuilder();


        for(int i = 0; i < intValues.length; i++) {
            while (number >= intValues[i]) {
                number -= intValues[i];
                result.append(roman[i]);
            }
        }

        return result.toString();
    }
}

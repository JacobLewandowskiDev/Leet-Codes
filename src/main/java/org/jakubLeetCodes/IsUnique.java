package org.jakubLeetCodes;

public class IsUnique {

    public static void main(String[] args) {
        isUnique("Hello");
        isUnique("Tom");
        isUnique("Unique");
        isUnique("!@#");
        isUnique("   ");
        isUnique("12341");

    }

    public static String isUnique(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                String letterI = Character.toString(str.charAt(i)).toLowerCase();
                String letterJ = Character.toString(str.charAt(j)).toLowerCase();
                System.out.println("i: " + letterI + ", j: " + letterJ);
                if (letterI.equals(letterJ)) {
                    System.out.println("The string contains duplicates, therefore it is not unique");
                    return "The string contains duplicates, therefore it is not unique";
                }
            }
        }
        System.out.println("The string is unique");
        return "String is unique";
    };
}

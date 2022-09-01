package org.jakubLeetCodes;

public class URLify {

    public static void main(String[] args) {
        System.out.println(urlify("Mr John Smith    ", 13));

    }

    public static String urlify(String str, int trueLength) {
        char[] arr = str.toCharArray();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < trueLength; i++) {
            if (arr[i] != ' ') {
                builder.append(arr[i]);
            } else {
                builder.append("%20");
            }
        }
        return builder.toString();
    }
}

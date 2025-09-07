package org.jakubLeetCodes;

public class ReverseString {

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        System.out.println(reverseString(s));
    }

    public static char[] reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while(left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            System.out.println("i: " + temp + ", end - i: " + s[right-left]);
            left++;
            right--;
        }

        return s;
    }
}

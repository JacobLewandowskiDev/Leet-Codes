package org.jakubLeetCodes;


import java.util.ArrayList;
import java.util.List;

public class isValidParintheses2 {

    public static void main(String[] args) {
        String s = "(){}[]]";
        System.out.println(isValidParentheses(s));
    }

    public static boolean isValidParentheses(String s) {
        List<Character> last = new ArrayList<>();
        char[] s2 = s.toCharArray();

        for (char bracket : s2) {
            if (bracket == '(' || bracket == '{' || bracket == '[') {
                last.add(bracket);
            }
            if (bracket == ')' || bracket == '}' || bracket == ']') {
                if(last.isEmpty()) {
                    return false;
                }
                char lastBracket = last.get(last.size() - 1);

                if ((bracket == ')' && lastBracket != '(') || (bracket == '}' && lastBracket != '{') || (bracket == ']' && lastBracket != '[')) {
                    return false;
                }

                last.remove(last.size() - 1);
            }

        }
        return last.isEmpty();
    }
}

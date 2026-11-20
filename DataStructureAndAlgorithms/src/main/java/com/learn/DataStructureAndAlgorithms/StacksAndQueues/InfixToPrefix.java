
package com.learn.DataStructureAndAlgorithms.StacksAndQueues;

import java.util.Stack;

public class InfixToPrefix {

    private static void convertToPrefix(String s) {

        Stack<Character> st = new Stack<>();
        String ans = "";

        // Step 1: Reverse the infix expression
        StringBuilder sc = new StringBuilder(s);
        sc.reverse();

        // Step 2: Swap parentheses
        for (int j = 0; j < sc.length(); j++) {

            if (sc.charAt(j) == '(') {
                sc.setCharAt(j, ')');
            } else if (sc.charAt(j) == ')') {
                sc.setCharAt(j, '(');
            }
        }

        // Step 3: Convert reversed expression into postfix
        char[] ch = sc.toString().toCharArray();
        int i = 0;

        while (i < ch.length) {

            if (operand(ch[i])) {
                ans += ch[i];
            }
            else if (ch[i] == '(') {
                st.push(ch[i]);
            }
            else if (ch[i] == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    ans += st.pop();
                }
                if (st.isEmpty()) {
                    throw new IllegalArgumentException("Mismatched parentheses");
                }
                st.pop();
            }
            else {
                while (!st.isEmpty()
                        && st.peek() != '('
                        && (priority(ch[i]) < priority(st.peek())
                        && ch[i] == '^')) {

                    ans += st.pop();
                }

                st.push(ch[i]);
            }

            i++;
        }

        // Step 4: Pop remaining operators
        while (!st.isEmpty()) {

            if (st.peek() == '(') {
                throw new IllegalArgumentException("Mismatched parentheses");
            }
            ans += st.pop();
        }

        // Step 5: Reverse postfix to get prefix
        StringBuilder prefix = new StringBuilder(ans);
        prefix.reverse();

        System.out.println("Prefix is: " + prefix);
    }

    private static boolean operand(char ch) {

        return (ch >= 'A' && ch <= 'Z')
                || (ch >= 'a' && ch <= 'z')
                || (ch >= '0' && ch <= '9');
    }

    private static int priority(char ch) {

        if (ch == '^') {
            return 3;
        } else if (ch == '*' || ch == '/') {
            return 2;
        } else if (ch == '+' || ch == '-') {
            return 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "a+b*(c^e)";

        convertToPrefix(s);
    }
}

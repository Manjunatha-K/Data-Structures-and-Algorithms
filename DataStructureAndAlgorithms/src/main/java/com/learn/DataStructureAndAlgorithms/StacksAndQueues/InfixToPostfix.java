
package com.learn.DataStructureAndAlgorithms.StacksAndQueues;

import java.util.Stack;

public class InfixToPostfix {

    private static void converToPostfix(String s) {

        Stack<Character> st = new Stack<>();
        String ans = "";

        char[] ch = s.toCharArray();
        int i = 0;

        while (i < ch.length) {

            if ((ch[i] >= 'A' && ch[i] <= 'Z') || (ch[i] >= 'a' && ch[i] <= 'z') || (ch[i] >= '0' && ch[i] <= '9')) {
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
                while (!st.isEmpty() && st.peek() != '(' && priority(ch[i]) <= priority(st.peek())
                        && ch[i] != '^'){
                    ans += st.pop();
                }
                st.push(ch[i]);
            }
            i++;
        }

        // Pop remaining operators
        while (!st.isEmpty()) {

            if (st.peek() == '(') {
                throw new IllegalArgumentException("Mismatched parentheses");
            }
            ans += st.pop();
        }

        System.out.println("Postfix is: " + ans);
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

        converToPostfix(s);
    }
}

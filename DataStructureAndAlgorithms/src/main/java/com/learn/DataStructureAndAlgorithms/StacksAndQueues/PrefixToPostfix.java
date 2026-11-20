
package com.learn.DataStructureAndAlgorithms.StacksAndQueues;

import java.util.Stack;

public class PrefixToPostfix {

    private static void convertToPostfix(String s) {

        Stack<String> st = new Stack<>();
        char[] ch = s.toCharArray();
        int i = ch.length - 1;

        while (i >= 0) {

            if (operand(ch[i])) {
                st.push(String.valueOf(ch[i]));
            }
            else {
                if (st.size() < 2) {
                    throw new IllegalArgumentException("Invalid prefix expression");
                }

                String firstOperand = st.pop();
                String secondOperand = st.pop();

                String expression = firstOperand
                        + secondOperand
                        + ch[i];

                st.push(expression);
            }

            i--;
        }

        if (st.size() != 1) {
            throw new IllegalArgumentException("Invalid prefix expression");
        }

        System.out.println("Postfix is: " + st.pop());
    }

    private static boolean operand(char ch) {
        return (ch >= 'A' && ch <= 'Z')
                || (ch >= 'a' && ch <= 'z')
                || (ch >= '0' && ch <= '9');
    }

    public static void main(String[] args) {

        String s = "*+abc";

        convertToPostfix(s);
    }
}


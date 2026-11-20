package com.learn.DataStructureAndAlgorithms.StacksAndQueues;


import java.util.Stack;

public class PostfixToPrefix {

    private static void convertToPrefix(String s) {
        Stack<String> st = new Stack<>();
        char[] ch = s.toCharArray();
        int i = 0;

        while (i < ch.length) {

            if (operand(ch[i])) {
                st.push(String.valueOf(ch[i]));
            }
            else {
                if (st.size() < 2) {
                    throw new IllegalArgumentException(
                            "Invalid postfix expression"
                    );
                }

                String secondOperand = st.pop();
                String firstOperand = st.pop();

                String expression = ch[i]
                        + firstOperand
                        + secondOperand;

                st.push(expression);
            }

            i++;
        }

        if (st.size() != 1) {
            throw new IllegalArgumentException("Invalid postfix expression");
        }

        System.out.println("Prefix is: " + st.pop());
    }

    private static boolean operand(char ch) {
        return (ch >= 'A' && ch <= 'Z')
                || (ch >= 'a' && ch <= 'z')
                || (ch >= '0' && ch <= '9');
    }

    public static void main(String[] args) {

        String s = "ab+c*";
        convertToPrefix(s);
    }
}


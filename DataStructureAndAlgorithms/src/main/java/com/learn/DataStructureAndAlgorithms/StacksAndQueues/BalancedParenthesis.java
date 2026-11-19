package com.learn.DataStructureAndAlgorithms.StacksAndQueues;

import java.util.Stack;

public class BalancedParenthesis {
    private static void CheckBalanced(String s) {
        Stack<Character> st = new Stack<>();

        char[] sc = s.toCharArray();

        for (int i = 0; i < sc.length; i++) {
            if (sc[i] == '(' || sc[i] == '{' || sc[i] == '[')
                st.push(sc[i]);
            else if (!st.isEmpty() && (sc[i] == ')' && st.peek() == '(') || (sc[i] == '}' && st.peek() == '{') || (sc[i] == ']' && st.peek() == '['))
                st.pop();
            else {
                System.out.println("Not a balanced parenthesis");
                return;
            }
        }
        if (st.isEmpty())
            System.out.println("Balanced Parenthesis");
        else
            System.out.println("Not a balanced parenthesis");
    }

    public static void main(String[] args) {
        String s = "{[()]}((){{}})";
        CheckBalanced(s);
    }

}

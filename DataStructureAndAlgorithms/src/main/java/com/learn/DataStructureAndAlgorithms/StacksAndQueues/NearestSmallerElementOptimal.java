package com.learn.DataStructureAndAlgorithms.StacksAndQueues;

import java.util.Arrays;
import java.util.Stack;

public class NearestSmallerElementOptimal {
    private static void findNearestSmallerElement(int[] arr) {

        Stack<Integer> st = new Stack<>();
        int[] nse = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            while(!st.isEmpty() && st.peek()>=arr[i]){
                st.pop();
            }
            nse[i] = st.isEmpty()? -1: st.peek();
             st.push(arr[i]);
        }
        System.out.println("Nearest smaller elements are ");
        Arrays.stream(nse).forEach(System.out::println);
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 6, 8, 9, 10, 2, 4, 1, 0, 11};
        findNearestSmallerElement(arr);
    }


}

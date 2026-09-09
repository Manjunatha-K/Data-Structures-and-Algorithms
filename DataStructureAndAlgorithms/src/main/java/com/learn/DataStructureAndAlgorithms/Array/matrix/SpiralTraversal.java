package com.learn.DataStructureAndAlgorithms.Array.matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraversal {
    private static void traversal(int[][] matrix) {
        int left = 0, right = matrix[0].length - 1, bottom = matrix.length-1, top = 0;
        List<Integer> list = new ArrayList<>();
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;
            for (int i = right; i >= left; i--) {
                list.add(matrix[bottom][i]);
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                list.add(matrix[i][left]);
            }
            left++;
        }
        System.out.println("After Traversal");
        list.stream().forEach(System.out::println);
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        traversal(matrix);
    }

}

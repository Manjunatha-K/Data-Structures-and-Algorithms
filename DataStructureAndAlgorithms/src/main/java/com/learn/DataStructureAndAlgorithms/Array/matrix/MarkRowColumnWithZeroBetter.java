package com.learn.DataStructureAndAlgorithms.Array.matrix;

/*
Given n*m matrix, which has 0's and 1's, if0 is found,Mark the entire row & column as zero
 */
public class MarkRowColumnWithZeroBetter {
    private static void mark(int[][] matrix) {
        int[] row = new int[matrix[0].length];
        int[] column = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = 1;
                    column[j] = 1;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (row[i] == 1 || column[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
        System.out.println("After marking the matrix");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1}, {1, 1, 1}, {1, 1, 0}};
        mark(matrix);
    }
}

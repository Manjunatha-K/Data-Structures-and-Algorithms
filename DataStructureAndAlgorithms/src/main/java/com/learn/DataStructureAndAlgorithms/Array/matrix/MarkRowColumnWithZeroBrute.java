package com.learn.DataStructureAndAlgorithms.Array.matrix;

/*
Given n*m matrix, which has 0's and 1's, if0 is found,Mark the entire row & column as zero
 */
public class MarkRowColumnWithZeroBrute {
    private static void mark(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    markRow(matrix, i);
                    markColumn(matrix, j);
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == -1) {
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

    private static void markRow(int[][] matrix, int i) {
        for (int j = 0; j < matrix[0].length; j++)
            matrix[i][j] = -1;
    }

    private static void markColumn(int[][] matrix, int j) {
        for (int i = 0; i < matrix.length; i++)
            matrix[i][j] = -1;
    }


    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        mark(matrix);
    }


}

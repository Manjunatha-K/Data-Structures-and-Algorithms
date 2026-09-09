package com.learn.DataStructureAndAlgorithms.Array.matrix;

public class RotateMatrixBy90DegreesBetter {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        rotateMatrix(matrix);
    }

    private static void rotateMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        System.out.println("Before transpose Array is ");
        print(matrix, m, n);

        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        System.out.println("After transpose Array is ");
        print(matrix, m, n);

        for (int i = 0; i < m; i++) {
            int start = 0, end = n - 1;
            while (start < end) {
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }

        System.out.println("Rotated Array is ");
        print(matrix, m, n);
    }

    private static void print(int[][] matrix, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}

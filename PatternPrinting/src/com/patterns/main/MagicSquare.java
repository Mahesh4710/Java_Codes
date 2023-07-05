package com.patterns.main;

import java.util.Scanner;

public class MagicSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the matrix: ");
        int n = input.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

      
        int sum = 0;
        for (int j = 0; j < n; j++) {
            sum += matrix[0][j];
        }
        boolean isMagicSquare = true;

        // check row sum
        for (int i = 1; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum != sum) {
                isMagicSquare = false;
                break;
            }
        }

        // check column sum
        if (isMagicSquare) {
            for (int j = 0; j < n; j++) {
                int colSum = 0;
                for (int i = 0; i < n; i++) {
                    colSum += matrix[i][j];
                }
                if (colSum != sum) {
                    isMagicSquare = false;
                    break;
                }
            }
        }

       
        if (isMagicSquare) {
            int diagonalSum1 = 0;
            int diagonalSum2 = 0;
            for (int i = 0; i < n; i++) {
                diagonalSum1 += matrix[i][i];
                diagonalSum2 += matrix[i][n - 1 - i];
            }
            if (diagonalSum1 != sum || diagonalSum2 != sum) {
                isMagicSquare = false;
            }
        }

        
        if (isMagicSquare) {
            System.out.println("The matrix is a magic square.");
        } else {
            System.out.println("The matrix is not a magic square.");
        }
    }
}

package com.nagesh.challenge;

import java.util.Scanner;

/**
 * Created by nageshkumar
 * since  05/10/17.
 */
public class KingRichard {
   /* Sample Input
        7
        4
        1 2 4
        2 3 3
        3 4 1
        3 4 0
        7
        0
        6
        9
        11
        24
        25
        48

    Sample Output
        1 1
        1 7
        4 6
        3 4
        2 5
        2 4
        7 7*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total_rows = scanner.nextInt();
        if(total_rows <= 0){
            System.exit(0);
        }
        int[][] arr = new int[total_rows][total_rows];

        for (int i = 0; i < total_rows; i++) {
            for (int j = 0; j < total_rows; j++) {
                arr[i][j] = (i * total_rows) + j;
            }
        }

        int rotates = scanner.nextInt();
        String[] str = new String[rotates];
        scanner.nextLine();
        for (int i = 0; i < rotates; i++) {
            if(scanner.hasNextLine()) {
                str[i] = scanner.nextLine();
            }
        }
        for (String s:str) {
            String[] strings = s.split(" ");
            rotateInnerMatrix(arr,Integer.parseInt(strings[0]),  Integer.parseInt(strings[1]),  Integer.parseInt(strings[2]));
        }
        int required = scanner.nextInt();
        int[] out = new int[required];
        scanner.nextLine();
        for (int i = 0; i < required; i++) {
            if(scanner.hasNextInt()) {
                out[i] = scanner.nextInt();
            }
        }
        for (int get:out) {
            for (int i = 0; i < required; i++) {
                for (int j = 0; j < required; j++) {
                    if(arr[i][j] == get){
                        System.out.println((i+1)+" "+(j+1));
                    }
                }
            }
        }
        scanner.close();
    }

    private static void printMatrix(int[][] arr) {
        System.out.println("After rotation");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }

    private static void rotateInnerMatrix(int[][] arr,Integer a, Integer b, Integer c) {
        int[][] sub_matrix = new int[c + 1][c + 1];
        for (int i = 0; i < c + 1; i++) {
            for (int j = 0; j < c + 1; j++) {
                sub_matrix[i][j] = arr[i + a - 1][j + b - 1];
            }
        }
        rotateMatrix(sub_matrix);
        for (int i = 0; i < c + 1; i++) {
            for (int j = 0; j < c + 1; j++) {
                arr[i + a - 1][j + b - 1] = sub_matrix[i][j];
            }
        }

    }

    public static void rotateMatrix(int[][] matrix) {
        int length = matrix.length - 1;

        for (int i = 0; i <= (length) / 2; i++) {
            for (int j = i; j < length - i; j++) {
                int p1 = matrix[i][j];
                int p2 = matrix[j][length - i];
                int p3 = matrix[length - i][length - j];
                int p4 = matrix[length - j][i];

                //Swap values of 4 coordinates.
                matrix[j][length - i] = p1;
                matrix[length - i][length - j] = p2;
                matrix[length - j][i] = p3;
                matrix[i][j] = p4;
            }
        }
    }
}

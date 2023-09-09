package _13;

import java.util.Scanner;

public class Square3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] arr = new int[n][n];


        for (int i = 0; i < n ; i++) {
            for (int j = 0; j <n ; j++) {
                arr[i][j] = (i+1) * (j+1);
            }
        }



        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
        }
    }
}

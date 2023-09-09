package _11;

import java.util.Scanner;

public class Nsquare2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n];



        for (int i = 0; i < n ; i++) { //
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = i * n + j + 1;
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    arr[i][j] = i * n + n - j;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();

        }
    }
}

/*


                for (int j = 1; j < n + 1; j++) { //열
                    System.out.printf("%5d ", inputNum);
                    inputNum++;
                }
                }
            }else {
                for (int j = n; j <1 ; j--) {
                    { //열
                        System.out.printf("%5d ", inputNum);
                        inputNum--;
                    }
                }
            }
            System.out.println();
        }
*/


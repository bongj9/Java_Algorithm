package _12;

import java.util.Enumeration;
import java.util.Scanner;

public class Nsquare3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        //배열을 써서 저장한후 그 배열을 꺼내보는 방식
        int num = 1;
        for (int i = 0; i <n; i++) { //세로
            for (int j = 0; j <n ; j++) { //가로
                arr[j][i] = num;
                num ++;
            }


        }
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                System.out.printf("%3d ", arr[i][j]);
            }
            System.out.println();
        }


    }
}
//행과 열을 바꾼다면 금방 나온다
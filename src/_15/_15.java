package _15;

import java.util.Scanner;

public class _15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/*
        int n = scanner.nextInt();

*/
/*        for (int i = 0; i <=9; i++) {
            int k = n * i;
        }*//*

        for (int i = 1; i <=9; i++) {
            System.out.println(n + "*" + i +" ="+ n*i);
        }
*/

        int s = 2;
        int f = 5;

        for (int i = 0; i <=9; i++) {
            for (int dan = s; dan <=f ; dan++) {
                System.out.printf("%2d * %2d = %2d", dan, i, dan * i);
            }
            System.out.println(); //개행
        }
    }
}

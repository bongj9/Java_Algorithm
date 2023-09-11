package _18;

import java.util.Scanner;

public class star3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < n - (j + 1)) { //조건에 대해 생각하기 n-(j+1) n는 입력값 i는 가로 j세로값

                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }
}

package _14;

import java.util.Scanner;

public class Cnt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[10]; //0~9 입력된 수를 cnt 위한 용도

        while (n > 0  ) {
            arr[n % 10]++;
            n /= 10; //n을 나누고 몫을 저장하는 방법

        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + arr[i]);
        }
    }
}

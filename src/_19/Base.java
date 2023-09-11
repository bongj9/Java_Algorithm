package _19;

import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int res = 1;
        for (int i = 1; i <= m; i++) { //반복문은 그냥 횟수로 생각을 하면 된다
            res *= n;
        }
        System.out.println(res);
    }
}


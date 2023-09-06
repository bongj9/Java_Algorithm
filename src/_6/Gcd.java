package _6;

import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("num1을 입력하시오: ");
        num1 = sc.nextInt();
        System.out.println("num2을 입력하시오: " );
        num2 = sc.nextInt();
        int small, big;
        if (num1 > num2) {
            big = num1;
            small = num2;
        } else {
          big = num2;
          small = num1;
        }
        int gcd = 1; //최대공약수를 1로 초기화

        for (int i = 1; i <=small; i++) {
            if (big % i == 0 && small % i == 0) {
                gcd = i;
            }
        }

        System.out.println(gcd);
    }
}
/*
1.작은 수 와 큰 수 부터 먼저 판별해야한다
2.나누는것의 범위가 중요하다.


2*/

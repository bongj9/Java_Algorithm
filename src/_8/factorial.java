package _8;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Factorial = sc.nextInt();
        int acc = 1;
        for (int i = 1; i <= Factorial; i++) {
            acc *= i; //이것을 생각을 해야한다 acc = acc*i이게 i=1일때 실행이 되고 그 값을 저장한 후에 다시 i=2일때 실행 핵심임
        }
        System.out.println(acc);

    }
}

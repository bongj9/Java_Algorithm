package _10;

import java.util.Scanner;

public class Nsquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        int inputNum1 = 1; //항상 초기화를 해주는 것을 생각한다

        for (int i = 1; i <= inputNum; i++) {
            for (int j = 1; j <= inputNum; j++) {
                System.out.printf("%4d ",inputNum1 ); //printf ,print,println을 어떻게 활용을 할지 생각을 해야한다
                inputNum1++;
            }
            System.out.println(); //개행을 위한 코드
        }
    }
}

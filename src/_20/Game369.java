package _20;

import java.util.Scanner;

public class Game369 {
    public static int getnum(int i) { //메서드를 반환 해야한다
        //
        int j = 0;
        while (i > 0) {
            if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9)  //나머지 계산식
                j++;
            i /= 10;
        }
        return j;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            int cnt = getnum(i); //369를 얼마나 가지고 있는지 확인
            if (cnt == 0) { //369가 없다면 카운트가 0이기 때문에
                System.out.print(i + " ");
            } else {
                for (int l = 0; l < cnt; l++) {  //반복해서 칠 수 있기때문에
                    System.out.print("짝");
                }
                System.out.print(" ");
            }

        }
    }
}

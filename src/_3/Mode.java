package _3;

import java.util.Scanner;

public class Mode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputnum = new int[10];
        for (int i = 0; i < 10; i++) {
            inputnum[i] = sc.nextInt(); //사용자에게 값을 받아오는 것
        }
        System.out.println(inputnum);
        //1 2 2 3 1 4 2 2 4 3

        int[] mode = new int[10]; //최빈수를 확인해볼 공간을 만들기
        for (int i = 0; i < 10; i++) {
            mode[inputnum[i]]++; //inputnum배열에 있는 값들이 중복되면 mode값이 하나 증가
        }
        int modeNum = 0; //최빈수의 값
        int modeCNT = 0; //최빈수 CNT는 count

        for (int i = 0; i < 10; i++) {
            if (modeCNT < mode[i]) {   //최빈수를 찾는 과정 mode[3] = 5 는 3번숫자가 5번 나왔다
                modeCNT = mode[i];
                modeNum = i;
            }
        }
        System.out.println("최빈수는 " +
                modeNum + " 값은 " +
                modeCNT);


    }
}

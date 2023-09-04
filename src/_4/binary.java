package _4;

import java.util.Scanner;

public class binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //사용자로부터 값을 받아보는것
        int inputNum = sc.nextInt();
        int bin[]  = new int[20];
        int i = 0;
        int mod = inputNum;
        while (mod > 0) {
            bin[i] = mod % 2; //배열에 나머지값을 저장
            mod /= 2; // mod에 몫을 저장
            i++; //인덱스값 증가
        }
        i--;//i--을 하는 경우 안하면 010011으로 나오기때문에 하나를 빼줘야한다
        for (; i >= 0; i--) {
            System.out.print(bin[i]);
        }
        }


        }
//출력에 필요한 인덱스를 구해야한다

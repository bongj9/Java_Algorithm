package _9;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        int accSum = 0; //초기화를 해줘야한다
        while (inputNum > 0) {
            accSum += inputNum % 10;
            inputNum /= 10;
        }
        System.out.println(accSum);
        }
    }
//

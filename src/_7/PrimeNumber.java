package _7;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
  /*      Scanner sc = new Scanner(System.in);
        int primeNumber;
        System.out.println("정수를 입력하시오: ");
        int InputNumber = sc.nextInt();
        for (int i = 2; i < InputNumber; i++) {
            if (InputNumber % i == 0 && InputNumber % i = 1) {
                primeNumber = InputNumber;
            }
            System.out.println(PrimeNumber);
        }*/

        int num = 14;
        boolean isPrime = true;
        for (int i = 2; i < num - 1; i++) {
            if (num % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("소수입니다 : " + num);

        } else {
            System.out.println("소수가 아닙니다 " + num);
        }
    }
}
/*
1.내가 한 방법으로 해석해보기
        반복문에서 증가하면서 1과 자기가신만을 약수를 가진다면?
2.위의 방법은 flag변수를 활용한 것이다. 반복문을 한번이라도 거쳤다면?이라는 생각으로 시작하는것이다*/

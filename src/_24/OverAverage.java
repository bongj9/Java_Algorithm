package _24;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Scanner;

public class OverAverage {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("몇개의 점수를 입력하나요? ");
                int n = scanner.nextInt();
                int[] arr = new int[n];

                System.out.println(n + "개의 점수를 입력하세요:");
                for (int i = 0; i < n; i++) { // n개의 숫자열을 입력받기
                    arr[i] = scanner.nextInt();
                }

                int sum = 0;
                for (int i = 0; i < n; i++) {
                    sum += arr[i];
                }

                // 평균을 계산 (double 형태로 계산)
                double average = (double) sum / n;

                System.out.println("평균: " + average);
                System.out.println("평균을 넘는 점수:");

                for (int i = 0; i < n; i++) {
                    if (arr[i] > average) {
                        System.out.print(arr[i] + " ");
                    }
                }
            }
        }


        //평균을 쉽게 구하는 라이브러리를 썼다, Arrays.stream(arr).average().orElse(0.0)
/*        double[] arr = {7, 8, 90, 100, 39, 85, 50, 80, 30};
        int n = 0;
        Double average1 = Arrays.stream(arr).average().orElse(0.0); //평균
        System.out.println(average1);
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > average1) {
                    System.out.print(arr[i]+ " ");
                }
            }*/



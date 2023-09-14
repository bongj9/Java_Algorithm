package _21;

import java.util.Scanner;

public class CntNum {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("배열의 크기를 입력하세요: ");
            int size = scanner.nextInt();
            boolean[] arr = new boolean[size];
            int[] numbers = new int[size];

            for (int i = 0; i < size; i++) {
                System.out.print("값을 입력하세요: ");  //값들을 입력받는 방법
                numbers[i] = scanner.nextInt();
            }

            System.out.println("입력된 배열의 값:");
            for (int number : numbers) {
                System.out.println(number);
            }

            scanner.close();
            for (int i = 0; i < size; i++) {  //중복된숫자 세는 코드
                arr[numbers[i]] = true;
                System.out.print(arr[i]+ " "); //for문의 결과값 출력
            }
            for (int i = 0; i < size; i++) {
                if (arr[i]) {  //arr[i] = true 를 대입하면 오류가 나는 이유는 if문의 조건문이 참값일때 그 밑에가 출력되는데 arr[i] = true를 하게 되면 모든 arr의 인자값을 참값으로
                    //만들어주는것있기때문에 모든요소가 다 나온다
                    System.out.print(i+" ");
                }
            }


        }
    }



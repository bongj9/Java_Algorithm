package _17;

import java.util.Scanner;

public class Star2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n; j++) {
                if (i>j) {
                    System.out.print(" ");

                }else{
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }
}
/*
*****
 ****
  ***
   **
    *
가로는 첫번째 for문
각 개별마다는 두번쨰 for문*/

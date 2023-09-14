package _22;

import java.util.Scanner;

public class FindPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        int len = n.length();
        boolean flag = false;

        for (int i = 0; i < len/2; i++) { //len의 몫
            if (n.charAt(len - i - 1) == n.charAt(i)){  //n.chartAt !=
                                                        //flag를 true로 정하고 false로 설정한다.기본값을 어떤것으로 성정하냐의 차이인 것 같다
                flag = true;
            }
        }
        System.out.println(flag);
    }
}


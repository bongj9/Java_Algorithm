package _23;

import java.util.Scanner;

public class SwitchChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        char str[] = n.toCharArray();  //받은 문자열을 문자 배열로 바꿔주는 역할
        int len = str.length;  //문자배열의 길이는 property를 이용하면된다 굳이 length()를 안해줘도 된다.
        char tem;
        for (int i = 0; i < len/2; i++) {
            tem =str[i];
            str[i] = str[len - i - 1];
            str[len - i - 1] = tem;
        }
        String ln = new String(str); //문자배열에서 문자열로 바꿔주는 역할을 한다.
        System.out.print(ln);
    }
}

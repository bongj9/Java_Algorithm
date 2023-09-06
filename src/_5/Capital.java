package _5;
//모든 문자는 각각 해당하는 아스키코드가 있다.이것이 키포인트
//toCharArray가 핵심 문자열을 받아서 문자배열로 만들어 준다
//대문자가 소문자보다 크다.
import java.util.Scanner;

public class Capital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next(); //사용자에게 받아오도록 설정해보았다 1.nextLine으로 해주거나 2.next로 설정을 해줘도 된다(인텔리제이)
        char[] arr; //helloworld문자 하나하나당 원소들에 대한 접근을 할수있다.array로 반환했기 때문이다.
        arr = input.toCharArray();
        for (int i = 0; i < arr.length; i++) { //소문자라면
            if (arr[i] > 'a' && arr[i] < 'z') {
                arr[i] = (char) (arr[i] + ('A'-'a')); //A에서 a만큼의 차이를 빼준다.
            } else if (arr[i] > 'A' && arr[i] < 'Z') {
                arr[i] = (char) (arr[i] - ('A'-'a'));

            }
        }
        System.out.println(arr);
    }
}
/*1    arr[i] = (char) (arr[i] - ('A' - 'a'));여기서 아스키코드를 이용한거라면 그 차이만큼을 숫자로 더해주거나 빼줘도 성립이 되는지*/

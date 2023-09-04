package _2;

/*

public class fibonacci {
    public static void main(String[] args) {
        //배열을 이용하는 방법
        int []arr = new int[100];

        arr[1] = 1;
        arr[2] = 1;

        for (int i = 3; i < 10; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        for (int i = 1; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

*/
/*
public class fibonacci {
    public static void main(String[] args) {
        int prev_Prev = 1;
        int prev_Prev2 = 1;
        for (int i = 3; i < 10; i++) {
            int current = prev_Prev + prev_Prev2;
            System.out.print(current+ " ");

            prev_Prev = prev_Prev2;
            prev_Prev2 = current;


        }
    }
}
*/
//1번째 방법은 배열을 활용한 방법이고
//2번쨰는 함수만을 이용해서 만든 방법이다
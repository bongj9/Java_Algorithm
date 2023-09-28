package _25;

public class PlusCycle {
    public int[] solution(int n){
        int x = 0;
        int y = 0;
        int[][] triangle = new int[n][n];
        int v = 1;

        while (true) {
            triangle[y][x] = v++;
            if (y + 1 == n || triangle[y + 1][x] != 0) break;
            y += 1; //
            }
        }
    }
}

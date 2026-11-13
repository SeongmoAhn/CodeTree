import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt();
        int[][] arr = new int[N][M];
        int cnt = 0;
        boolean rev = true;
        for (int i = 0; i < M; i++) {
            if (rev) {
                for (int j = 0; j < N; j++) {
                    arr[j][i] = cnt++;
                }
            } else {
                for (int j = N - 1; j >= 0; j--) {
                    arr[j][i] = cnt++;
                }
            }
            rev = !rev;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}
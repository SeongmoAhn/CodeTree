import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt();
        int[][] arr = new int[N][M];
        int cnt = 1;
        // 0행 N - 2열까지 대각 채우기
        for (int i = 0; i < M - 1; i++) { // 0행 i열
            int col = i;
            for (int row = 0; row != N; row++) {
                arr[row][col--] = cnt++;
                if (col < 0) break;
            }
        }
        // 0행 ~ N - 1행까지 대각 채우기
        for (int i = 0; i < N; i++) {
            int row = i;
            for (int col = M - 1; col > -1; col--) {
                arr[row++][col] = cnt++;
                if (row == N) break;
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}
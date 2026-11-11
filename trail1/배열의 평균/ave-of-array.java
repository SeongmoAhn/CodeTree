import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][4];

        for (int i = 0; i < 2; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
            }
            System.out.printf("%.1f ", sum / 4.);
        }
        System.out.println();

        int total = 0;
        for (int i = 0; i < 4; i++) {
            int sum = 0;
            for (int j = 0; j < 2; j++) {
                sum += arr[j][i];
                total += arr[j][i];
            }
            System.out.printf("%.1f ", sum / 2.);
        }
        System.out.printf("\n%.1f", total / 8.);
    }
}
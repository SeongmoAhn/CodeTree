import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            arr[i] = sc.nextInt();
        }

        int max, idx;
        while(true) {
            max = 0;
            idx = 0;
            for (int i = 1; i <= N; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                    idx = i;
                }
            }
            if (idx == 0) break;
            N = idx - 1;
            System.out.printf("%d ", idx);
        }
    }
}
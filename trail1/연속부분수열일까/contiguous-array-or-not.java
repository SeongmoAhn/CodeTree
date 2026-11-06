import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt();
        int[] arr1 = new int[N], arr2 = new int[M];
        for (int i = 0; i < N; i++) arr1[i] = sc.nextInt();
        for (int i = 0; i < M; i++) arr2[i] = sc.nextInt();
        for (int i = 0; i + M <= N; i++) {
            if (arr1[i] == arr2[0]) {
                boolean flag = false;
                for (int j = 0; j < M; j++) {
                    if (arr1[i + j] != arr2[j]) {
                        flag = true;
                        break;
                    }
                }
                if (flag) continue;
                System.out.print("Yes");
                return;
            }
        }
        System.out.print("No");
    }
}
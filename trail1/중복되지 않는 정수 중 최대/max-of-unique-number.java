import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cnt = new int[1010];
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            cnt[arr[i]]++;
        }
        Arrays.sort(arr);
        for (int i = n - 1; i >= 0; i--) {
            if (cnt[arr[i]] == 1) {
                System.out.print(arr[i]);
                return;
            }
        }
        System.out.print("-1");
    }
}
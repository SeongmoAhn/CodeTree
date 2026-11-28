import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[2 * N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int M = -1;
        for (int i = 0; i < N; i++) {
            M = Math.max(M, arr[arr.length - 1 - i] + arr[i]);
        }
        System.out.print(M);
    }
}
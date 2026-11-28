import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (i % 2 == 0) {
                int[] A = new int[i + 1];
                for (int j = 0; j <= i; j++) {
                    A[j] = arr[j];
                }
                Arrays.sort(A);
                System.out.printf("%d ", A[(i + 1) / 2]);
            }
        }
        Arrays.sort(arr);
        
    }
}
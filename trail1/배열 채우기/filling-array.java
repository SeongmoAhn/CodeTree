import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int i;
        for (i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0) break;
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.printf("%d ", arr[j]);
        }

    }
}
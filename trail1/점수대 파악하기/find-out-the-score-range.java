import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[11];
        int a = sc.nextInt();
        while (a != 0) {
            arr[a / 10]++;
            a = sc.nextInt();
        }
        for (int i = 10; i >= 1; i--) System.out.printf("%d - %d\n", i * 10, arr[i]);
    }
}
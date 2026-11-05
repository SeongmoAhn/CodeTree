import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[10];
        while (a != 0) {
            arr[a / 10]++;
            a = sc.nextInt();
        }
        for (int i = 1; i < 10; i++) System.out.printf("%d - %d\n", i, arr[i]);
    }
}
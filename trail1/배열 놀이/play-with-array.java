import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), Q = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) arr[i] = sc.nextInt();
        while (Q-- != 0) {
            int type = sc.nextInt();
            int a = sc.nextInt();
            if (type == 1) {
                System.out.println(arr[a - 1]);
            } else if (type == 2) {
                int flag = 0;
                for (int i = 0; i < N; i++) {
                    if (arr[i] == a) {
                        System.out.println(i + 1);
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) System.out.println(0);
            } else {
                int b = sc.nextInt();
                for (int i = a - 1; i < b; i++) {
                    System.out.printf("%d ", arr[i]);
                }
                System.out.println();
            }
        }
    }
}
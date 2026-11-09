import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int min = sc.nextInt();
        int cnt = 1;
        for (int i = 1; i < N; i++) {
            int b = sc.nextInt();
            if (b == min) {
                cnt++;
            }

            if (b < min) {
                min = b;
                cnt = 1;
            }
        }
        System.out.printf("%d %d", min, cnt);
    }
}
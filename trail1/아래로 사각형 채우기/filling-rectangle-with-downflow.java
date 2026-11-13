import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            for (int cnt = 0, j = i; cnt < N; cnt++, j += N) {
                System.out.printf("%d ", j);
            }
            System.out.println();
        }
    }
}
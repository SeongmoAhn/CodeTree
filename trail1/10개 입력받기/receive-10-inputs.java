import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = 0;
        for (int i = 0; i < 10; i++) {
            int a = sc.nextInt();
            if (a == 0) {
                System.out.printf("%d %.1f", s, s / (double)i);
                return;
            }
            s += a;
        }
        System.out.printf("%d %.1f", s, s / 10.);
    }
}
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = 0, a, i;
        for (i = 0; i < 10; i++) {
            a = sc.nextInt();
            if (a >= 250) {
                System.out.printf("%d %.1f", s, s / (double)i);
                return;
            }
            s += a;
        }
        System.out.printf("%d %.1f", s, s / 10.);
    }
}
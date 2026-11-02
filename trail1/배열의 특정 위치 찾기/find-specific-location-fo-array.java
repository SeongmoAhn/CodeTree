import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = 0;
        double a = 0;
        for (int i = 1; i <= 10; i++) {
            int b = sc.nextInt();
            if (i % 2 == 0) s += b;
            if (i % 3 == 0) a += b;
        }
        System.out.printf("%d %.1f", s, a / 3);
    }
}
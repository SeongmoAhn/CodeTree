import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0, min = 1000;
        for (int i = 0; i < 10; i++) {
            int a = sc.nextInt();
            if (a > 500 && a < min) min = a;
            if (a < 500 && a > max) max = a;
        }
        System.out.printf("%d %d", max, min);
    }
}
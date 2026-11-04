import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1, b = sc.nextInt();
        System.out.printf("%d %d ", a, b);
        while (true) {
            int c = a + b;
            a = b;
            b = c;
            System.out.printf("%d ", c);
            if (c > 100) return ;
        }
    }
}
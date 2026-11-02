import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0;
        for (int i = 0; i < 10; i++) {
            int c = sc.nextInt();
            if (i % 2 == 0) a += c; else b += c;
        }
        System.out.print(a > b ? a - b : b - a);
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        before(1, n);
        System.out.println();
        after(n, 1);
    }
    public static void before(int start, int n) {
        System.out.printf("%d ", start);
        if (start == n) return;
        before(start + 1, n);
    }
    public static void after(int start, int n) {
        System.out.printf("%d ", start);
        if (start == n) return;
        after(start - 1, n);
    }
}
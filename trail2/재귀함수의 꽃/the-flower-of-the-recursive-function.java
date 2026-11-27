import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        for (int i = n; i > 0; i--) {
            System.out.printf("%d ", i);
        }
        for (int i = 1; i <= n; i++) {
            System.out.printf("%d ", i);
        }
    }
}
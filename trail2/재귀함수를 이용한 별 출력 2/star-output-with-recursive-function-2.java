import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.printf("%c ", '*');
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("%c ", '*');
            }
            System.out.println();
        }
    }
}
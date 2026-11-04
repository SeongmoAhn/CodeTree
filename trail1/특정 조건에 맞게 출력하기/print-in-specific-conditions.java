import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a != 0) {
            if (a % 2 == 0) System.out.printf("%d ", a / 2);
            else System.out.printf("%d ", a + 3);
            a = sc.nextInt();
        }
    }
}
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (true) {
            int b = sc.nextInt();
            if (b % 3 == 0) {
                System.out.print(a);
                return;
            }
            a = b;
        }
    }
}
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            String str = sc.next();
            if (i == 2 || i == 5 || i == 8) System.out.printf("%c ", str.charAt(0));
        }
    }
}
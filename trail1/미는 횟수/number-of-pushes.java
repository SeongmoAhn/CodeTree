import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(), b = sc.next();
        for (int i = 0; i < b.length(); i++) {
            if (b.equals(a.substring(a.length() - 1 - i) + a.substring(0, a.length() - 1 - i))) {
                System.out.print(i + 1);
                return ;
            }
        }
        System.out.print(-1);
    }
}
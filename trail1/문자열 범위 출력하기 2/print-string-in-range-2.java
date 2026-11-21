import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            if (str.length() - 1 - i < 0) break;
            System.out.print(str.charAt(str.length() - 1 - i));
        }
    }
}
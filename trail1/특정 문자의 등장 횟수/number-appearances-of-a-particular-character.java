import java.util.*;
public class Main {
    public static void main(String[] args) {
        String s = new Scanner(System.in).next();
        int cnt1 = 0, cnt2 = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == 'e') {
                if (s.charAt(i + 1) == 'e') cnt1++;
                if (s.charAt(i + 1) == 'b') cnt2++;
            }
        }
        System.out.printf("%d %d", cnt1, cnt2);
    }
}
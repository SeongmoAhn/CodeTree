import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char before = s.charAt(0);
        int cnt = 1;
        String ans = "";
        if (s.length() == 1) {
            ans += before;
            ans += cnt;
        }
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != before) {
                ans += before;
                ans += cnt;
                before = s.charAt(i);
                cnt = 1;
            } else {
                cnt++;
            }
            if (i == s.length() - 1) {
                ans += before;
                ans += cnt;
            }
        }
        System.out.printf("%d\n%s", ans.length(), ans);
    }
}
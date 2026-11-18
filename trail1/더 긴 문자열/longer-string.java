import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next(), s2 = sc.next();
        if (s1.length() == s2.length()) {
            System.out.print("same");
        } else if (s1.length() > s2.length()) {
            System.out.printf("%s %d", s1, s1.length());
        } else {
            System.out.printf("%s %d", s2, s2.length());
        }
    }
}
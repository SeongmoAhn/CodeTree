import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (char ch : sc.next().toCharArray()) {
            if ('0' <= ch && ch <= '9') {
                System.out.print(ch);
            } else if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
                System.out.print(Character.toLowerCase(ch));
            }
        }
    }
}
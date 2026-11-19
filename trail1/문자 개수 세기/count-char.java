import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        char ch = sc.next().charAt(0);
        int cnt = 0;
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (c == ch) cnt++;
        }
        System.out.print(cnt);
    }
}
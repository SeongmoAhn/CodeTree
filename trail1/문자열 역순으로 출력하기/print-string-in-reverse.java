import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int cnt = 0;

    public static void main(String[] args) {
        recur();
    }

    public static void recur() {
        if (cnt == 4) return;

        String str = sc.next();
        cnt++;
        recur();
        System.out.println(str);
    }
}
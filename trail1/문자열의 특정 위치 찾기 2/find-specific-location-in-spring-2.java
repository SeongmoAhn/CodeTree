import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[]{"apple", "banana", "grape", "blueberry", "orange"};
        char ch = sc.next().charAt(0);
        int cnt = 0;
        for (String str : arr) {
            if (str.charAt(2) == ch || str.charAt(3) == ch) {
                System.out.println(str);
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}
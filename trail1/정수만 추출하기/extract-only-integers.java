import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(fun(sc.next()) + fun(sc.next()));
    }
    public static int fun(String str) {
        int sum = 0;
        for (char ch : str.toCharArray()) {
            if (!Character.isDigit(ch)) break;
            sum = sum * 10 + (int) ch - '0';
        }
        return sum;
    }
}
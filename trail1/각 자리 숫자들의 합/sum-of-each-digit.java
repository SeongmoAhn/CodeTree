import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (char a : sc.next().toCharArray()) {
            sum += (int) a - '0';
        }
        System.out.print(sum);
    }
}
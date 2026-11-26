import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        while (N-- != 0) {
            sum += sc.nextInt();
        }
        String str = String.valueOf(sum);
        System.out.print(str.substring(1) + str.charAt(0));
    }
}
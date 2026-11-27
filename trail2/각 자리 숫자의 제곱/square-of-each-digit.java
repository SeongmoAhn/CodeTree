import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        String str = String.valueOf(n);
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            int num = (int) str.charAt(i) - '0';
            sum += num * num;
        }
        System.out.print(sum);
    }
}
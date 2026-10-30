import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), b = s.nextInt(), c = s.nextInt();
        int sum = a + b + c;
        int aver = sum / 3;
        int ans = sum - aver;
        System.out.print(sum + "\n" + aver + '\n' + ans);
    }
}
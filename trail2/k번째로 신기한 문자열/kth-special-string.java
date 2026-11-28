import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();
        String[] words = new String[n];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
            if (words[i].startsWith(t)) cnt++;
        }
        // Please write your code here.
        String[] arr = new String[cnt];
        int i = 0;
        for (String str : words) {
            if (str.startsWith(t)) {
                arr[i++] = str;
            }
        }
        Arrays.sort(arr);
        System.out.print(arr[k - 1]);
    }
}
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char one = str.charAt(0);
        char two = str.charAt(1);
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == one) {
                arr[i] = two;
            } else if (arr[i] == two) {
                arr[i] = one;
            }
        }
        str = String.valueOf(arr);
        System.out.print(str);
    }
}
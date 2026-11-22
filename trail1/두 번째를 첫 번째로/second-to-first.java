import java.util.*;
public class Main {
    public static void main(String[] args) {
        String str = new Scanner(System.in).next();
        char one = str.charAt(0);
        char two = str.charAt(1);
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == two) arr[i] = one;
        }
        System.out.print(String.valueOf(arr));
    }
}
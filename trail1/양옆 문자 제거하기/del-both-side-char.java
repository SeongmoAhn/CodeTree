import java.util.*;
public class Main {
    public static void main(String[] args) {
        String str = new Scanner(System.in).next();
        System.out.print(str.substring(0, 1) + str.substring(2, str.length() - 2) + str.substring(str.length() - 1));
    }
}
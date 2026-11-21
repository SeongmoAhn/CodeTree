import java.util.*;
public class Main {
    public static void main(String[] args) {
        String str = new Scanner(System.in).next();
        System.out.printf("%s %s", ans(str.contains("ee")), ans(str.contains("ab")));
    }
    
    private static String ans(boolean b) {
        return b ? "Yes" : "No";
    }
}
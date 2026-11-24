import java.util.*;
public class Main {
    public static void main(String[] args) {
        String str = new Scanner(System.in).next();
        int idx = str.indexOf("e");
        System.out.print(str.substring(0, idx) + str.substring(idx + 1));
    }
}
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        A[] arr = new A[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new A(sc.next(), sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(arr);

        for (A a : arr) {
            System.out.printf("%s %d %d\n", a.name, a.A, a.B);
        }

        // Please write your code here.
    }
}

class A implements Comparable<A> {
    String name;
    int A;
    int B;

    public A(String name, int A, int B) {
        this.name = name;
        this.A = A;
        this.B = B;
    }

    @Override
    public int compareTo(A a) {
        return this.A - a.A;
    }
}
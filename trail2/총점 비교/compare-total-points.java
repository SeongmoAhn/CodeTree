import java.util.*;
class student {
    String n;
    int a, b, c;
    public student(String n, int a, int b, int c) {
        this.n = n; this.a = a; this.b = b; this.c = c;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        student[] students = new student[N];
        for (int i = 0; i < N; i++) {
            students[i] = new student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(students, (a, b) -> (a.a + a.b + a.c) - (b.a + b.b + b.c));
        for (student stu : students) {
            System.out.printf("%s %d %d %d\n", stu.n, stu.a, stu.b, stu.c);
        }
    }
}
import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t[] = new int[10];

        for (int i = 0; i < 10; i++) {
            t[i] = n * (i + 1);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(n + " * " + (i + 1) + " = " + t[i]);
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int print1 = a + b - c;
        System.out.println(print1);

        String A = Integer.toString(a);
        String B = Integer.toString(b);
        String what = A + B;
        int ab = Integer.parseInt(what);
        int print2 = ab - c;
        System.out.println(print2);
    }
}
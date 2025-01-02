import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();

        // 1 =3+1
        // 2 =3+3+2
        // 3 = 3+3+3+3

        long sum = 3*n+n;
        System.out.println(sum);
    }
}

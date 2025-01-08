import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextInt();
        long b = sc.nextInt();
        long ab = a*b;

        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
            }
        long result = ab/a;
        System.out.println(result);

    }
}

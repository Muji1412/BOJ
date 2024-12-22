import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int B = scanner.nextInt();
        int A = scanner.nextInt();

        int a = B * (A % 10);
        int b = B * ((A % 100) / 10);
        int c = B * (A / 100);

        System.out.println(B * (A % 10));
        System.out.println(B * ((A % 100) / 10));
        System.out.println(B* (A/100));
        System.out.println(a+b*10+c*100);

    }
}
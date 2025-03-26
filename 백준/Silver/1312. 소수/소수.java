import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();


        a %= b;
        for (int i = 1; i < n; i++) {
            a *= 10;
            a %= b;

        }

        a *= 10;


        System.out.println(a / b);



    }
}

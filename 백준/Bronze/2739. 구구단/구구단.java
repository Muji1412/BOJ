import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int a = scanner.nextInt();
        int n = 1;

        while (n <= 9) {
            System.out.println(a + " * " + n + " = " + a * n);
            n++;
        }
    }
}

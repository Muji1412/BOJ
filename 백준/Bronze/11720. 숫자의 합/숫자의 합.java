import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String input = scanner.nextLine();
        int sum =0 ;

        int[] digits = new int[n];

        for (int i = 0; i < n; i++) {
            digits[i]=Character.getNumericValue(input.charAt(i));
        }
        for (int i = 0; i < n; i++) {
            sum += digits[i];
        }
        System.out.println(sum);
    }
}
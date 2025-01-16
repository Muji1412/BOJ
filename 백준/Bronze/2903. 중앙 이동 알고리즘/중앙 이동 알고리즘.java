import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 초기에 4개
        int n = scanner.nextInt();
        int num = 3;

        for (int i = 0; i < n-1; i++) {
            num +=num - 1;
//            System.out.println(num);
        }
        System.out.println(num * num);
    }
}

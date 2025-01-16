import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int primeNumber = 0;

        // n 받기
        int n = scanner.nextInt();
        scanner.nextLine(); //개행문자 소비

        //주어진 수들 받기
        String input = scanner.nextLine();
        String[] temp = input.split(" ");

        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(temp[i]);
        }

        // 7 대입한다고 가정하고, 2부터 6까지 계속 대입해서 나눠진 값이 0이 아니면.
        // 예외사항 만들어야함.
        for (int i = 0; i < n; i++) {
            if (num[i] == 2) {
                primeNumber++;
            }
            counter = 0;
            for (int j = 2; j < num[i]; j++) {
                if (num[i] % j != 0) {
                    counter++;
                }
                if (counter == num[i] - 2) {
                    primeNumber++;
                }
            }
        }
        System.out.println(primeNumber);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] cardList = new int[n];

        for (int i = 0; i < n; i++) {
            cardList[i] = scanner.nextInt();
        }

        int answer = findsum(cardList, n, m);
        System.out.println(answer);

    }

    public static int findsum(int[] array, int n, int m) {
        int result = 0;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int temp = array[i]+array[j]+array[k];

                    if (temp>result && temp<=m) {
                        result = temp;
                    }
                }
            }
        }
        return result;
    }
}

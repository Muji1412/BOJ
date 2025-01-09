import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];
        int[] distanceArr = new int[n-1];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n-1; i++) {
            //01 12 23
            distanceArr[i] = arr[i + 1] - arr[i];
        }

        // 최대공약수 받기
        int gcdSave = distanceArr[0];

        for (int i = 0; i < distanceArr.length; i++) {
            gcdSave = GCD(distanceArr[i], gcdSave);
        }

        // 나무 거리를 최대공약수로 나눠주고 그 값에 -1해서 sum
        int distanceSum = 0;
        for (int i = 0; i < distanceArr.length; i++) {
            int a = distanceArr[i] / gcdSave - 1;
            distanceSum += a;
        }

        System.out.println(distanceSum);

    }

    static int GCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long[] arr = new long[101];

        //1, 1, 1, 2, 2, 3, 4, 5, 7, 9

        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 2;
        arr[4] = 2;

        for (int i = 5; i < arr.length; i++) {
            arr[i] = arr[i-2] + arr[i-3];
//            System.out.println(arr[i]);
        }

        while (n-- > 0) {
            int a = sc.nextInt();
            System.out.println(arr[a - 1]);
        }
    }
}

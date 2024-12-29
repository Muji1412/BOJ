import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        for (int i = 0; i < m; i++) {
            change(arr,sc.nextInt(), sc.nextInt());
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void change(int[] arr, int a, int b) {

        int arrA = a - 1;
        int arrB = b - 1;
        int temp;

        //1,4 일 경우, 2번 바꿔줘야함. (4-1+1)/2 해야 2 나옴
        //2,2 일 경우 바꿀필요 없음 (2-2+1)/2 = 0

        for (int i = 0; i < (b - a+1)/2; i++) {
            temp = arr[arrA+i];
            arr[arrA+i] = arr[arrB-i];
            arr[arrB-i] = temp;
        }

    }
}

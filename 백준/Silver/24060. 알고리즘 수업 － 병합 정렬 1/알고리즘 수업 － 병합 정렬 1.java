import java.util.Scanner;

public class Main {
    static int counter = 0;
    static int kCount;
    static int[] sorted;
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        kCount = sc.nextInt();

        arr = new int[a];
        sorted = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        mergeSort(0, arr.length - 1);

        if (kCount > counter) {
            System.out.println(-1);
        }
    }
        // 그냥 애초에 스태틱으로 선언해서 좌, 우, 미드만 넣어주는게 제일 간단함


    public static void mergeSort(int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(left, mid);
            mergeSort(mid + 1, right);
            // 비교해서 원본배열에 넣는건 머지에서 구현
            merge(left, mid, right);
        }
    }

    public static void merge(int left, int mid, int right) {


        int i = left, j = mid + 1, k = left;

        while (i <= mid && j <= right) {
            if (arr[i] < arr[j]) {
                sorted[k++] = arr[i++];
            } else {
                sorted[k++] = arr[j++];
            }
            countAndCheck(k);
        }


        // 전부 다 끝내버린 경우, i가 미드값을 넘어버린 경우
        if (i > mid) {
            for (int l = j; l <= right; l++) {
                sorted[k++] = arr[l];
                countAndCheck(k);

            }
        }else{
            for (int l = i; l <= mid; l++) {
                sorted[k++] = arr[l];
                countAndCheck(k);

            }
        }

        for (int l = left; l <= right; l++) {
            arr[l] = sorted[l];
        }
    }
    public static void countAndCheck(int k) {
        counter++;
        if (counter == kCount) {
            System.out.println(sorted[k-1]);
        }

    }
}

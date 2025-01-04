import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 입력, n이랑 m
        int n = scanner.nextInt();
        long[] mains = new long[n];
        for (int i = 0; i < mains.length; i++) {
            mains[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        long[] checkList = new long[m];
        for (int i = 0; i < checkList.length; i++) {
            checkList[i] = scanner.nextInt();
        }
        // 정렬
        Arrays.sort(mains);

        // 바이너리서치 ㄱㄱ


        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < checkList.length; i++ ) {
            long target = checkList[i];
            if (binarySearch(mains, target)) {
                sb.append(1);
            } else {
                sb.append(0);
            }

            if (i < m - 1) {
                sb.append("\n");
            }
        }


        System.out.println(sb);

     }
     public static boolean binarySearch(long[] arr, long target) {
         int left = 0;
         int right = arr.length - 1;

         while (left<=right){
             int mid = (left+right)/2;

             if (arr[mid]==target) {
                 return true;
             } else if (arr[mid]<target) {
                 left = mid+1;
             } else {
                 right = mid-1;
             }
         }
         return false;
     }

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int needLength = Integer.parseInt(st.nextToken());

        int[] trees = new int[n];

        int maxTreeHeight = Integer.MIN_VALUE;

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            trees[i] = Integer.parseInt(st1.nextToken());
            maxTreeHeight = Math.max(maxTreeHeight, trees[i]);
        }

        int left = 0;
        int right = maxTreeHeight;
        int answer = 0;

        while (left <= right) {
            int mid = (left + right) / 2;
            long treeSum = 0;
            for (int treeSize : trees) {
                if (treeSize > mid) {
                    treeSum += treeSize - mid;
                }
            }

            if (treeSum >= needLength) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(answer);


    }

}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static int n;

    static int[] arr;
    static boolean[] visited;

    static List<List<Integer>> list = new ArrayList<List<Integer>>();
    public static void main(String[] args) {
        // 완전 이진 트리면, 애초에 무조건 각 층별로 *2개수가 보장됨
        // 1 - 1
        // 2 - 2
        // 3 - 4
        // 4 - 8
        // 5 - 16 ...

        // 주어지는 값은

        // 1 6 4 3 5 2 7 주어질때, 3 - 6,2 - 1,4,2,7 이런식으로 주어지는데
        // 뎁스 5면 플마값을 8 4 2 1 뎁스 4면 4 2 1로 가야하고 뎁스 3이면 2 1 이런식으로 가야함

        // 값을 받을 배열
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arrLen = (int) Math.pow(2, n) -1;

        // 쉽게 풀고싶으니까 1based로 풀기
        arr = new int[arrLen+1];
        visited = new boolean[arrLen+1];

        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 1; i <= arrLen; i++) {
            arr[i] = sc.nextInt();
        }


        // 깊이별로 구해줘야함, 1층에 뭐가 있고, 2층에 뭐가 있고, 3층에 뭐가 있고..
        // 시작값은 항상 정가운데 위치할건데, 시작점은 2^n-1에 위치함
        int startIndex = (int) Math.pow(2, n - 1);

        solve(startIndex, startIndex, 0);
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j) + " ");
            }
            System.out.println();
        }

        // 시작은 인덱스에서 하고, 이후 +- 2^n-2 지점의 값이 다음 층이 가지고 있는 노드, 재귀해야함
    }
    public static void solve(int start,int lengthMaker, int depth){
        if (depth == n) {
            return;
        }
//        System.out.println("start = " + start);
        if (start>=0 && start<arr.length) {
            list.get(depth).add(arr[start]);
        }
//        System.out.println("depth = " + depth);
//        System.out.println("start = " + start);

        // 세주다가, 1,3,7,15에 해당하면 쉬어주기?
        int curPlusMinus = lengthMaker / 2;
        int left = start - curPlusMinus;
        int right = start + curPlusMinus;
        int nextChcker = depth +1 ;
        solve(left,lengthMaker/2, nextChcker);
        solve(right,lengthMaker/2, nextChcker);

    }
}

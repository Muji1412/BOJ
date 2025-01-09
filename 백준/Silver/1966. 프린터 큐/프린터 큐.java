import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {

            // 큐에 배열도 넣을수있음
            Queue<int[]> que = new LinkedList<>();

            int a = sc.nextInt();
            int b = sc.nextInt(); // 몇번째로 튀어나가는지 궁금한
            for (int j = 0; j < a; j++) {
                que.offer(new int[]{sc.nextInt(), j});
            }

            //값, 번호표(인덱스) 순으로 붙힘

            // poll로 뽑아보고, 남아있는 배열 내에서 가장 큰 값이면 그대로 뽑고, 아니면 다시 넣어줘야함
            // 현재 큐 상태 // b값은 2
            // 1 2 3 4
            // 0 1 2 3
            int count = 0;
            while (true) {
                int biggerFlag = 0;

                //큐에서 값 뽑음

                int[] arr = que.poll();

                // 값 출력 전에 우선순위 체크부터 해야함.


                //더 큰 값 있는지 체크

                for (int[] val : que) {
                    if (val[0] > arr[0]) {
                        biggerFlag = 1;
                        break;
                    }
                }

                if (biggerFlag == 1) {
                    que.offer(new int[]{arr[0], arr[1]});
                } else if (biggerFlag == 0) {
                    count++;
                    if (arr[1] == b) {
                        System.out.println(count);
                        break;
                    }
                    //비거플래그 있다면 다시 큐값에 넣고, 없으면 뽑아버리기, 추가로 카운터 추가해주기.
                }
            }
        }
    }
}

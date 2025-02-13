import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        // 거꾸로 가야지 메모리 초과를 피할수있음
        // 단, 거꾸로 갈때는 %10 = 1일때만 실행해주면 되므로 while문 작성
        int count = 0;
        boolean flag = true;
        while (A != B) {
            if (B < A) {
                System.out.println(-1);
                flag = false;
                break;
            } else if (B % 2 == 0) { // 2로 나눌 수 있을 때
                B /= 2;
                count++;
            } else if (B % 10 == 1) {
                B = B / 10;
                count++;
            } else {
                System.out.println(-1);
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println(count+1);
        }

//        // 가능한 연산 두가지
//        // 1. 2배
//        // 2. * 10 + 1
//
//        // 연산횟수 최소값 + 1 출력, 만들수 없는 경우에는 -1 출력
//
//        // 예를 들어서 2 42 기준으로, 2,4,8,16,32,64 <- 4번 초과, 5번 이상 실행한 경우에는 -1을 출력 (더 작아질 수 없음)
//        int temp = A;
//        while (temp < B) {
//            temp *= 2;
//            max++;
//        }
//        // 4 -> 42 기준 max 4
//
//        bfs(A, 0);
//        if (!flag) {
//            System.out.println(-1);
//        }
//
//    }
//    public static void bfs(int A, int count) {
//        // x2랑 x10+1의 경우에는 겹칠일이 거의 없으므로 visited 사용 안해도될듯?
//
//        Queue<int[]> q = new LinkedList<int[]>();
//        q.add(new int[] { A, count });
//        while (!q.isEmpty()) {
//            int[] cur = q.poll();
//            int curA = cur[0];
//            int curCount = cur[1];
//            if (curA == B) {
//                System.out.println(curCount+1);
//                flag = true;
//                return;
//            }
//
//            if (curCount >= max) {
//                return;
//            }
//            // 가능한 다음 두가지 수 넣어주기
//            int nextA1 = curA * 2;
//            int nextA2 = curA * 10 + 1;
//            int nextCount = curCount + 1;
//
//            q.offer(new int[] { nextA1, nextCount });
//            q.offer(new int[] { nextA2, nextCount });
//        }
    }
}

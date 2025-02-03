import java.util.*;

public class Main {

    static int n, m;
    static List<List<Integer>> list = new ArrayList<>();
    static boolean[] visited;
    public static void main(String[] args) {
        //케빈베이컨 메서드 만듬
        //만들어서 리턴값으로 총 몇단계 필요한지 뱉어야함
        //1부터 끝까지 돌릴거니까, 같은 값 나오는 경우에는 적은게 자동으로 선택될거임
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }

        visited = new boolean[n+1];

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            list.get(a).add(b);
            list.get(b).add(a);
        }

        int a = Integer.MAX_VALUE;
        int t = 0;
        for (int i = 1; i <= n; i++) {
            int solve = baconSolve(i);
            if (solve < a) {
                t = i;
                a = solve;
            }
        }

        System.out.println(t);
        

    }

    public static int baconSolve(int start) {
        // 전부 연결되게 되어 있음
        // 단, 연결됐을 때의 값이 몇단계인지 계산하여 출력해줘야함
        int count = 0;
        int whereNow = 0;


        // 이런 경우에는 bfs를 써야지 값이 빨리나옴.
        for (int i = 1; i <= n; i++) {

            if (start != i) {
                visited = new boolean[n+1];
                Queue<int[]> q = new LinkedList<>();
                visited[start] = true;
                q.offer(new int[]{start, 0});
                while (!q.isEmpty()) {
                    int[] cur = q.poll();
                    int curIndex = cur[0];
                    int curVal = cur[1];

                    if (curIndex == i) {
                        count+=curVal;
                        break;
                    }
                    for (int next : list.get(curIndex)) {
                        if (!visited[next]) {
                            visited[next] = true;
                            q.offer(new int[]{next, curVal+1});
                        }
                    }
                }

            }

        }
        return count;
    }

}

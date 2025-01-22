import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    // DFS 에 필요한 어레이리스트
    static ArrayList<Integer>[] graph;
    static boolean[] visited;


    // i번째 갔던곳 찍어야하니까 순서배열 필요함
    static int[] now;
    static int count = 1;
    // 기본적으로 사용할 변수들
    static int N, M, I;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        I = sc.nextInt();

        //틀린 이유
        //그래프랑 방문확인 불린은 '정점' 기준으로 만들어야함
        //반복은 간선의 수 만큼 해야하지만, 그래프랑 방문확인 불린값은 정점기준으로 만들어야하기때문에 틀렸음

        graph = new ArrayList[N + 1];
        visited = new boolean[N + 1];
        now = new int[N + 1];
        // 어레이리스트 초기화는 간선의 수 까지
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        // 간선의 수 만큼 addEdge 해줘야함

        for (int i = 0; i < M; i++) {
            addEdge(sc.nextInt(), sc.nextInt());
        }

        // 그냥 아래 메서드에 간선마다 정렬했더니 시간복잡도 박살남
        // 본문에서 컬렉션소트 구현
        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }

        dfs(I);

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            sb.append(now[i]).append("\n");
        }
        System.out.println(sb);

    }

    public static void dfs(int start) {
        Stack<Integer> stack = new Stack<>();
        stack.push(start);

        while (!stack.isEmpty()) {
            int cur = stack.pop();


            if (!visited[cur]) {
                visited[cur] = true;
                now[cur] = count++;

//                for (int n : graph[cur]) {
//                    if (!visited[n]) {
//                        sta   ck.push(n);
//                    }
//                }

                // 그냥 for문대로 순서대로 처리할때
                // 1 -> 2,4 이므로,
                // 스택 안에 2를 먼저 넣고, 4를 넣음
                // 다음 pop 값이 4가 되므로, 이런 경우에는 1 234 0이 아니라 1 432 0이 출력되게됨
                // for문의 값을 반대로 돌려서 뒷값부터 0까지 조회시켜서 스택에 넣어줘야함

                for (int i = graph[cur].size() - 1; i >= 0; i--) {
                    if (!visited[graph[cur].get(i)]) {
                        stack.push(graph[cur].get(i));
                    }
                }
            }
        }
    }
    public static void addEdge(int v, int w) {
        graph[v].add(w);
        graph[w].add(v);

    }


}

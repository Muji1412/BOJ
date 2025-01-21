import java.util.*;

public class Main {
    static int N, M, V;
    static boolean[] DFSVISITED;
    static boolean[] BFSVISITED;

    // 그래프 - 어레이리스트로 구현
    static ArrayList<Integer>[] graph;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        V = sc.nextInt();
        DFSVISITED = new boolean[N + 1];
        BFSVISITED = new boolean[N + 1];

        graph = new ArrayList[N + 1];

        //지금은 그래프 안에값이 전부 null이라서 안됨
        //for문으로 사용할 그래프들을 전부 객체를 만들어서 널포인터익셉션 안나오게 만들어줘야함
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }



        for (int i = 1 ; i <= M ; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            addEdge(a, b);
        }

        // 노드들 구현 완료 - 아래는 dfs, bfs 구현해서 값 출력하기
        DFS(V);
        System.out.println();
        BFS(V);


    }


    public static void DFS(int input) {
        Stack<Integer> stack = new Stack<>();
        stack.push(input);

        while (!stack.isEmpty()) {
            int current = stack.pop();

            if (!DFSVISITED[current]) {
                DFSVISITED[current] = true;
                System.out.print(current + " ");
            }

            for (int i = graph[current].size() - 1; i >= 0; i--) {
                int next = graph[current].get(i);
                if (!DFSVISITED[next]) {
                    stack.push(next);
                }
            }
        }

    }
    public static void addEdge(int v, int w) {
        graph[v].add(w);
        graph[w].add(v);

        Collections.sort(graph[v]);
        Collections.sort(graph[w]);



        // 양방향 노드 간선 추가해주는 메서드
    }

    public static void BFS(int input) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(input);
        BFSVISITED[input] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            for (int i = 0 ; i <= graph[current].size()-1; i++ ) {
                int next = graph[current].get(i);
                if (!BFSVISITED[next]) {
                    BFSVISITED[next] = true;
                    queue.offer(next);
                }
            }
        }

    }
}

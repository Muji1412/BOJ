import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    static int N;

    static ArrayList<Integer>[] graph;
    static int[][] graphArray;

    public static void main(String[] args) throws IOException {
        // 2차원 배열이 주어짐
        // 2차원 배열에 있는 1이 곧 그래프임
        // 예시로
        //3
        //0 1 0 (1,2)
        //0 0 1 (2,3)
        //1 0 0 (3,1)

        // 이런식으로 리스트로 그래프를 구현함
        // 단, 이때 갈수있는게 양수일때만 갈 수 있으므로 단방향 그래프를 구성함

        // 이떄는 1,2,3이 전부 다른 숫자들을 갈수 있으니까 전부 다 1인 행렬이 됨

        // 주어지는 2차원 좌표 배열을 그래프로 바꿔서 단방향 리스트로 바꾼뒤
        // 그래프의 각 리스트가 어떤 값 까지 갈수있는지를 체크해서 행렬을 만들어서 출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        graphArray = new int[N + 1][N + 1];
        graph  = new ArrayList[N + 1];

        for (int i = 0; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }
        StringTokenizer st;
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                graphArray[i][j] = Integer.parseInt(st.nextToken());
                if (graphArray[i][j] == 1) {
                    addEdge(i, j);
                    graphArray[i][j] = 0;
                }
            }
        }

        // 그래프 다 만들었고
        // dfs 구현해서 갈수있는거 다 체크하고
        // 간 구역이 0이면 1로 바꿔주기

        for (int i = 1; i <= N; i++) {
            DFS(i);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                sb.append(graphArray[i][j] + " ");
            }
            sb.append("\n");
        }

        System.out.println(sb);




    }


    public static void DFS(int start) {
        // 여기서는 visted가 아니라, 간곳이면 배열그래프가 1로 체크할것
        // 1부터 N까지를 DFS를 돌려야함
        // 시작값인 곳은 이미 어레이값에 1이 찍혀있기때문에 상관없음
        // 1 찍을곳은 [start][그래프가 갈수있는 곳]
        Stack<Integer> stack = new Stack<>();
        stack.push(start);

        while (!stack.isEmpty()) {
            int cur = stack.pop();


            for (int i = 0; i <= graph[cur].size() - 1; i++) {
                int next = graph[cur].get(i);
//                System.out.println("start = " + start);
//                System.out.println("next = " + next);
                if (graphArray[start][next] == 0) {
                    stack.push(next);
                    graphArray[start][next] = 1;
                }
            }
        }
    }
    public static void addEdge(int v, int w) {
        graph[v].add(w);
    }
}

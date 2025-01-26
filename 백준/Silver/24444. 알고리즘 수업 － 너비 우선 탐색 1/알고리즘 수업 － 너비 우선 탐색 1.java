import java.util.*;

public class Main {
    static int N,M,I;

    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    //방문순서 저장용
    static int[] whenVisit;
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        I = sc.nextInt();

        visited = new boolean[N+1];
        whenVisit = new int[N+1];



        for (int i = 0; i <= N; i++) {
            list.add(new ArrayList<>());
        }
        
        
        // 간선 방문 횟수 잘못됨, 정점횟수로 세팅해서 한번 틀렸음
        for (int i = 1; i <= M; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            addEdge(a,b);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(list.get(i));
//            System.out.println("i = " + i);
//            System.out.println(list.get(i).toString());
        }

        bfs(I);

        for (int i = 1; i <= N; i++) {
            System.out.println(whenVisit[i]);
        }





    }

    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start] = true;
        count++;
        whenVisit[start] = count;


        while (!q.isEmpty()) {
            int cur = q.poll();

            // for each문은 순서가 보장되지 않기 때문에 일반 for문 사용해줘야함
            for (int i = 0; i < list.get(cur).size(); i++) {
                int a = list.get(cur).get(i);
                if (!visited[a]) {
                    q.offer(a);
                    visited[a] = true;
                    count++;
                    whenVisit[a] = count;
                }
            }
        }
    }



    public static void addEdge(int v, int w) {
        list.get(v).add(w);
        list.get(w).add(v);
    }

}

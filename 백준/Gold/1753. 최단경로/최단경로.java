import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
class Nodee implements Comparable<Nodee>{
    int vertex;
    int cost;

    Nodee(int v, int c){
        this.vertex = v;
        this.cost = c;
    }

    @Override
    public int compareTo(Nodee o) {
        return this.cost - o.cost;
    }
}
public class Main {
    
    static int n,m;
    static ArrayList<ArrayList<Nodee>> graph = new ArrayList<>();
    static int[] dist;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt(); // 정점의 개수
        m = sc.nextInt(); // 간선 개수

        int startPoint = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        dist = new int[n+1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            graph.get(u).add(new Nodee(v,w));
        }

        dijkstra(startPoint, 0);

        for (int i = 1; i < n+1; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                System.out.println("INF");
            } else {
                System.out.println(dist[i]);
            }
        }


    }
    public static void dijkstra(int startPoint, int n) {
        PriorityQueue<Nodee> pq = new PriorityQueue<>();

        dist[startPoint] = 0;
        pq.offer(new Nodee(startPoint,0));

        while (!pq.isEmpty()) {
            Nodee node = pq.poll();
            int curVertex = node.vertex;
            int curCost = node.cost;

            if (dist[curVertex] < curCost) {
                continue;
            }

            for (Nodee next : graph.get(curVertex)) {
                int cost = dist[curVertex] + next.cost;

                if (cost < dist[next.vertex]) {
                    dist[next.vertex] = cost;
                    pq.offer(new Nodee(next.vertex,cost));
                }
            }
        }


    }
}

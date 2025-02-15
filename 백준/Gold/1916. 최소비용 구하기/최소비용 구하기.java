import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

// 노드클래스
class Node implements Comparable<Node> {
    int place;
    int cost;

    Node(int place, int cost) {
        this.place = place;
        this.cost = cost;
    }
    @Override
    public int compareTo(Node o) {
        return cost - o.cost;
    }
}
public class Main {
    static int n, m; // 도시, 버스 개수
    static int start, end; // 마지막줄에 받을 시작 - 끝점
    static int[] dist;

    static ArrayList<ArrayList<Node>> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int cost = sc.nextInt();
            list.get(start).add(new Node(end, cost));
        }

        start = sc.nextInt();
        end = sc.nextInt();

        dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);


        dijikstra(start);

        System.out.println(dist[end]);



    }

    public static void dijikstra(int start) {
        PriorityQueue<Node> pq = new PriorityQueue<>();

        pq.add(new Node(start, 0));
        dist[start] = 0;

        while (!pq.isEmpty()) {
            Node cur = pq.poll();
            int curPlace = cur.place;
            int curCost = cur.cost;

            if (curPlace == end) {
                break;
            }

            if (dist[curPlace] > curCost) {
                continue;
            }

            for (Node nextPlace : list.get(curPlace)) {
                int cost = dist[curPlace] + nextPlace.cost;

                if (cost < dist[nextPlace.place]) {
                    dist[nextPlace.place] = cost;
                    pq.offer(new Node(nextPlace.place, cost));
                }
            }

        }
    }
}

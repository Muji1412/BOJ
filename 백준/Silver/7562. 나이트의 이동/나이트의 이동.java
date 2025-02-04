import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int l = 0;
    static int[][] arr;
    static int destX, destY;
    static boolean[][] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-- > 0) {
            //체스판
            l = sc.nextInt();
            arr = new int[l][l];
            visited = new boolean[l][l];
            //현재 있는 칸
            int startI = sc.nextInt();
            int startJ = sc.nextInt();
            //목표 칸
            destX = sc.nextInt();
            destY = sc.nextInt();

            System.out.println(checkHowFar(startI, startJ));

        }
    }
    // for문으로 돌려서, visited가 false 인 경우를 잡아서 거기서 시작, 얘는 그냥 방문하는거만 해주면 됨
    public static boolean rangeCheck(int i, int j) {
        if (i < 0 || j < 0 || i >= l || j >= l) {
            return false;
        } else {
            return true;
        }
    }

    // bfs로 풀어야함
    public static int checkHowFar(int i, int j) {

        int[] dirX = {-2, -1, -2, -1, 1, 2, 2, 1};
        int[] dirY = {-1, -2, 1, 2, -2, -1, 1, 2};

        Queue<point> q = new LinkedList<>();
        q.offer(new point(i, j, 0));
        visited[i][j] = true;

        while (!q.isEmpty()) {
            point cur = q.poll();
            int curI = cur.x;
            int curJ = cur.y;
            int curCount = cur.count;

            if (curI == destX && curJ == destY) {
                return curCount;
            }

            for (int k = 0; k < 8; k++) {
                int nextI = curI + dirX[k];
                int nextJ = curJ + dirY[k];
                if (rangeCheck(nextI, nextJ) && !visited[nextI][nextJ]) {
                    visited[nextI][nextJ] = true;
                    q.offer(new point(nextI, nextJ, curCount + 1));
                }
            }
        }
        return 0;
    }

    static class point{
        int x,y, count;
        point(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }

}

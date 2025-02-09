import java.util.*;

public class Main {
    static int n;
    static int timeSharkMoved = 0;
    static int babySharkSize = 2;
    static int curSharkAte = 0;

    static int[][] arr;
    static int[][] timeMoved;
    static boolean[][] visited;

    static int curSharkI;
    static int curSharkJ;

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n][n];


        int sharkI = 0;
        int sharkJ = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] == 9) {
                    sharkI = i;
                    sharkJ = j;
                    arr[i][j] = 0;
                }
            }
        }
        curSharkI = sharkI;
        curSharkJ = sharkJ;


        while (true) {
            int movedDist = sharkMove(curSharkI, curSharkJ);

            if (movedDist == 0) {
                break;
            }
            eatFish();
            timeSharkMoved += movedDist;
        }

        System.out.println(timeSharkMoved);

    }



    public static int sharkMove(int startI, int startJ) {
        int[] dirx = {-1, 0, 0, 1};
        int[] diry = {0, -1, 1, 0};

        boolean found = false;
        int firstFound = 0;
        ArrayList<int[]> list = new ArrayList<>();

        Queue<int[]> q = new LinkedList<>();
        visited = new boolean[n][n];
        timeMoved = new int[n][n];

        q.add(new int[]{startI, startJ});
        visited[startI][startJ] = true;
        timeMoved[startI][startJ] = 0;


        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int curI = cur[0];
            int curJ = cur[1];

            // 이미 찾았을때 더 볼필요 없게
            if (found && timeMoved[curI][curJ] > firstFound) {
                break;
            }

            for (int i = 0; i < 4; i++) {
                int nextI = curI + dirx[i];
                int nextJ = curJ + diry[i];
                // 탐색 끝났을때


                // 이프문, 다음 길이 arr 범위에 벗어나지 않고, 이미 갔던 길이 아닐때.
                if (rangeCheck(nextI, nextJ) && !visited[nextI][nextJ]) {
                    visited[nextI][nextJ] = true;
                    timeMoved[nextI][nextJ] = timeMoved[curI][curJ] + 1;
                    // 간 곳에 물고기가 있을때, 나보다 작으면 먹기
                    if (arr[nextI][nextJ] < babySharkSize && arr[nextI][nextJ] != 0) { // 물고기 찾았을때
                        if (!found) {
                            found = true;
                            firstFound = timeMoved[nextI][nextJ];
                        }
                        if (timeMoved[nextI][nextJ] == firstFound) {
                            list.add(new int[]{nextI, nextJ});
                        }
                    }
                    if (arr[nextI][nextJ] <= babySharkSize) {
                        q.offer(new int[]{nextI, nextJ});
                    }

                }
            }
        }
        if (!list.isEmpty()) {
            int[] top = list.get(0);
            for (int[] fish : list) {
                if (fish[0] < top[0] || (fish[0] == top[0] && fish[1] < top[1])) {
                    top = fish;
                }
            }
            curSharkI = top[0];
            curSharkJ = top[1];
            arr[curSharkI][curSharkJ] = 0;
            return firstFound;
        }
        return 0;
    }
    public static boolean rangeCheck(int i, int j) {
        if (i < 0 || i >= n || j < 0 || j >= n) {
            return false;
        }
        return true;
    }
    // '자기보다 작은' 물고기만 먹을 수 있음
    // 단, 사이즈와 상관 없이 지나갈수 있음.
    // 먹을때마다 curSharkAte를 하나 늘려주고, 샤크사이즈 = curSharkAte와 일치되는 경우에, 샤크사이즈를 1 늘리고 cur 초기화
    public static void eatFish(){
        curSharkAte++;
        if(curSharkAte == babySharkSize){
            babySharkSize++;
            curSharkAte = 0;
        }
    }
}


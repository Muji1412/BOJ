import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double possSum = 0; // 가능성 저장용

        int n = sc.nextInt();
        int rockCounter = 0;
        int[] colors = new int[n];
        for (int i = 0; i < n; i++) {
            colors[i] = sc.nextInt();
            rockCounter += colors[i];
        }

        // 5 6 7임
        // 여기서 2번 뽑을거임


        int pick = sc.nextInt();

        double[] poss = new double[n];
        for (int i = 0; i < n; i++) {
            poss[i] = 1;
        }

        // 픽을 3번한다고 가정하면,
        // 1번째는 고를 돌 / 총 돌 개수
        // 2번째는 고를 돌 -1 / 총 돌 개수 -1
        // 3번째는 고를 돌 -2 / 총 돌 개수 -2

        // 모든 돌의 케이스를 돌려야함
        for (int i = 0; i<colors.length; i++) {
            // 이중포문으로 구현하기, 지금은 2번 뽑을거임
            double possNow = 1;
            for (int j = 0; j < pick; j++) {
                possNow = possNow * (colors[i] - j) / (rockCounter - j);
            }
            possSum += possNow;
        }
        System.out.println(possSum);
    }

}

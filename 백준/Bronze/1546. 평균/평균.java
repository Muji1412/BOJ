import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        double[] scores = new double[n];
        double maxScore = 0;
        double sum = 0;
        double avgScore = 0;


        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
            if (maxScore < scores[i]) {
                maxScore = scores[i];
            }
            //그리고 나서 모든 점수를 점수/M*100으로 고쳤다
            //스코어값 하나 더 만들지 말고 그냥 스코어값 바꾸기
        }
        for (int i = 0; i < n; i++) {
            scores[i] = (scores[i]/maxScore * 100);
//            System.out.println("scores[i] = " + scores[i]);
            sum += scores[i];
        }
        avgScore = sum / n;
        System.out.println(avgScore);
    }
}

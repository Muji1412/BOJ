import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long N = scanner.nextLong();

        //MenOfPassion(A[], n) {
        //    sum <- 0;
        //    for i <- 1 to n
        //        for j <- 1 to n
        //            sum <- sum + A[i] × A[j]; # 코드1
        //    return sum;
        //}
        //첫째 줄에 코드1 의 수행 횟수를 출력한다.
        //
        //둘째 줄에 코드1의 수행 횟수를 다항식으로 나타내었을 때, 최고차항의 차수를 출력한다.
        // 단, 다항식으로 나타낼 수 없거나 최고차항의 차수가 3보다 크면 4를 출력한다.

        System.out.println(N*N);
        System.out.println("2");
    }
}

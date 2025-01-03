import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        //MenOfPassion(A[], n) {
        //    sum <- 0;
        //    for i <- 1 to n - 2
        /// 1,2 34567
        /// 1,3 4567
        /// 1,4 567
        /// 1,5 67
        /// 1,6 7
        ///  54321 4321 321 21 1 더해줌
        ///  15 + 10 + 6 + 3 + 1 = 35

        //        for j <- i + 1 to n - 1
        ///
        //            for k <- j + 1 to n
        //                sum <- sum + A[i] × A[j] × A[k]; # 코드1
        //    return sum;
        //}

        // 예제 7 입력시 35 / 3

        long sum1 = 0L;
        long sum2 = 0L;

        for (int i = 1; i < n-1; i++) {
            sum1 += i;
            sum2 += sum1;

        }

        System.out.println(sum2);
        System.out.println(3);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // log m 이하, 체에 거를 체크용 소수들 먼저 뽑기

        int logm = (int) Math.sqrt(m);
        int[] logmArr = new int[logm+1];
        for (int i = 3; i<=logm; i++) {
            logmArr[i] = i;
        }

        // m만한 사이즈의 배열만 있으면 됨
        // 1부터 100까지 한다고 치면 로그m은 10
        // 2는 수동으로 추가해줄거니까 +1
        int[] primeArr = new int[logm+1];
        primeArr[0] = 2;
        for (int i = 3; i < primeArr.length; i++) {
            int a = isPrime(i);
            if (a == 0) {
                primeArr[i] = i;
            }
        }

        // n에서 m까지 있는 배열 만들어주기

        int[] nmArr = new int[m - n + 1];
        for (int i = n; i <= m; i++) {
            nmArr[i-n] = i;
        }

//        System.out.println(Arrays.toString(nmArr));

        for (int i = 0; i<nmArr.length; i++) {
            for (int j = 0; j < primeArr.length; j++) {
                if (nmArr[i] != 0 && primeArr[j] != 0) {
                    if (nmArr[i]%primeArr[j] == 0 && nmArr[i] != primeArr[j]) {
                        nmArr[i] = 0;
                        break;
                    }
                }
            }
        }

        for (int value : nmArr) {
            if (value != 0 && value != 1) {
                System.out.println(value);
            }
        }



    }

    static int isPrime(int n) {
        int a = (int) Math.sqrt(n);
        int flag = 0;

        for (int i = 2; i <= a; i++) {
            if (n % i == 0) {
                flag = 1;
            }
        }
        return flag;
    }
}

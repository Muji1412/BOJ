import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int n = sc.nextInt();

            // 0이면 종료
            if(n == 0) break;


            // n부터 2n까지 계산해줘야함
            // n보다 크고, 2n보다 작거나 같은 소수의 개수를 출력
            // 고로 n+1부터, 2n까지의 리스트가 필요함

            // n부터 2n까지의 어레이, 2n - n + 1, +1 해줘야지 오류가 없음

            int[] arr = new int[n + 1];

            for (int i = n+1; i <= n * 2; i++) {
                if (i == 1) {
                    arr[i] = 0;
                } else {
                    arr[i - n] = i;
                }
            }

            // 검사용 2n의 log값 생성
            // 이후 어레이 하나 더 만들어서 저장

            int sq = (int)Math.sqrt(n * 2);

            int[] sqArr = new int[sq + 1];

            // 검사용 소수 리스트, 얘네랑 비교해서 체에 걸러내기
            for(int i = 2; i <= sq; i++) {
                if (isPrime(i) == 0) {
                    sqArr[i] = i;
                }
            }

            // 개수를 출력하는거니까, 둘이 비교해서 쳐내기

            int NotprimeCount = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j<sqArr.length; j++) {
                    if (arr[i] != 0 && sqArr[j] != 0) {

                        if (arr[i] % sqArr[j] == 0 && arr[i] != sqArr[j]) {
                            arr[i] = 0;
                            break;
                        }
                    }
                }
            }

            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    count++;
                }
            }

            System.out.println(count);




        }
    }

    static int isPrime(int n) {
        if (n == 1) return 1;
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

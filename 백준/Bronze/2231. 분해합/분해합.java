import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int result = 0; // 저장용

        for(int i = 0; i < N; i++) {
            int number = i; // 현재 수 = number
            int sum = 0;

            while(number != 0) {
                int a = number % 10;
                sum += a;
                number /= 10;
            }

            if(sum + i == N) {
                result = i;
                break;
            }
            // for문 -> 0부터 N까지 숫자를 전부 셈

            // while문 -> 198이라는 숫자가 들어올때, 1,10,100의 자리의 숫자들을 뽑아서 sum에 저장
            // 저장하는 과정 -> 숫자를 %10 해주면, 일의 자리의 수가 나머지로 남음 (198 % 10 = 8)
            // 다음 자리의 수를 구하고 싶다면 숫자에 /10 해준 후 %10을 해주면 됨 (198 / 10 = 19 , 이후 19 % 10 = 9)
            // 이 과정을 한번 더 거치면 (19 / 10 = 1 , 1 % 10 = 1) 이므로, 8,9,1 각 자리수를 전부 구할 수 있음

            // 마지막 if문 -> 현재 I+sum (198 + sum(1+9+8)) 이 n과 일치할때, result에 저장하고 break로 중단

        }

        System.out.println(result);
    }
}
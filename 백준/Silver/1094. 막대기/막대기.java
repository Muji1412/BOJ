import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //지민이는 길이가 64cm인 막대를 가지고 있다. 어느 날, 그는 길이가 Xcm인 막대가 가지고 싶어졌다. 지민이는 원래 가지고 있던 막대를 더 작은 막대로 자른다음에,
        // 붙여서 길이가 Xcm인 막대를 만들려고 한다.
        //
        //막대를 자르는 가장 쉬운 방법은 절반으로 자르는 것이다. 지민이는 아래와 같은 과정을 거쳐서 막대를 자르려고 한다.
        //
        //지민이가 가지고 있는 막대의 길이를 모두 더한다. 처음에는 64cm 막대 하나만 가지고 있다. 이때, 합이 X보다 크다면, 아래와 같은 과정을 반복한다.
        //가지고 있는 막대 중 길이가 가장 짧은 것을 절반으로 자른다.
        //만약, 위에서 자른 막대의 절반 중 하나를 버리고 남아있는 막대의 길이의 합이 X보다 크거나 같다면, 위에서 자른 막대의 절반 중 하나를 버린다.
        //이제, 남아있는 모든 막대를 풀로 붙여서 Xcm를 만든다.

        //64cm에서 xCm으로 보내기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // n번 잘라야햐ㅏ는데, 몇번 잘라야하게요?

        int a = 64;
        int b = 32;
        int c = 16;
        int d = 8;
        int e = 4;
        int f = 2;
        int g = 1;

        int count = 0;
        while (true) {
            if (n >= a) {
                n -= a;
                count++;
            } else if (n >= b) {
                n -= b;
                count++;
            } else if (n >= c) {
                n -= c;
                count++;
            } else if (n >= d) {
                n -= d;
                count++;
            } else if (n >= e) {
                n -= e;
                count++;
            } else if (n >= f) {
                n -= f;
                count++;
            } else if (n >= g) {
                n -= g;
                count++;
            } else {
                break; // n이 0이 되면 반복문 종료
            }
        }

        System.out.println(count);
    }
}

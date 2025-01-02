import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            int longOne;
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();


            // 세개 다 같음 - 두개 같음 - 세개 같음 순서로 넣어주기
            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            // abc 비교해서 제일 긴 변 찾기
            if (a>b) {
                longOne = a;
            }else longOne = b;

            if (longOne < c) {
                longOne = c;
            }


            //오늘 배운것
            // 와일문에서 컨티뉴를 집어넣으면 아래는 더이상 체크 안하고 다음 반복으로 간다
            if (longOne == a && a >= b + c) {
                System.out.println("Invalid");
                continue;
            }
            if (longOne == b && b >= a + c) {
                System.out.println("Invalid");
                continue;
            }
            if (longOne == c && c >= a + b) {
                System.out.println("Invalid");
                continue;
            }

            if (a == b && a == c && b == c) {
                System.out.println("Equilateral ");
            } else if (a == b || a == c || b == c) {
                System.out.println("Isosceles ");
            } else if (a != b && a != c && b != c) {
                System.out.println("Scalene");
            }
        }
    }
}

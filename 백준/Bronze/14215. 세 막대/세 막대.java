import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int lengthsum = 0;

        int longOne = findLongestSide(a, b, c);
        String longStr = findLongStr(a, b, c);


        // 삼각형이 되기 위한 조건 = 제일 긴 변 a < 다른 변 2개 b+c
//        System.out.println(longOne);
//        System.out.println(longStr);



        // 1. 딱히 조절 안해도 되는 경우
        // 2. 조절을 해줘야 삼각형 성립이 되는 경우

        // 가장 긴게 a인 케이스
        if (longStr.equals("a")) {
            if (a < b + c) {
                lengthsum = a + b + c;
            } else {
                while (a >= b + c) {
                    a--;
                }
                lengthsum = a + b + c;
            }
        }
        if (longStr.equals("b")) {
            if (b < a + c) {
                lengthsum = a + b + c;
            } else {
                while (b >= a + c) {
                    b--;
                }
                lengthsum = a + b + c;
            }
        }
        if (longStr.equals("c")) {
            if (c < a + b) {
                lengthsum = a + b + c;
            } else {
                while (c >= a + b) {
                    c--;
                }
                lengthsum = a + b + c;
            }
        }
        System.out.println(lengthsum);

    }
    //이런식으로 간단히 구현 가능
    private static int findLongestSide(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
    private static String findLongStr(int a, int b, int c) {
        String temp = "null";
        if (Math.max(Math.max(a, b), c) == a) {
            temp = "a";
        } else if (Math.max(Math.max(a, b), c) == b) {
            temp = "b";
        } else if (Math.max(Math.max(a, b), c) == c) {
            temp = "c";
        }
        return temp;
    }
}

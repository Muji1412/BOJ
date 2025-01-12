import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Stack<Integer> stack = new Stack<Integer>();

        int count = 1;

        // 1을 받으면 2, 2 받으면 3, 4,5,6...
        // 카운터랑 다른 경우에는 스택에 넣어서 나중에 비교

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a == count) {
                count++;
            } else {
                while (!stack.isEmpty() && count == stack.peek()) {
                    stack.pop();
                    count++;
                }
                stack.push(a);
            }

        }

        while (!stack.isEmpty() && stack.peek() == count) {
            stack.pop();
            count++;
        }


        if (stack.isEmpty()) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }

    }
}

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a == 0) {
                stack.pop();
            } else {
                stack.push(a);
            }
        }
        int sum = 0;
        for (int val : stack) {
            sum += val;
        }

        System.out.println(sum);

    }
}

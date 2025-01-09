import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if (s.startsWith("1")) {
                String num = s.split(" ")[1];
                stack.push(Integer.parseInt(num));
            } else if (s.equals("2")) {
                if (stack.isEmpty()) {
                    System.out.println("-1");
                } else {
                    int a = stack.pop();
                    System.out.println(a);
                }
                
            } else if (s.equals("3")) {
                System.out.println(stack.size());
            } else if (s.equals("4")) {
                if (stack.isEmpty()) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            } else if (s.equals("5")) {
                if (stack.isEmpty()) {
                    System.out.println("-1");
                } else {
                    int a = stack.peek();
                    System.out.println(a);
                }

            }
        }


    }
}


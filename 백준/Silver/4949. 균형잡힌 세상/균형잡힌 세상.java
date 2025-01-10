import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            String s = br.readLine();
            String[] arr = s.split("");

            //온점 종료
            if (arr.length == 1 && arr[0].equals("."))
                break;
            Stack<String> stack =new Stack<String>();

            //모든 왼쪽 소괄호("(")는 오른쪽 소괄호(")")와만 짝을 이뤄야 한다.
            //모든 왼쪽 대괄호("[")는 오른쪽 대괄호("]")와만 짝을 이뤄야 한다.

//            System.out.println("현재 단어 " + s);

            int flag = 0;

            for (int i = 0; i < arr.length; i++) {
                String a = arr[i];

                if (a.equals("(")) {
                    stack.push(a);
                }

                if (a.equals("[")) {
                    stack.push(a);
                }

                if (a.equals(")")) {
                    // 닫는 경우
                    // 뽑아야하니까 엠프티부터 체크
                    // 아무것도 없는 경우에는 애초에 틀림
                    if (stack.isEmpty()) {
                        flag = 1;

                        // ( 이게 와야하는데 [이게 있으면 안됨
                    } else if (stack.peek().equals("[")) {
                        flag = 1;

                        // 둘 다 아닌경우이므로 정상작동해서 지움
                    } else {
                        stack.pop();
                    }

                }

                if (a.equals("]")) {
                    if (stack.isEmpty()) {
                        flag = 1;
                    }else if (stack.peek().equals("(")){
                        flag = 1;
                    } else {
                        stack.pop();
                    }
                }

            }
            if (!stack.isEmpty()) {
                flag = 1;
            }

            if (flag == 0) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

        }
    }
}

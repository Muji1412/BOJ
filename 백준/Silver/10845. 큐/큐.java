import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> q = new LinkedList<Integer>();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String C = br.readLine();

            if (C.startsWith("push")) {
                String cNum = C.split(" ")[1];
                q.add(Integer.parseInt(cNum));
            }else if (C.equals("pop")) {
                // 이프값이 아니라 그냥 인티저로 지정하는게 나을듯
                // if (int a = null) 이렇게 지정하면 폴을 두번해버림
                Integer polled = q.poll();
                if (polled == null) {
                    System.out.println("-1");
                } else {
                    System.out.println(polled);
                }
            }else if (C.equals("size")) {
                System.out.println(q.size());
            }else if (C.equals("empty")) {
                if (q.isEmpty()) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            } else if (C.equals("front")) {
                if (q.peek() == null) {
                    System.out.println("-1");
                } else  {
                    System.out.println(q.peek());
                }
            } else if (C.equals("back")) {
                Integer lastValue = null;
                for (int value : q) {
                    lastValue = value;
                }
                if (lastValue == null) {
                    System.out.println("-1");
                } else {
                    System.out.println(lastValue);
                }
            }
        }



    }


}

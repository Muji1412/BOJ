import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] students = new boolean[31];
        for (int i = 0; i < 28; i++) {
            int num = sc.nextInt();
            students[num-1] = true;
        }

        for (int i = 0; i < 30; i++) {
            if (!students[i]) {
                System.out.println(i+1);
            }
        }



    }
}

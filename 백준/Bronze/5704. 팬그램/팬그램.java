import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        while (true) {
            boolean[] alphabet = new boolean[26];
            String s = sc.nextLine();

            if (s.equals("*")) {
                break;
            }

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c != ' '){
                    alphabet[97+25 - c] = true;
                }
            }

            int flag = 0;
            for (int i = 0; i < alphabet.length; i++) {
                if (!alphabet[i]) {
                    flag = 1;
                    System.out.println("N");
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("Y");
            }
        }
    }
}

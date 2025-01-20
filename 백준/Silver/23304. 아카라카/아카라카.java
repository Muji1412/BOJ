import java.util.Scanner;

public class Main {
    static int currentLength = 0;
    static int flag = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        currentLength = input.length();

        isThisAkaraka(input);
        if (checkPalindrome(input)) {
            isThisAkaraka(input);
            if (flag == 0) {
                System.out.println("AKARAKA");
            } else if (flag == 1) {
                System.out.println("IPSELENTI");
            }
        } else {
            System.out.println("IPSELENTI");
        }
    }

    public static boolean checkPalindrome(String input) {

        int inputLength = input.length();
        for (int i = 0; i < inputLength / 2; i++) {
            if (input.charAt(i) != input.charAt((inputLength - 1 - i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isThisAkaraka(String input) {

        currentLength /= 2;

        if (currentLength == 0) {
            return true;
        }


        // 7일때 계산 , 3일때 계산, 1일때 계산 AKARAKA 일때,  AKARAKA, AKA, A 뽑아서 체크
        // 현재 렝스값 3
        // 서브스트링 쓰면 됨
//        System.out.println(currentLength);
        String prefix = input.substring(0, currentLength);
        String suffix = input.substring(input.length() - currentLength, input.length());
//        System.out.println(prefix);
//        System.out.println(suffix);

        if (checkPalindrome(prefix) && checkPalindrome(suffix)) {
            isThisAkaraka(input);
        } else {
            flag = 1;
            return false;
        }

        return true;
    }
}

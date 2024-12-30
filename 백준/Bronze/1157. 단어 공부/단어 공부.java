import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] alphabet = new int[26];

        // toUpperCase = 소문자들을 모두 대문자로 바꿔줌
        String str = scanner.nextLine().toUpperCase();

        for (int i = 0; i < str.length(); i++) {
            int a = str.charAt(i) - 65;
            alphabet[a]++;
        }


        int a = -1;
        char ch = '?';

        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] > a) {
                a = alphabet[i];
                ch = (char) (i + 65);
            } else if (alphabet[i] == a) {
                ch = '?';
                }
            }
        System.out.println(ch);
    }
}

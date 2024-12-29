import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String b = br.readLine();

        String[] input = b.split("");
        int l = input.length;
        int sum = 0;

        for (int i = 0; i < l; i++) {
            sum += numberPlz(input[i]);
        }

        System.out.println(sum);



    }

    public static int numberPlz(String a) {
        int c = 0;
        switch (a) {
            case "A":
            case "B":
            case "C":
                c=3;
                break;
            case "D":
            case "E":
            case "F":
                c=4;
                break;
            case "G":
            case "H":
            case "I":
                c=5;
                break;
            case "J":
            case "K":
            case "L":
                c=6;
                break;
            case "M":
            case "N":
            case "O":
                c=7;
                break;
            case "P":
            case "Q":
            case "R":
            case "S":
                c=8;
                break;
            case "T":
            case "U":
            case "V":
                c=9;
                break;
            case "W":
            case "X":
            case "Y":
            case "Z":
                c=10;
        }
        return c;
    }
}

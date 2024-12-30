import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String cro = br.readLine();


        int croCounter = 0;

        String[] inputArr = cro.split("");

        for (int i = 0; i < cro.length() - 2; i++){
            String three = inputArr[i] + inputArr[i + 1] + inputArr[i + 2];
            if (three.equals("dz=")) {
                croCounter++;
                inputArr[i] = "";
                inputArr[i + 1] = "";
                inputArr[i + 2] = "";
            }
        }


        for (int i = 0; i < cro.length() - 1; i++) {
            String two = inputArr[i] + inputArr[i + 1];
            switch (two) {
                case "c=" :
                case "c-" :
                case "d-" :
                case "lj" :
                case "nj" :
                case "s=" :
                case "z=" :
                    croCounter++;

                    inputArr[i] = "";
                    inputArr[i + 1] = "";
                    break;
            }
        }
        for (String s : inputArr) {
            if (!s.equals("")) {
                croCounter++;
            }

        }

        System.out.println(croCounter);

    }
}

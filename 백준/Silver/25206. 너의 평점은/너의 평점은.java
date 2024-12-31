import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws IOException {
        int n = 20;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double sum = 0;
        double sumXrate = 0;
        for (int i = 0; i < n; i++) {
            String input =br.readLine();
            sum += getGPA(input);
//            System.out.println(getRate(input));
            sumXrate +=getRate(input)*getGPA(input);
        }
//        System.out.println("sum = " + sum);
//        System.out.println("sumXrate = " + sumXrate);

        System.out.println(sumXrate / sum);


//        String input = br.readLine();
//        System.out.println(getGPA(input));

    }

    public static double getGPA(String a) {
        // ObjectOrientedProgramming1 3.0 A+
        // . 찾고 그거 앞뒤로 String값 찾아주고 인트형 변경
        // . 기준 n-1값은 그대로, n+1값은 /10해서 더해줌
        // 전공평점 (학점 × 과목평점)의 합을 학점의 총합으로 나눈 값이다
        // 전공평점 =3.0 * 4.5(A+)값

        int dotis = 0;

        String[] array = a.split("");

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(".")) {
                dotis = i;
            }
        }
        double sum = 0;

        //P가 아니라면 정상적으로 학점 총합값 내놓음
        if (!array[dotis + 3].equals("P")) {
            Double A = Double.parseDouble(array[dotis - 1]);
            Double B = Double.parseDouble(array[dotis + 1]);
            sum = (A + (B / 10));
        } else {
            sum = 0;
        }


//        if (array[dotis + 3].equals("A")) {
//            if (array[dotis + 4].equals("+")) {
//                score = 4.5;
//            }
//            if (array[dotis + 4].equals("0")) {
//                score = 4.0;
//            }
//        }



//        System.out.println("sum = " + sum);

        return sum;
    }
    public static double getRate(String a){
        int dotis = 0;

        String[] array = a.split("");

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(".")) {
                dotis = i;
            }
        }

        // 등급별 넣어줄 값
        double rate = 0;

        if (array[dotis+3].equals("A")) {
            if (array[dotis+4].equals("+")) {
                rate = 4.5;
            }
            if (array[dotis+4].equals("0")) {
                rate = 4.0;
            }
        }
        if (array[dotis+3].equals("B")) {
            if (array[dotis+4].equals("+")) {
                rate = 3.5;
            }
            if (array[dotis+4].equals("0")) {
                rate = 3.0;
            }
        }
        if (array[dotis+3].equals("C")) {
            if (array[dotis+4].equals("+")) {
                rate = 2.5;
            }
            if (array[dotis+4].equals("0")) {
                rate = 2.0;
            }
        }
        if (array[dotis+3].equals("D")) {
            if (array[dotis+4].equals("+")) {
                rate = 1.5;
            }
            if (array[dotis+4].equals("0")) {
                rate = 1.0;
            }
        }
        if (array[dotis+3].equals("F")||array[dotis+3].equals("P")) {
                rate = 0.0;
        }
        return rate;
    }
}


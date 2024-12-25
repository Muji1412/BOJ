import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int num = a * b * c;
//        System.out.println("num = " + num);

        int counter = 0;
        int counter0 = 0;
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        int counter5 = 0;
        int counter6 = 0;
        int counter7 = 0;
        int counter8 = 0;
        int counter9 = 0;



        while (num > 0) {
            int temp = num % 10;
            switch (temp) {
                case 0:
                    counter0++;
                    break;
                case 1:
                    counter1++;
                    break;
                case 2:
                    counter2++;
                    break;
                case 3:
                    counter3++;
                    break;
                case 4:
                    counter4++;
                    break;
                case 5:
                    counter5++;
                    break;
                case 6:
                    counter6++;
                    break;
                case 7:
                    counter7++;
                    break;
                case 8:
                    counter8++;
                    break;
                case 9:
                    counter9++;
                    break;
            }

//            System.out.println(num % 10);
            num /= 10;
        }
        System.out.println(counter0);
        System.out.println(counter1);
        System.out.println(counter2);
        System.out.println(counter3);
        System.out.println(counter4);
        System.out.println(counter5);
        System.out.println(counter6);
        System.out.println(counter7);
        System.out.println(counter8);
        System.out.println(counter9);

        
    }
}

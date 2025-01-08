import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Ao = sc.nextInt();
        int Bo = sc.nextInt();
        int At = sc.nextInt();
        int Bt = sc.nextInt();

        int saveBo = Bo;
        int saveBt = Bt;

        int BoBt = Bo * Bt;

        while (Bt != 0) {
            int temp = Bt;
            Bt = Bo%Bt;
            Bo = temp;
        }

        int lcm = BoBt / Bo;

        int divBo =lcm/saveBo;
        int divBt =lcm/saveBt;

        int nume = Ao * divBo + At * divBt;

        // 분수 더하기 완료 (nume/lcm)

        // 기약분수로 만들기
        // 최대공약수로 각 값 나눠주기

        int a = nume;
        int b = lcm;

        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }

        nume /= a;
        lcm /= a;
        System.out.println(nume + " " + lcm);


    }
}

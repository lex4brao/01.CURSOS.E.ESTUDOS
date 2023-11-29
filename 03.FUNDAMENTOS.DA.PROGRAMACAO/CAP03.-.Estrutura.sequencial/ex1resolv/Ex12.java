package CAP03.ex1resolv;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2;
        double po1, po2;
        System.out.println("Digite um numero ");
        n1 = sc.nextDouble();
        System.out.println("Digite outro numero ");
        n2 = sc.nextDouble();
        po1 = Math.pow(n1, n2);
        System.out.println(n1+"^"+n2+" = "+po1);
        po2 = Math.pow(n2, n1);
        System.out.println(n2+"^"+n1+" = "+po2);

    }
}

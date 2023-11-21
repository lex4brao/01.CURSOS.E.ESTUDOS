package CAP03.ex2prop;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2,n3,resul;
        System.out.printf("Digite um numero ");
        n1 = sc.nextInt();
        System.out.printf("Digite outro numero ");
        n2 = sc.nextInt();
        System.out.printf("Digite mais outro numero ");
        n3 = sc.nextInt();
        resul = n1*n2*n3;
        System.out.println(n1+" * "+n2+" * "+n3+" = "+resul);
    }
}

package secao04;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nA, nB, nC, nD;
        System.out.println("Calculo de A*B-C*D");
        System.out.print("Digite o valor de A: ");
        nA = sc.nextDouble();
        System.out.print("Digite o valor de B: ");
        nB = sc.nextDouble();
        System.out.print("Digite o valor de C: ");
        nC = sc.nextDouble();
        System.out.print("Digite o valor de D: ");
        nD = sc.nextDouble();
        System.out.println(nA+"*"+nB+" - "+nC+"*"+nD+" = "+((nA*nB)-(nC*nD)));

    }
}

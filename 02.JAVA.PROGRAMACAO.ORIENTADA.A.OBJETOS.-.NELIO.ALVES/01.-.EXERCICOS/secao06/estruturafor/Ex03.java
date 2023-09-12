package secao06.estruturafor;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtd;
        double n1, n2, n3, n4, med;

        System.out.print("Quantos numeros deseja cadastrar: ");
        qtd = sc.nextInt();
        for (int i=1;i<=qtd; i++){
            System.out.print("Primeira nota: ");
            n1 = sc.nextDouble();
            System.out.print("Segunda nota: ");
            n2 = sc.nextDouble();
            System.out.print("Terceira nota: ");
            n3 = sc.nextDouble();
            System.out.print("Quarta nota: ");
            n4 = sc.nextDouble();
            med = (n1+n2+n3+n4)/4;
            System.out.println("A media "+i+" = "+med);
        }
    }
}

package secao4;

import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p1,p2;
        double vp1, vp2, tot;
        System.out.println("Calculo da compra");
        System.out.println("Peça 1");
        System.out.printf("Quantidade: ");
        p1 = sc.nextInt();
        System.out.printf("Valor R$:");
        vp1 = sc.nextInt();
        System.out.println("Peça 2");
        System.out.printf("Quantidade: ");
        p2 = sc.nextInt();
        System.out.printf("Valor R$:");
        vp2 = sc.nextInt();
        tot=(p1*vp1)+(p2*vp2);
        System.out.println("-----------------------");
        System.out.println("Total da Compra");
        System.out.printf("R$:%.2f\n",tot);
        System.out.println("-----------------------");


    }
}

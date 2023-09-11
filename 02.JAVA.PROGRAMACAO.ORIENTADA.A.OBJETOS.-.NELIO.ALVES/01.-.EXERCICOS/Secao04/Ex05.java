package secao04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        int codigo, qtd;
        double valorUnid;
        System.out.print("Digite o codigo da peça: ");
        codigo = sc.nextInt();
        System.out.print("Digite a quantidade de peças: ");
        qtd = sc.nextInt();
        System.out.print("Digite o valor unitário da peça R$");
        valorUnid = sc.nextDouble();
        System.out.println();
        System.out.println("Total a pagar R$"+df.format(qtd*valorUnid));
    }
}

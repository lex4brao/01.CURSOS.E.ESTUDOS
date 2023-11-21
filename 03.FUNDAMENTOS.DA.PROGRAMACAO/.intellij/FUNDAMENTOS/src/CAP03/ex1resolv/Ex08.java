package CAP03.ex1resolv;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        double invest, taxa;
        double rend, rendFinal;
        System.out.printf("\n\n\nQual o valor que deseja investir R$\t");
        invest = sc.nextDouble();
        System.out.print("Qual a taxa de rendimento: ");
        taxa = sc.nextDouble();
        rend = (invest*taxa);
        System.out.println("\nO valor do rendimento será R$\t"+df.format(rend));
        rendFinal = invest+rend;
        System.out.println("Seu capital será R$\t"+df.format(rendFinal));


    }
}

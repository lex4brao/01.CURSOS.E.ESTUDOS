package CAP03.ex1resolv;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.##");
        double sal, valorKW;
        System.out.println("Qual o valor do salario minimo");
        sal = sc.nextDouble();
        valorKW = (sal/5);
        System.out.println("O valor do KW é "+valorKW);
        System.out.println("Quantos KW uma familia consome por mês: ");
        double qtdKW = sc.nextDouble();
        double conta = valorKW*qtdKW;
        System.out.println("Valor da conta mensal R$"+df.format(conta));
    }
}

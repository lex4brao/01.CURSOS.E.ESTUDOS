package CAP03.ex1resolv;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("####.##");
        double valor, percI, percV;
        System.out.println("Digite o valor do veiculo R$");
        valor = sc.nextDouble();
        System.out.println("Digite o percentual de impostos");
        percI = sc.nextDouble();
        percI = percI/100;
        System.out.println("Digite o percentual de venda");
        percV = sc.nextDouble();
        percV = percV/100;
        double preco = valor+(valor*percI)+(valor*percV);
        System.out.println("O valor final do veiculo será R$"+df.format(preco));
    }
}

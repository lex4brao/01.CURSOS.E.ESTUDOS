package CAP03.ex2prop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.##");
        double preco;
        System.out.printf("Digite o preço do produto R$");
        preco = sc.nextDouble();
        double desc = preco*0.9;
        System.out.println("O valor com desconto é R$"+df.format(desc));
    }
}

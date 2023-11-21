package CAP03.ex1resolv;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.##");
        double valor, valoIng;
        System.out.printf("Digite o custo do espetáculo R$");
        valor = sc.nextDouble();
        System.out.printf("Digite o valor do ingresso R$");
        valoIng = sc.nextDouble();
        double vendas = valor/valoIng;
        System.out.println("Serão necessario "+vendas+" ingressos");
    }
}

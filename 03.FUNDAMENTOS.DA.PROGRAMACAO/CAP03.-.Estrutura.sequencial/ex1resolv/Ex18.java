package CAP03.ex1resolv;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.##");
        double sacoRacao;
        double gato1, gato2;
        System.out.println("Qual o peso do saco de ração");
        sacoRacao = sc.nextDouble();
        System.out.printf("Qual a porção de ração que o gato 1 come ");
        gato1 = sc.nextDouble();
        System.out.printf("Qual a porção de ração que o gato 2 come ");
        gato2 = sc.nextDouble();
        double total = sacoRacao-(5*((gato1/1000)+(gato2/1000)));
        System.out.println("Apó 5 dias ainda terá "+total);
    }
}

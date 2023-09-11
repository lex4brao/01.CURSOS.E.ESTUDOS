package secao04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.####");
        double raio, area;

        System.out.println("Calculando a area do circulo");
        System.out.print("Digite o valor do raio: ");
        raio = sc.nextDouble();
        area = Math.PI*Math.pow(raio,2);
        System.out.println("Area do circulo é "+df.format(area));
    }
}

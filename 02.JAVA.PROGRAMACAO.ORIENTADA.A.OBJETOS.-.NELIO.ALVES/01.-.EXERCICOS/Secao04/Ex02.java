package secao4;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Ex02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.####");
        double raio, area;
        System.out.println("Calculo da área de um circulo");
        System.out.printf("Digite o raio do circulo  ");
        raio = sc.nextDouble();
        area = Math.PI*Math.pow(raio,2);
        System.out.println("A área do circulo é "+df.format(area));
        System.out.printf("%.2f",area);

    }
}

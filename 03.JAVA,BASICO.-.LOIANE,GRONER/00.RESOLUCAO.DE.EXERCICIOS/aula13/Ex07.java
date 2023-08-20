package aula13;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Ex07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        double lado, area;
        System.out.println("Calculo de Area do Quadrado");
        System.out.println("Digite o tamanho do lado do quarado");
        lado = sc.nextDouble();
        area = Math.pow(lado,2);
        System.out.println("A area do quarado é "+df.format(area));
        System.out.println("O dobro da area é "+df.format(area*2));
    }
}

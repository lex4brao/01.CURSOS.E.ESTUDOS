package CAP03.ex2prop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.##");
        System.out.println("Digite o raio da circunferencia ");
        double raio = sc.nextDouble();
        double perimetro = 2*(Math.PI*raio);
        System.out.println("O perimetro da circunferencia é "+df.format(perimetro));
        double area = Math.PI*Math.pow(raio,2);
        System.out.println("A area da circunferencia é "+df.format(area));
        double volume = 0.75*(Math.PI*Math.pow(raio,3));
        System.out.println("O volume da circunferencia é "+df.format(volume));
    }
}

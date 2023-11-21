package CAP03.ex1resolv;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.##");
        double raio, area;
        System.out.println("Digite o raio do circulo ");
        raio = sc.nextDouble();
        area = (raio*raio)*Math.PI;
        System.out.println("\nA area do circulo é "+df.format(area));
    }
}

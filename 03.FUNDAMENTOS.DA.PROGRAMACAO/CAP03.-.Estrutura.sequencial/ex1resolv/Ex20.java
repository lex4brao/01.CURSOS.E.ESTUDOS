package CAP03.ex1resolv;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.##");
        double ang, alt;
        System.out.printf("Qual o angulo da escada: ");
        ang = sc.nextDouble();
        System.out.printf("Qual a altura da parede: ");
        alt = sc.nextDouble();
        double radiando = ang*(3.14/180);
        double escada = alt/Math.sin(radiando);
        System.out.println("comprimento da escada "+escada);
    }
}

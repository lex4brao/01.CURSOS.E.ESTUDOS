package CAP03.ex2prop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.##");
        System.out.println("Encontrando o tamanho da escada");
        System.out.println("\nQual o valor altura do tamanho da escada");
        double alt = sc.nextDouble();
        System.out.println("Qual o angulo que está a escada ");
        double ang = sc.nextDouble();
        double escada = alt/Math.cos(ang);
        System.out.println("\nO tamanho da escada é "+df.format(escada));

    }
}

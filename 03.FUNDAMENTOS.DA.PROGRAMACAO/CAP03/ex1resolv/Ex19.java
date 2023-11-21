package CAP03.ex1resolv;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.##");
        double alt, altDeg;
        System.out.println("digite a altura do pé direito ");
        alt = sc.nextDouble();
        System.out.println("digite a altura do degrau");
        altDeg = sc.nextDouble();
        double qtdDeg = alt/altDeg;
        System.out.println("\nserão: "+qtdDeg);
        System.out.println("Qual a largura do degrau ");
        double largDeg = sc.nextDouble();
        double largTot = qtdDeg*largDeg;
        System.out.println("A escada terá "+largTot+" de comprimento");

    }
}

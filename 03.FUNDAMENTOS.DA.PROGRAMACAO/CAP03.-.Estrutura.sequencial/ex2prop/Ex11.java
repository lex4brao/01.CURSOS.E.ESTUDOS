package CAP03.ex2prop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.##");
        double diaA, diaB;
        System.out.printf("Digite o tamanho da diagonal maior ");
        diaA = sc.nextDouble();
        System.out.printf("Digite o tamanho da diagonal menor");
        diaB = sc.nextDouble();
        double area = (diaA*diaB)/2;
        System.out.println("A area do losango é "+df.format(area));
    }
}

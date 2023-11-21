package CAP03.ex2prop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.##");
        double baseA, baseB, altura;
        System.out.printf("Digite a base maior do trapézio  ");
        baseA = sc.nextDouble();
        System.out.printf("Digite a  altura do trapézio ");
        altura = sc.nextDouble();
        System.out.printf("Digite a base menor do trapézio ");
        baseB = sc.nextDouble();
        double area = ((baseA-baseB)*altura)/2;
        System.out.println("\nA area do trapézio é "+df.format(area));

    }
}

package CAP03.ex2prop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.##");
        System.out.println("Digite o comprimento do comodo ");
        double comp = sc.nextDouble();
        System.out.println("Digite a largura do comodo ");
        double larg = sc.nextDouble();
        double area = comp*larg;
        System.out.println("A area do comodo é "+area);
        System.out.println("Será necessário "+(area*18)+"W de iluminação");
    }
}

package CAP03.ex2prop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.##");
        System.out.println("Digite o primeiro angulo do triangulo ");
        double ang1 = sc.nextDouble();
        System.out.println("Digite o segundo angulo do triangulo ");
        double ang2 = sc.nextDouble();
        double ang3 = 180-(ang1+ang2);
        System.out.println("O terceiro angulo é "+ang3);
    }
}

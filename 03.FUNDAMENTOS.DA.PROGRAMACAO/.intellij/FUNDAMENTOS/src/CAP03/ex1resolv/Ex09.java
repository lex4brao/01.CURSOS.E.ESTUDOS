package CAP03.ex1resolv;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        double base, altura;
        System.out.printf("Digite a base do triangulo: ");
        base = sc.nextDouble();
        System.out.printf("Digite a altura do triangulo: ");
        altura = sc.nextDouble();
        double area = (base*altura)/2;
        System.out.println("A area do triandulo é "+area);
    }
}

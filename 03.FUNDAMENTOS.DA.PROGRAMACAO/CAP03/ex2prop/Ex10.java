package CAP03.ex2prop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.##");
        System.out.printf("Digite o tamanho do lado do quadrado ");
        double lado = sc.nextDouble();
        double area = lado*lado;
        System.out.println("A area do quadrado é "+area);
    }
}

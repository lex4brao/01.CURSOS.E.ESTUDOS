package aula63;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC;

        System.out.println("Entre com as medidas do tringulo X");
        System.out.print("Lado A: ");
        xA = sc.nextDouble();
        System.out.print("Lado B: ");
        xB = sc.nextDouble();
        System.out.print("Lado C: ");
        xC = sc.nextDouble();

        System.out.println("Entre com as medidas do tringulo Y");
        System.out.print("Lado A: ");
        yA = sc.nextDouble();
        System.out.print("Lado B: ");
        yB = sc.nextDouble();
        System.out.print("Lado C: ");
        yC = sc.nextDouble();

        double p = (xA+xB+xC)/2;
        double areaX = Math.sqrt(p*(p-xA)*(p-xB)*(p-xC));

        p = (yA+yB+yC)/2;
        double areaY = Math.sqrt(p*(p-yA)*(p-yB)*(p-yC));

        System.out.printf("Area do triangulo X: %.2f\n", areaX);
        System.out.printf("Area do triangulo X: %.2f\n", areaY);
        if (areaX>areaY){
            System.out.println("A maior area é do triangulo X");
        }else {
            System.out.println("A maior area é do triangulo Y");
        }

    }
}

package aula65;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangulo x,y;
        x = new Triangulo();
        y = new Triangulo();
        System.out.println("Entre com as medidas do tringulo X");
        System.out.print("Lado A: ");
        x.a = sc.nextDouble();
        System.out.print("Lado B: ");
        x.b = sc.nextDouble();
        System.out.print("Lado C: ");
        x.c = sc.nextDouble();

        System.out.println("Entre com as medidas do tringulo Y");
        System.out.print("Lado A: ");
        y.a = sc.nextDouble();
        System.out.print("Lado B: ");
        y.b = sc.nextDouble();
        System.out.print("Lado C: ");
        y.c = sc.nextDouble();

        double areaX = x.Area();
        double areaY = y.Area();

        System.out.printf("Area do triangulo X: %.2f\n", areaX);
        System.out.printf("Area do triangulo X: %.2f\n", areaY);
        if (areaX>areaY){
            System.out.println("A maior area é do triangulo X");
        }else {
            System.out.println("A maior area é do triangulo Y");
        }
    }
}

package aula70e71;

import aula70e71.circuloV2.Calculadora;

import java.util.Scanner;

public class CirculoV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        double raio, circ, vol;

        System.out.print("Digite o raio do circulo: ");
        raio = sc.nextDouble();
        circ = calc.Circunferencia(raio);
        vol = calc.Volume(raio);

        System.out.printf("Circunferencia: %.2f\n", circ);
        System.out.printf("Volume: %.2f\n", vol);
        System.out.printf("PI: %.2f\n", calc.PI);

    }
}

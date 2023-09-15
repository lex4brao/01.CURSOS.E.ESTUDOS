package aula70e71;

import aula70e71.circuloV3.Calculadora;

import java.util.Scanner;

public class CirculoV3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double raio, circ, vol;

        System.out.print("Digite o raio do circulo: ");
        raio = sc.nextDouble();

        circ = Calculadora.Circunferencia(raio);
        vol = Calculadora.Volume(raio);
        System.out.printf("Circunferencia: %.2f\n", circ);
        System.out.printf("Volume: %.2f\n", vol);
        System.out.printf("PI: %.2f\n", Calculadora.PI);

    }
}

package aula70e71;

import java.util.Scanner;

public class CirculoV1 {
    public static final double PI=3.14159;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double raio, circ, vol;

        System.out.print("Digite o raio do circulo: ");
        raio = sc.nextDouble();
        circ = Circunferencia(raio);
        vol = Volume(raio);

        System.out.printf("Circunferencia: %.2f\n", circ);
        System.out.printf("Volume: %.2f\n", vol);
        System.out.printf("PI: %.2f\n", PI);

    }
    public static double Circunferencia(double raio){
        return 2*PI*raio;
    }
    public static double Volume(double raio){
        return 4*PI*Math.pow(raio,3)/3;
    }
}

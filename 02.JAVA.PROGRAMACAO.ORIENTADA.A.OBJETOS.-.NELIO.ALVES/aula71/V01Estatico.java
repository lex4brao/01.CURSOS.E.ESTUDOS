package aula71;

import java.util.Scanner;

public class V01Estatico {
    public static final double PI=3.1416;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double raio;
        System.out.printf("Qual o raio do circulo: ");
        raio = sc.nextDouble();
        System.out.println("A area do circulo é "+Area(raio));
        System.out.println("O Volume da esfera é "+Volume(raio));


    }

    public static double Area(double raio){
        return PI*Math.pow(raio,2);
    }
    public static double Volume(double raio){
        return ((4/3)*PI*Math.pow(raio,3));
    }
}

package aula71;

import java.util.Scanner;

public class V02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double raio;
        System.out.printf("Qual o raio do circulo: ");
        raio = sc.nextDouble();
        System.out.println("A area do circulo é "+CalcEstatico.Area(raio));
        System.out.println("O volume da esfera é "+CalcEstatico.Volume(raio));

    }
}

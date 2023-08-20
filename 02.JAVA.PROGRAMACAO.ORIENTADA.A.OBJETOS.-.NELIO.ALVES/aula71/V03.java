package aula71;

import java.util.Scanner;

public class V03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        CalcNaoEstatico calc = new CalcNaoEstatico();

        double raio;
        System.out.printf("Qual o raio do circulo: ");
        raio = sc.nextDouble();
        System.out.println("A area do circulo é "+calc.Area(raio));
        System.out.println("O Volume da esfera é "+calc.Volume(raio));
    }
}

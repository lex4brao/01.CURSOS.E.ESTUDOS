package aula71;

import java.util.Scanner;

public class V01NaoEstatico {
    public final double PI=3.1416;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        V01NaoEstatico calc = new V01NaoEstatico();

        double raio;
        System.out.printf("Qual o raio do circulo: ");
        raio = sc.nextDouble();
        System.out.println("A area do circulo é "+calc.Area(raio));
        System.out.println("O Volume da esfera é "+calc.Volume(raio));


    }

    public double Area(double raio){
        return PI*Math.pow(raio,2);
    }
    public double Volume(double raio){
        return ((4/3)*PI*Math.pow(raio,3));
    }
}


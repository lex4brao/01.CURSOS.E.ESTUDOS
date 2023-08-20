package aula13;

import java.util.Scanner;
public class Ex14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double tam, vel,temp;
        System.out.println("Calculo de tempo de download");
        System.out.printf("Digite o tamanho do arquivo em MB: ");
        tam = sc.nextDouble();
        System.out.printf("Digite a velocidade do link de internet(mbps): ");
        vel = sc.nextDouble();
        temp = (tam/vel)/60;
        System.out.printf("A duração do download será %.1f minutos",temp);
    }
}

package CAP03.ex1resolv;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.##");
        double tamEsc, altQuad;
        System.out.println("Qual o tamanho da escada");
        tamEsc = sc.nextDouble();
        System.out.println("Qual altura está o quadro");
        altQuad = sc.nextDouble();
        double distEsc = Math.pow(tamEsc,2)-Math.pow(altQuad,2);
        distEsc = Math.sqrt(distEsc);
        System.out.println("A distancia será "+df.format(distEsc));
    }
}

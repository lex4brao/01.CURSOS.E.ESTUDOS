package CAP03.ex1resolv;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        int numb;
        System.out.println("Digite um numero maior que zero ");
        numb = sc.nextInt();
        double quadrado = Math.pow(numb,2);
        System.out.printf("\n\nO quadrado de "+numb+" é "+quadrado);
        double cubo = Math.pow(numb,3);
        System.out.printf("\nO cubo de "+numb+" é "+cubo);
        double raizQuad = Math.sqrt(numb);
        System.out.printf("\nO Raiz quadrada de "+numb+" é "+raizQuad);
        double raizCub = Math.cbrt(numb);
        System.out.printf("\nA Raiz cubica de "+numb+" é "+quadrado);


    }
}

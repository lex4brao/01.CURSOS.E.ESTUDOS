package secao4;

import java.util.Scanner;
public class Ex06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        double tri, circ, tra, quad, ret;
        System.out.println("Digite os valores A, B, C");
        System.out.printf("Valor A: ");
        a = sc.nextInt();
        System.out.printf("Valor B: ");
        b = sc.nextInt();
        System.out.printf("Valor C: ");
        c = sc.nextInt();
        tri=(a*c)/2;
        System.out.printf("Triangulo: %.2f\n",tri);
        circ=Math.PI*Math.pow(c,2);
        System.out.printf("Circulo: %.2f\n",circ);
        tra = (((a+b)*c)/2);
        System.out.printf("Trapézio: %.2f\n", tra);
        quad = Math.pow(b,2);
        System.out.printf("Quadrado: %.2f\n", quad);
        ret = a*b;
        System.out.printf("Retangulo: %.2f\n", ret);

    }
}

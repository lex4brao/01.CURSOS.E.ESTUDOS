package secao05;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y;
        System.out.println("Digite uma coordenada x e y");
        System.out.printf("Digite x: ");
        x = sc.nextDouble();
        System.out.printf("Digite y: ");
        y = sc.nextDouble();
        if (x==0 && y==0){
            System.out.println("Origem");
        } else if (x>=0 && y>=0) {
            System.out.println("Quadrante 1");
        } else if (x>=0 && y<=0) {
            System.out.println("Quadrante 2");
        } else if (x<=0 && y<=0) {
            System.out.println("Quadrante 3");
        } else if (x<=0 && y>=0) {
            System.out.println("Quadrante 4");
        }
    }
}

package secao8;

import secao8.ex01.Retangulo;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        int op;
        String resp="S";

        System.out.println("Entre com as medidas do retângulo");
        System.out.printf("Base: ");
        retangulo.base = sc.nextDouble();
        System.out.printf("Altura: ");
        retangulo.altura = sc.nextDouble();

        do {
            System.out.println("Escolha a opção desejada: ");
            System.out.println("[1] - Area");
            System.out.println("[2] - Perimetro");
            System.out.println("[3] - Diagonal");
            System.out.printf(">> ");
            op = sc.nextInt();
            switch (op){
                case 1:
                    System.out.println("A area do triangulo é "+retangulo.Area());
                    System.out.println();
                    break;
                case 2:
                    System.out.println("O perimetro do triangulo é "+retangulo.Perimetro());
                    System.out.println();
                    break;
                case 3:
                    System.out.println("A diagonal do triangulo é "+retangulo.Diagonal());
                    System.out.println();
                    break;
                default:
                    System.out.println("Opção inválida");
                    System.out.println();
                    continue;
            }
            System.out.printf("Deseja continuar [S]im ou [N]ao: ");
            resp = sc.next();

        }while (!resp.equalsIgnoreCase("n"));

    }
}

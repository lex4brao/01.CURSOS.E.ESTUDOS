package exerciciosloiane.Aula46;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println();
            System.out.println("Digite os dados do Cubo:");
            System.out.print("Nome: ");
            String nome = scanner.next();
            System.out.print("Cor: ");
            String cor = scanner.next();
            System.out.print("Altura: ");
            int altura = scanner.nextInt();
            System.out.print("Largura: ");
            int largura = scanner.nextInt();
            System.out.print("Comprimento: ");
            int comprimento = scanner.nextInt();

            Cubo cubo = new Cubo(nome, cor, altura, largura, comprimento);


            System.out.println();
            System.out.println("Digite os dados do Cubo:");
            System.out.print("Nome: ");
            nome = scanner.next();
            System.out.print("Cor: ");
            cor = scanner.next();
            System.out.print("Altura: ");
            altura = scanner.nextInt();
            System.out.print("Largura: ");
            largura = scanner.nextInt();
            System.out.print("Comprimento: ");
            comprimento = scanner.nextInt();

            Piramide piramide = new Piramide(nome, cor, altura, largura, comprimento);


            System.out.println();
            System.out.println("Digite os dados do Cubo:");
            System.out.print("Nome: ");
            nome = scanner.next();
            System.out.print("Cor: ");
            cor = scanner.next();
            System.out.print("Altura: ");
            altura = scanner.nextInt();
            System.out.print("Largura: ");
            largura = scanner.nextInt();
            System.out.print("Comprimento: ");
            comprimento = scanner.nextInt();

            Cilindro cilindro = new Cilindro(nome, cor, altura, largura, comprimento);


        System.out.println("\nObjetos cadastrados:");

            System.out.println("Nome: " + cubo.getNome());
            System.out.println("Cor: " + cubo.getCor());
            System.out.println("Altura: " + cubo.getAltura());
            System.out.println("Altura: " + cubo.getAltura());
            System.out.println("Área do Cubo: " + cubo.Area());
            System.out.println("Volume do Cubo: " + cubo.Volume());
            System.out.println("---------------------------");



            System.out.println("Nome: " + piramide.getNome());
            System.out.println("Cor: " + piramide.getCor());
            System.out.println("Altura: " + piramide.getAltura());
            System.out.println("Altura: " + piramide.getAltura());
            System.out.println("Área do Cubo: " + piramide.Area());
            System.out.println("Volume do Cubo: " + piramide.Volume());
            System.out.println("---------------------------");



            System.out.println("Nome: " + cilindro.getNome());
            System.out.println("Cor: " + cilindro.getCor());
            System.out.println("Altura: " + cilindro.getAltura());
            System.out.println("Altura: " + cilindro.getAltura());
            System.out.println("Área do Cubo: " + cilindro.Area());
            System.out.println("Volume do Cubo: " + cilindro.Volume());
            System.out.println("---------------------------");


        scanner.close();
    }
}


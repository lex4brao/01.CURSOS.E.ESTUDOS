package secao10;

import java.util.Arrays;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double somaAltura=0;
        System.out.print("Quantas pessoas deseja cadastrar: ");
        n= sc.nextInt();
        String[] nomes = new String[n];
        int[] idade = new  int[n];
        double[] altura = new double[n];

        for (int i=0; i<nomes.length;i++){
            sc.nextLine();
            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();
            somaAltura +=altura[i];
            System.out.println();
        }
        System.out.println("A média de algura das pessoas é "+(somaAltura/altura.length));
        System.out.println("As pessoas menores que 18 anos são: ");
        for (int i=0; i<nomes.length;i++){
            if (idade[i]<18){
                System.out.println(nomes[i]);
            }
        }
    }
}

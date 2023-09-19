package secao10;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas deseja cadastrar: ");
        int n = sc.nextInt();
        String[] nomes = new String[n];
        int[] idades = new int[n];
        String velho =" ";
        int idadeVelho=0;
        for (int i=0; i<nomes.length; i++){
            sc.nextLine();
            System.out.println("Cadastro pessoa "+(i+1));
            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            if (i==1){
                velho = nomes[i];
                idadeVelho = idades[i];
            }
            if (idadeVelho<idades[i]){
                velho = nomes[i];
                idadeVelho = idades[i];
            }
        }
        System.out.println("A pessoa mais velha cadastrada é "+ velho+" com "+idadeVelho+" anos");
    }
}

package exerciciosloiane.Aula19;

import java.util.Random;
import java.util.Scanner;

public class Ex22 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();


    System.out.print("Quantos numeros deseja cadastrar: ");
    int qtd = sc.nextInt();
    int[] vet = new int[qtd];
    int cont=0;
    while (cont<qtd){
      for (int i = cont; i < vet.length; i++) {
        vet[i] = rand.nextInt(100)+1;
        System.out.printf("Pos [%-2d] = %-3d%n",i,vet[i]);
        if (vet[i]%2==0){
          cont++;
        } else {
          System.out.println("Não é permitido o cadastro de numeros impares\n");
          break;
        }
      }
    }
  }
}

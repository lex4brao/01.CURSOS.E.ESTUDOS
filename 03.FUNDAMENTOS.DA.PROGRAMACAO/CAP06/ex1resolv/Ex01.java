package CAP06.ex1resolv;

import java.util.Random;
import java.util.Scanner;


public class Ex01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    System.out.print("Qual o tamanho do vetor: ");
    int tam = sc.nextInt();
    System.out.println();
    int primo;
    int[] vet = new int[tam];
    for (int i = 0; i < tam; i++) {
      vet[i] = rand.nextInt(100)+1;
      System.out.print(vet[i]+" - ");

    }
    System.out.println();
    System.out.println("Numeros primos do vetor");
    for (int i = 0; i <vet.length ; i++) {
      primo = 0;
      for (int j = 1; j <=vet[i] ; j++) {
        primo=(vet[i]%j==0)?(primo+1):primo;
      }
      if (primo<=2){
        System.out.print(vet[i]+" ");
      }
    }
  }
}

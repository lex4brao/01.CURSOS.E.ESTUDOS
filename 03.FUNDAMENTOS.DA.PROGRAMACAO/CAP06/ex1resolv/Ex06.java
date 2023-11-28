package CAP06.ex1resolv;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Ex06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    System.out.print("Quandos numeros: ");
    int qtd = sc.nextInt();

    Integer[] vet = new Integer[qtd];
    for (int i = 0; i < vet.length ; i++) {
      vet[i]=0;
    }
    int sort, pos=0;
    while (pos<vet.length){
      sort = rand.nextInt(10) + 1;
      boolean contem = false;
      for (int valor : vet){
        if (valor==sort){
          contem = true;
          break;
        }
      }
      if (!contem){
        vet[pos]=sort;
        pos++;
      }
    }
    /*for (int i = 0; i < vet.length; i++) {
      vet[i] = rand.nextInt(10) + 1;
    }*/
    System.out.println("Vetor: " + Arrays.toString(vet) + "\n");

    int aux;
    for (int i = 0; i < vet.length; i++) {
      for (int j = 0; j <(vet.length-1) ; j++) {
        if (vet[j]<vet[j+1]){
          aux = vet[j];
          vet[j] = vet[j+1];
          vet[j+1] = aux;
        }
      }
    }
    System.out.println("Vetor: " + Arrays.toString(vet) + "\n");
    Arrays.sort(vet);
    System.out.println("Vetor: " + Arrays.toString(vet) + "\n");
    Arrays.sort(vet, Comparator.reverseOrder());

    System.out.println("Vetor: " + Arrays.toString(vet) + "\n");
  }
}

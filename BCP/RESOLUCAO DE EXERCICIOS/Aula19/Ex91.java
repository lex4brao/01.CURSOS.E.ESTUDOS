package Aula19;

import java.util.*;

public class Ex91 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    Random rnd = new Random();

    int i=0;
    double[] nota1 = new double[10];
    double[] nota2 = new double[10];
    double[] media = new double[10];

    System.out.println("\n Imprimindo as notas:");
    for(i=0;i<nota1.length;i++) {
      nota1[i] = rnd.nextInt(10)+1;
      nota2[i] = rnd.nextInt(10)+1;
      media[i] = ((nota1[i]+nota2[i])/2);
      System.out.println("Aluno "+(i+1)+" Nota 1: "+nota1[i]+"\tNota 2: "+nota2[i]+"\tMédia: "+media[i]);     
    }
    System.out.println("\n\tLista de Aprovados");
    for(i=0;i<media.length;i++) {
      System.out.print("Aluno "+(i+1));
      if (media[i]>=7){
        System.out.print(" APROVADO");
      } else {
        System.out.print(" REPROVADO");
      } 
      System.out.println("");
    } 
  }
}

package Aula19;

public class Ex97 {
  public static void main (String[] args) {
    int i=0;
    int[] vetorA = new int[10];
    char[] vetorB = new char[vetorA.length];

    for(i=0;i<vetorA.length;i++) {
      vetorA[i]= (int)(Math.random()*15);
      if (vetorA[i]<7){
        vetorB[i]='a'; 
      } else if (vetorA[i]==7){
        vetorB[i]='b'; 
      } else if (vetorA[i]>7 && vetorA[i]<10){
        vetorB[i]='c'; 
      } else if (vetorA[i]==10){
        vetorB[i]='d';
      } else if (vetorA[i]>10){
        vetorB[i]='d';
      }
    } 
    System.out.println("\tVetor A");
    for(i=0;i<vetorA.length;i++) {
      System.out.print(vetorA[i]+" ");
    } 
    System.out.println("\n\tVetor B");
    for(i=0;i<vetorA.length;i++) {
      System.out.print(vetorB[i]+" ");
    } 
  }
}

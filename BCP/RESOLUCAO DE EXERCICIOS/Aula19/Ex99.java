package Aula19;

public class Ex99 {
  public static void main (String[] args) {
    int i=0;
    int[] vetorA = new int[10];
    int[] vetorB = new int[vetorA.length];
    int[] vetorC = new int[vetorA.length+vetorB.length];

    System.out.println(vetorC.length+"");
    for(i=0;i<vetorA.length;i++) {
      vetorA[i]= (int)(Math.random()*100);
      vetorB[i]= (int)(Math.random()*100);
    } 
    for(i=0;i<vetorA.length;i++) {
     vetorC[i]= vetorA[i];
    } 
    for(i=vetorA.length;i<(vetorA.length+vetorB.length);i++) {
     vetorC[i]= vetorB[i-vetorA.length];
    } 

    System.out.println("\tVetor A");
    for(i=0;i<vetorA.length;i++) {
      System.out.print(vetorA[i]+" ");
    } 
    System.out.println("\n\tVetor B");
    for(i=0;i<vetorB.length;i++) {
      System.out.print(vetorB[i]+" ");
    } 
    System.out.println("\n\tVetor C");
    for(i=0;i<vetorC.length;i++) {
      System.out.print(vetorC[i]+" ");
    } 
  }
}

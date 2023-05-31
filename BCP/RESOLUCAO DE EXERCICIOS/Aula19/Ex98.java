package Aula19;

public class Ex98 {
  public static void main (String[] args) {
    int i=0;
    int[] vetorA = new int[10];
    int[] vetorB = new int[vetorA.length];

    for(i=0;i<vetorA.length;i++) {
      vetorA[i]= (int)(Math.random()*100);
    } 
    for(i=0;i<vetorA.length;i++) {
     vetorB[i]= vetorA[(vetorA.length-1)-i];
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

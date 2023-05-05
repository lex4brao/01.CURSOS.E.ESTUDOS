package Aula19;

public class Ex100A {
  public static void main (String[] args) {
    int i=0, posB=0, posC=0;
    int[] vetorA = new int[20];
    int[] vetorB = new int[vetorA.length];
    int[] vetorC = new int[vetorA.length];
    for(i=0;i<vetorA.length;i++) {
      vetorA[i]= (int)(Math.random()*100);
      if (vetorA[i]%2==0){
        vetorB[posB]=vetorA[i];
        posB++;
      } else {
        vetorC[posC]=vetorA[i];
        posC++;
      } 
    } 
    
    System.out.println("\tVetor A");
    for(i=0;i<vetorA.length;i++) {
      System.out.print(vetorA[i]+" ");
    } 
    System.out.println("\n\tVetor B");
    for(i=0;i<vetorB.length;i++) {
      if (vetorB[i]!=0){
        System.out.print(vetorB[i]+" ");
      } 
    } 
    System.out.println("\n\tVetor C");
    for(i=0;i<vetorC.length;i++) {
      if (vetorC[i]!=0){
        System.out.print(vetorC[i]+" ");
      } 
    } 
  }
}

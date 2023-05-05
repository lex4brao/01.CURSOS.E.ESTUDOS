package Aula19;

public class Ex101 {
  public static void main (String[] args) {
    int i=0, posB=0, posC=0;
    int[] vetorA = new int[20];
    int[] vetorB = new int[vetorA.length];
    System.out.println("\n\tVetor A");
    for(i=0;i<vetorA.length;i++) {
      vetorA[i]= (int)(Math.random()*100);
      if (vetorA[i]%2==0){
        vetorB[posB]=vetorA[i];
        posB++;
      }
      System.out.print(vetorA[i]+" ");
    } 
    
    for(i=0;i<vetorA.length;i++) {
      if (vetorA[i]%2!=0){
        vetorB[posB]=vetorA[i];
        posB++;
      } 
    }
    System.out.println("\n\tVetor B");
    for(i=0;i<vetorB.length;i++) {
      if (vetorB[i]!=0){
        System.out.print(vetorB[i]+" ");
      } 
    } 
  }
}

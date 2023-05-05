package Aula19;

public class Ex96 {
  public static void main (String[] args) {
    int i=0;
    int[] vetorA = new int[10];
    int[] vetorB = new int[vetorA.length];
    int[] vetorC = new int[vetorA.length];

    for(i=0;i<vetorA.length;i++) {
      vetorA[i]= (int)(Math.random()*10);
      vetorB[i]= (int)(Math.random()*10);
      if (vetorA[i]>vetorB[i]){
        vetorC[i] = 1;
      } else if (vetorA[i]==vetorB[i]){
        vetorC[i] = 0;
      } else {
        vetorC[i] = -1;
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
    System.out.println("\n\tVetor C");
    for(i=0;i<vetorA.length;i++) {
      System.out.print(vetorC[i]+" ");
    } 

  }
}

package Aula19;

public class Ex106 {
  public static void main (String[] args) {
    
    int i=0;
    int[] vetor = new int[20];
    System.out.println("Análisando os elementos to vetor");
    for(i=0;i<vetor.length;i++) {
      vetor[i] = (int) Math.pow(2,i);
      System.out.println("2^"+i+" = "+vetor[i]);
    }  
  }
}
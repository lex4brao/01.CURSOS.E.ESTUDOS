package Aula19;

public class Ex102 {
  public static void main (String[] args) {
    int i=0, j=0;
    int[] vetorA = new int[5];

    System.out.println("Gerador de Tabuada");
    for(i=0;i<vetorA.length;i++) {
      vetorA[i]= (int)(Math.random()*100);
      System.out.println("\n\tTabuada do "+vetorA[i]);
      for(j=0;j<=10;j++) {
        System.out.println(vetorA[i]+" * "+j+" = "+(vetorA[i]*j));
      } 
    }
  }
}

package Aula19;

public class Ex103 {
  public static void main (String[] args) {
    int i=0, j=0, primo=0;
    int[] vetorA = new int[5];

    System.out.println("Verificação de numeros primos");
    for(i=0;i<vetorA.length;i++) {
      vetorA[i]= (int)(Math.random()*100);
      System.out.println("\n\t"+vetorA[i]+" é divisivel por: ");
      for(j=1;j<=vetorA[i];j++) {
        if (vetorA[i]%j==0){
          System.out.print("\t"+j);
          primo++;
        } 
      } 
      primo--;
      if (primo<=2){
        System.out.println("\n"+vetorA[i]+" é um numero primo\t");
      } else {
    	  System.out.println("\n"+vetorA[i]+" não é um numero primo");  
      }
    }
  }
}

package Aula19;

public class Ex107 {
  public static void main (String[] args) {
    
    int i=0, j=0, fatorial=1;
    int[] vetor = new int[10];
    System.out.println("Análisando os elementos to vetor");
    for(i=0;i<vetor.length;i++) {
      vetor[i] =  (int) (Math.random()*10);
      System.out.println("Verificando o fatorial de "+vetor[i]);
      if (vetor[i]==0){
        System.out.print("O fatorial de "+vetor[i]+" é 1");
      } else {
        System.out.print(vetor[i]+"! = ");
        fatorial=1;
        for(j=vetor[i];j>=1;j--) {
          fatorial *= j;
          if (j==1){
            System.out.print(j+" = ");
          } else {
            System.out.print(j+" * ");
          } 
        };
      };
    System.out.println(fatorial+"");
    }  
  }
}
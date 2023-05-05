package Aula16;

class LoopFor {
  public static void main (String[] args) {
  
    System.out.println("Contador até 10");
    for(int count=0;count<=10;count++){
      System.out.println(" "+count);
    }

    for(int i=0, j=10; i<=j; i++, j--){
      System.out.println("i="+i+" j="+j);
    }
    int i=0;
    for( ; i<=100; ){
      System.out.println(""+i);
      i+=5;
    }
    int soma=0;
    for(int k=0; k<=5; soma+=(k++));
    System.out.println("A soma é "+soma);

  }
}
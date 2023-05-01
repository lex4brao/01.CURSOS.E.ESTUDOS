package Aula16;

class LoopWhile {
  public static void main (String[] args) {
    
    int count=0; 
    System.out.println("Contador até 10");
    while(count<=10){
      System.out.println(""+count);
      count++;
    }
    count=20;
    do {
      System.out.println(" - "+count);
      count++;
    } while(count<=25);

  }
}
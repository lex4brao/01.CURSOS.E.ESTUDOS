package Aula19;

public class Vetor {
  public static void main (String[] args) {
    double[] temperatura = new double[5];
    temperatura[0]=35.7;
    temperatura[1]=34.8;
    temperatura[2]=35;
    temperatura[3]=35.2;
    temperatura[4]=36;
    System.out.println("Temperatura dia 1: " + temperatura[0]);
    System.out.println("Temperatura dia 2: " + temperatura[1]);
    System.out.println("Temperatura dia 3: " + temperatura[2]);
    System.out.println("Temperatura dia 4: " + temperatura[3]);
    System.out.println("Temperatura dia 5: " + temperatura[4]);
    
    System.out.println("\nTamanho do vetor " + temperatura.length);

  }
}

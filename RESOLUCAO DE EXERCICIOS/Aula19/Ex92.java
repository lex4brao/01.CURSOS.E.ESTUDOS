package Aula19;

import java.util.*;
import java.text.DecimalFormat;

public class Ex92 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    Random rnd = new Random();
    DecimalFormat df = new DecimalFormat("#.##");

    int i=0;
    double[] dolar = new double[20];
    double[] real = new double[dolar.length];

    System.out.println("\n Cotação do Dolar");
    for(i=0;i<dolar.length;i++) {
      dolar[i] = ((rnd.nextInt(100)*0.01)+4);
      System.out.println("Dia "+(i+1)+" cotação do U$"+dolar[i]);
      real[i] = ((rnd.nextInt(100)*0.01)+(rnd.nextInt(1000)));
      System.out.println("Converção R$"+df.format(real[i])+" que comprar U$"+df.format(real[i]/dolar[i]));
      System.out.println(" ");
    }
  }
}

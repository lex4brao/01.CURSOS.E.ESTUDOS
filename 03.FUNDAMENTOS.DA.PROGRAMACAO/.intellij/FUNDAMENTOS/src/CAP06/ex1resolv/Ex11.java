package CAP06.ex1resolv;

import java.text.DecimalFormat;
import java.util.Random;

public class Ex11 {
  public static void main(String[] args) {
    Random rand = new Random();
    DecimalFormat df = new DecimalFormat("#,###.##");


    double[] temperaturas = new double[12];
    double maior = Double.MIN_VALUE;
    double menor = Double.MAX_VALUE;
    int mesMenor=0;
    int mesMaior=0;

    for (int i = 0; i < temperaturas.length; i++) {
      temperaturas[i] = rand.nextDouble(25)+12;
      maior = Math.max(temperaturas[i], maior);
      menor = Math.min(temperaturas[i], menor );
      mesMenor = (Math.min(temperaturas[i], menor)==temperaturas[i])?i:mesMenor;
      mesMaior = (Math.max(temperaturas[i], maior)==temperaturas[i])?i:mesMaior;
    }
      int cont = 1;
    for (double valor: temperaturas){
    System.out.printf("["+cont+"] "+df.format(valor)+"\n");
    cont++;
    }

    System.out.println("maior = " + df.format(maior));
    System.out.println((mesMaior == 0) ? "Janeiro" : (mesMaior == 1) ? "Fevereiro" : (mesMaior == 2) ? "Março" :
            (mesMaior == 3) ? "Abril" : (mesMaior == 4) ? "Maio" : (mesMaior == 5) ? "Junho" : (mesMaior == 6) ? "Julho" :
                    (mesMaior == 7) ? "Agosto" : (mesMaior == 8) ? "Setembro" : (mesMaior == 9) ? "Outubro" :
                            (mesMaior == 10) ? "Novembro" : "Dezembro");
    System.out.println("menor = " + df.format(menor));
    System.out.println((mesMenor == 0) ? "Janeiro" : (mesMenor == 1) ? "Fevereiro" : (mesMenor == 2) ? "Março" :
            (mesMenor == 3) ? "Abril" : (mesMenor == 4) ? "Maio" : (mesMenor == 5) ? "Junho" : (mesMenor == 6) ? "Julho" :
                    (mesMenor == 7) ? "Agosto" : (mesMenor == 8) ? "Setembro" : (mesMenor == 9) ? "Outubro" :
                            (mesMenor == 10) ? "Novembro" : "Dezembro");
  }
}

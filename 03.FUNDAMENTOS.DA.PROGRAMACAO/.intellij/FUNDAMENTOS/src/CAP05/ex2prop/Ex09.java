package CAP05.ex2prop;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Ex09 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    DecimalFormat df = new DecimalFormat("#,###.##");


    System.out.print("\nQuantas pessoas deseja cadastrar: ");
    int qtd = scan.nextInt();

    int id;
    double peso, alt;
    double medId = 0;
    double maior90 =0;
    double entre1030=0;

    for (int i = 1; i <= qtd; i++) {
      id = rand.nextInt(75)+1;
      peso = rand.nextDouble(150)+1;
      alt = rand.nextDouble()*0.6+1.5;
      medId += id;
      maior90 = (peso>90&&alt<1.5)?(maior90+1): maior90;
      entre1030 = ((id>=10&&id<=30)&&alt>1.9)?(entre1030+1):entre1030;

      System.out.println("Pessoa "+i+": "+id+"   "+df.format(peso)+"   "+df.format(alt));
    }

    medId = medId/qtd;
    System.out.println();
    System.out.println("*** RESULTADOS ***");
    System.out.println("A média das idades é "+medId);
    System.out.println("Pessoas com mais de 90kg e menor que 1,5m "+maior90);
    System.out.println(((entre1030/qtd)*100)+"% das pessoas tem entre 10 e 30 anos e tem mais que 1,9m");

  }
}

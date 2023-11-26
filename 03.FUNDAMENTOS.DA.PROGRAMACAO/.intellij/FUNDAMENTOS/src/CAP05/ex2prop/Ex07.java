package CAP05.ex2prop;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Ex07 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#,###.##");
    Random rand = new Random();

    System.out.print("Quantas pessoas você deseja cadastrar: ");
    int qtd = scan.nextInt();
    int id;
    double peso, alt=0;
    int sup50 = 0;
    int contAlt =0;
    double medAlt = 0;
    double cont40 = 0;
    for (int i = 1; i <=qtd ; i++) {
      id = rand.nextInt(75)+1;
      peso = rand.nextDouble(150)+1;
      alt = rand.nextDouble()*0.6+1.5;
      sup50 = (id>50)?(sup50+1): sup50;
      medAlt = (id>=10&&id<=20)?(medAlt+alt): medAlt;
      contAlt = (id>=10&&id<=20)?(contAlt+1): contAlt;
      cont40 = (peso<40)?(cont40+1):cont40;
    }
    medAlt = medAlt/contAlt;

    System.out.println(sup50+" São pessoas com mais de 50 anos");
    System.out.println(df.format(medAlt)+" é a média de altura de pessoas entre 10 a 20 anos");
    System.out.println(((cont40/qtd)*100)+"% das pessoas tem menos de 40kg");

  }
}

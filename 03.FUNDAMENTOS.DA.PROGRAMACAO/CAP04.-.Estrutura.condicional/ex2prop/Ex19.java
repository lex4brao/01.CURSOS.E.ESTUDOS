package CAP04.ex2prop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex19 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("###,###.##");
    System.out.print("Digite o sexo [M]asculino ou [F]eminino: ");
    String sexo = sc.next();
    if (sexo.equalsIgnoreCase("m")||sexo.equalsIgnoreCase("f")){
      System.out.print("Digite sua altura em (m): ");
      double alt = sc.nextDouble();
      double pesoIdeal = 0;
      if (sexo.equalsIgnoreCase("m")){
        pesoIdeal = (72.7*alt)-58;
      } else if (sexo.equalsIgnoreCase("f")) {
        pesoIdeal = (62.1*alt)-44.7;
      }
      System.out.println("Seu peso ideal é "+df.format(pesoIdeal));
    }


  }
}

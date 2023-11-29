package CAP05.ex2prop;

import java.util.Random;
import java.util.Scanner;

public class Ex15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();


    System.out.print("Quantas pessoas deseja cadastrar: ");
    int qtd = sc.nextInt();
    int sort;
    String op="", sexo="";
    double contS = 0, contN = 0, contM = 0;

    for (int i = 1; i <=qtd ; i++) {
      sort = rand.nextInt(2);
      sexo=(sort==0)?"Feminino":"Masculino";
      sort = rand.nextInt(2);
      op = (sort==0)?"Sim":"Não";
      contS=(sort==0)?(contS+1):contS;
      contN=(sort==0)?contN:(contN+1);

      contM=(sexo.equalsIgnoreCase("Feminino")&&
              op.equalsIgnoreCase("Sim"))?(contM+1):contM;

      System.out.println(i+"ª Pessoa:  "+sexo+" | "+op);

    }

    System.out.println("");
    System.out.println("Resultados");
    System.out.println(contS+" pessoas responderam sim");
    System.out.println(contN+" pessoas responderam não");
    System.out.println(contM+" mulheres responderam sim");




  }
}

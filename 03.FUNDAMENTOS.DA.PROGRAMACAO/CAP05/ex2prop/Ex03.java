package CAP05.ex2prop;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Ex03 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    System.out.println(" Quantas pessoas deseja cadastrar: ");
    int qtd = scan.nextInt();
    int id, cat1=0, cat2=0, cat3=0, cat4=0, cat5=0;
    for (int i = 1; i <=qtd ; i++) {
      id = rand.nextInt(75)+1;
      cat1 = (id<=15)?(cat1+1):cat1;
      cat2 = (id>15&&id<=30)?(cat2+1):cat2;
      cat3 = (id>30&&id<=45)?(cat3+1):cat3;
      cat4 = (id>45&&id<60)?(cat4+1):cat4;
      cat5 = (id>60)?(cat5+1):cat5;
    }
    double perc1 = ((double) cat1 /qtd)*100;
    double perc2 = ((double) cat2 /qtd)*100;
    double perc3 = ((double) cat3 /qtd)*100;
    double perc4 = ((double) cat4 /qtd)*100;
    double perc5 = ((double) cat5 /qtd)*100;
    System.out.println("cat1 = " + cat1);
    System.out.println(perc1+"% das pessoas é menor de 15 anos");
    System.out.println(perc2+"% das pessoas tem entre 16 e 30 anos");
    System.out.println(perc3+"% das pessoas tem entre 31 e 45 anos");
    System.out.println(perc4+"% das pessoas tem entre 34 e 60 anos");
    System.out.println(perc5+"% das pessoas tem mais que 60 anos");
  }
}

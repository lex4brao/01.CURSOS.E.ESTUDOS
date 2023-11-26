package CAP05.ex2prop;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Ex18 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    DecimalFormat df = new DecimalFormat("#,###.##");


    System.out.print("Quantas pessoas deseja cadastrar: ");
    int qtd = sc.nextInt();

    int id;
    int opSexo;
    String sexo="";
    double salario, medSal = 0;
    int qtM=0;
    int maior = (int) Double.MIN_VALUE;
    int menor = (int) Double.MAX_VALUE;
    double menorSal = Double.MAX_VALUE;
    for (int i = 1; i <=qtd ; i++) {
      id = rand.nextInt(60)+20;
      opSexo = rand.nextInt(2);
      sexo = (opSexo==0)?"Feminino":"Masculino";
      salario = rand.nextDouble(2200)+1300;
      medSal = medSal+salario;
      maior = Math.max(id, maior);
      menor = Math.min(id, menor);
      qtM = (salario>=2100)? (qtM+1):qtM;
      menorSal = Math.min(salario, menorSal);


      System.out.println(i+"Pessoa: "+"\t"+id+"\t"+sexo+"\t"+"\tR$"+df.format(salario));
    }
    medSal = medSal/qtd;
    System.out.println();
    System.out.println();
    System.out.println("medSal = " + medSal);
    System.out.println("maior = " + maior);
    System.out.println("menor = " + menor);
    System.out.println("qtM = " + qtM);
    System.out.println("menorSal = " + menorSal);


  }
}

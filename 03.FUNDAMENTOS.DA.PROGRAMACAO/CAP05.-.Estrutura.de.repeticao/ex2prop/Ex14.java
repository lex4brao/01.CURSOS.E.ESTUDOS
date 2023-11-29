package CAP05.ex2prop;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Ex14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    DecimalFormat df = new DecimalFormat("#,###.##");


    System.out.print("Quantas pessoas deseja cadastrar: ");
    int qtd = sc.nextInt();
    int intOp;
    double contOt=0, contBom=0, contReg=0;
    String op;
    int id;
    double medId=0;
    for (int i = 1; i <=qtd ; i++) {
      intOp = rand.nextInt(3)+1;
      op = (intOp==1)?"regular":(intOp==2)?"bom":(intOp==3)?"Otimo":"ERRO!";
      id = rand.nextInt(80)+10;

      contOt = (intOp==3)?(contOt+1):contOt;
      contBom = (intOp==2)?(contBom+1):contBom;
      contReg = (intOp==1)?(contReg+1):contReg;

      medId = (intOp==3)?(medId+id):medId;
      System.out.println("Pessoas "+i+":  idade: "+id+"\t\""+op+"\"");
    }
    System.out.println();
    System.out.println(contOt+" pessoas escolheram Ótimo");
    System.out.println("\t a media de idades é "+df.format(medId/contOt));
    System.out.println(contBom+" pessoas escolheram Bom");
    System.out.println(contReg+" pessoas escolheram Regular");

  }
}

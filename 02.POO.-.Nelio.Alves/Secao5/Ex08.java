package secao5;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Ex08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("###,###.##");
    System.out.print("Qual seu salário R$ ");
    double salario = sc.nextDouble();
    double imposto;
    if (salario<=2000){
      System.out.print("Você é isento de imposto");
    } else if ((salario>2000)&&(salario<=3000)) {
      imposto = salario*0.8;
      System.out.print("Voce irá pagar R$"+df.format(imposto));
    } else if ((salario>3000)&&(salario<=4500)) {
      imposto = salario*0.18;
      System.out.print("Voce irá pagar R$"+df.format(imposto));
    } else if (salario>4500) {
      imposto = salario*0.28;
      System.out.print("Voce irá pagar R$"+df.format(imposto));
    }
  }
}

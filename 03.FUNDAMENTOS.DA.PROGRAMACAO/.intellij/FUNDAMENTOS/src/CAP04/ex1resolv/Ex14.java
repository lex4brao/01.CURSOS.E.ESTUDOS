package CAP04.ex1resolv;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Ex14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("###,###.##");
    System.out.print("Digite o salario ");
    double salario = sc.nextDouble();
    double bonif=0, aux=0;
    if (salario<=600){
      aux=150;
    } else if (salario>600) {
      aux=100;
    }
    if (salario<=500){
      bonif = (salario*0.05);
    } else if ((salario>500)&&(salario<=1200)) {
      bonif = (salario*0.12);
    } else if (salario>1200){
      bonif = 0;
    }
    System.out.println("Você receberá R$"+ df.format(aux)+" de auxilio escola");
    System.out.println("Você receberá R$"+df.format(bonif)+" de bonificação");
    System.out.println("Seu salario será R$"+df.format(salario+aux+bonif));
  }
}

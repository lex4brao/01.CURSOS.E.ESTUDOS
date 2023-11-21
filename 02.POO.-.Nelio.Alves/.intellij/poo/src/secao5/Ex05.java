package secao5;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Ex05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("###,###.##");
    System.out.print("Digite o codigo do produto ");
    int cod = sc.nextInt();
    System.out.print("Digite a quantidade do protudo ");
    int qtd = sc.nextInt();
    double total;
    switch (cod){
      case 1:
        total = qtd*4;
        System.out.println("total = " + total);
        break;
      case 2:
        total = qtd*4.5;
        System.out.println("total = " + total);
        break;
      case 3:
        total = qtd*5;
        System.out.println("total = " + total);
        break;
      case 4:
        total = qtd*2;
        System.out.println("total = " + total);
        break;
      case 5:
        total = qtd*1.5;
        System.out.println("total = " + total);
        break;
      default:
        System.out.print("Codigo invalido");
        break;
    }
  }
}

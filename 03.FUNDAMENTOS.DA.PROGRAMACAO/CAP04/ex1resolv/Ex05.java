package CAP04.ex1resolv;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Ex05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("###,###.##");
    System.out.println("Digite 3 numeros inteiros em ordem crescente");
    System.out.print("1º: ");
    int n1= sc.nextInt();
    System.out.print("2º: ");
    int n2= sc.nextInt();
    System.out.print("3º: ");
    int n3= sc.nextInt();
    System.out.println("Digite outro numero inteiro fora da ordem");
    System.out.print(">>>: ");
    int n4 =sc.nextInt();
    if (n4>n3){
      System.out.println("Ordem decrescente: "+n4+" - "+n3+" - "+n2+" - "+n1);
    } else if ((n4>n2)&&(n4<n3)) {
      System.out.println("Ordem decrescente: "+n3+" - "+n4+" - "+n2+" - "+n1);
    } else if ((n4>1)&&(n4<n2)) {
      System.out.println("Ordem decrescente: "+n3+" - "+n2+" - "+n4+" - "+n1);
    } else if (n4<n1) {
      System.out.println("Ordem decrescente: "+n3+" - "+n2+" - "+n1+" - "+n4);
    }

  }
}

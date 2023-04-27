package Aula13;
import java.util.Scanner;
class Ex14 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Qual o tamanho do arquivo(MB): ");
    double arquivo = scan.nextDouble();
    System.out.print("Qual a velocidade da internet(Mbps)");
    double velocidade = scan.nextDouble();
    
    double tempo = (arquivo/velocidade)/60;

    System.out.println("Irá demorar "+tempo+ " minutos para baixar");
  }
}
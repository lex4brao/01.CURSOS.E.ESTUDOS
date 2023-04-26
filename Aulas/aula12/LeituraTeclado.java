import java.util.Scanner;
public class LeituraTeclado {

	public static void main(String[] args) {
	  
    Scanner scan = new Scanner(System.in);
	  System.out.println("Digite seu nome:");
	  String nomeComp = scan.nextLine();
	  System.out.println("Muito prazer "+nomeComp);
	  
	  System.out.println("Digite seu nome:");
	  String nome = scan.next();
	  
	  System.out.println("Muito prazer "+nome);
	  System.out.println("Qual é sua idade: ");
	  int idade = scan.nextInt();
	  System.out.println("Você tem "+idade+" anos!!");
	  System.out.println("Qual é sua Altura: ");
	  double altura = scan.nextDouble();
	  System.out.println("Você tem "+altura+" metros");
	  
	  System.out.println("Qual seu nome?, Sua idade?, qual sua altura?");
	  nome= scan.next();
	  idade= scan.nextInt();
	  altura= scan.nextDouble();
	  System.out.println("Voce se chama "+nome+" tem "+idade+" anos, e tem "+altura+"m de altura");
  
  }
}
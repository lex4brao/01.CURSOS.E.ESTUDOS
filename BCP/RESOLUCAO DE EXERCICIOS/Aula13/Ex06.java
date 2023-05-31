package Aula13;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Digite o valor do raio do um circulo: ");
    int raio = scan.nextInt();

    double area = 3.141592*(raio*raio);

    System.out.println("\nA area do circulo é "+area); 
    
    area = Math.PI*Math.pow(raio, 2);
    System.out.println("\nA area do circulo é "+area); 
    
	}

}
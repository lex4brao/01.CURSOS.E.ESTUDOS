package aula15;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int valor;
        System.out.println("Digite um valor: ");
        valor = sc.nextInt();
        if (valor>0){
            System.out.println("Positivo");
        } else {
            System.out.println("Negativo");
        }


    }
}

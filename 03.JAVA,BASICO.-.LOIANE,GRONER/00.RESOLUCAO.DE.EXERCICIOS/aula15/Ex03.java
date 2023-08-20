package aula15;
import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sexo;
        System.out.printf("Digite o sexo [M/F]: ");
        sexo = sc.next();
        if (sexo.equalsIgnoreCase("f")){
            System.out.println("F - Feminino");
        } else if (sexo.equalsIgnoreCase("m")) {
            System.out.println("M - Masculino");
        } else {
            System.out.println("SEXO INVALIDO");
        }
    }
}

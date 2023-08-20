package aula13;
import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n1,n2,n3,n4,media;
        System.out.println("Calculo da média do Aluno");
        System.out.println("Digite a primeira nota");
        n1 = sc.nextDouble();
        System.out.println("Digite a segunda nota");
        n2 = sc.nextDouble();
        System.out.println("Digite a terceira nota");
        n3 = sc.nextDouble();
        System.out.println("Digite a quarta nota");
        n4 = sc.nextDouble();
        media = ((n1+n2+n3+n4)/4);
        System.out.println("A média do aluno é "+media);
    }
}

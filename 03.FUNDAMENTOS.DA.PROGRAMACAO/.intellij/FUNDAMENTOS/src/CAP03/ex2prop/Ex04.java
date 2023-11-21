package CAP03.ex2prop;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1,n2,med;
        System.out.printf("Digite a primeira nota do aluno ");
        n1 = sc.nextDouble();
        System.out.printf("Digite a segunda nota do aluno ");
        n2 = sc.nextDouble();
        med = (n1*0.6)+(n2*0.4);
        System.out.println("A media do aluno é "+med);
    }
}

package CAP03.ex1resolv;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("#.##");
        double n1, n2, n3;
        double peso1=0.3, peso2=0.3, peso3=0.4;
        double media;
        System.out.printf("Digite a 1ª nota do aluno: ");
        n1=sc.nextDouble();
        System.out.printf("Digite a 2ª nota do aluno: ");
        n2=sc.nextDouble();
        System.out.printf("Digite a 3ª nota do aluno: ");
        n3=sc.nextDouble();
        media=((n1*peso1)+(n2*peso2)+(n3*peso3));
        System.out.println("A média do aluno é "+df.format(media));

    }
}

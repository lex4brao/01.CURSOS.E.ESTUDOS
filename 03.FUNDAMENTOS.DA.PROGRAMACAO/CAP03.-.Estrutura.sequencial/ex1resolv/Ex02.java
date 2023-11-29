package CAP03.ex1resolv;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df= new DecimalFormat("#.##");
        double n1, n2, n3, n4;
        double media;
        System.out.printf("Digite a 1ª nota: ");
        n1 = sc.nextDouble();
        System.out.printf("Digite a 2ª nota: ");
        n2 = sc.nextDouble();
        System.out.printf("Digite a 3ª nota: ");
        n3 = sc.nextDouble();
        System.out.printf("Digite a 4ª nota: ");
        n4 = sc.nextDouble();
        media = (n1+n2+n3+n4)/4;
        System.out.println("A média do aluno é "+df.format(media));
    }
}

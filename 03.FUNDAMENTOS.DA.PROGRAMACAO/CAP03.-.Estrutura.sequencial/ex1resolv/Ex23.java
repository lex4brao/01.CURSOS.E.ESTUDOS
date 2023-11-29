package CAP03.ex1resolv;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.##");
        double numb;
        System.out.printf("Digite um numero real ");
        numb = sc.nextDouble();
        int inteiro= (int) numb;
        System.out.println("A parte inteira do numero é "+inteiro);
        double decimal = numb-inteiro;
        System.out.println("A parte decimal do numero é "+decimal);
        //double arredondar = ;
        System.out.println("O numero arredondado é "+df.format(numb));

    }
}

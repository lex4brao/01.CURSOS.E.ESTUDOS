package CAP03.ex2prop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.##");
        double peso;
        System.out.println("Digite seu peso");
        peso = sc.nextDouble();
        System.out.println("Seu peso 15% a mais será "+df.format(peso*1.15));
        System.out.println("Seu peso 20% a menos será "+df.format(peso*0.8));
    }
}

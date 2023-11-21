package CAP03.ex2prop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.##");
        System.out.println("Digite seu peso em Kilos ");
        double peso = sc.nextDouble();
        System.out.println("Seu peso em gramas é "+(peso*1000)+" gramas");
    }
}

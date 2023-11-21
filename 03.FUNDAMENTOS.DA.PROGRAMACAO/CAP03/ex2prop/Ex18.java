package CAP03.ex2prop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat  df = new DecimalFormat("###.##");
        System.out.printf("Digite a temperatura em celsius ");
        double celsius = sc.nextDouble();
        double fahr = 180*((celsius+32)/100);
        System.out.println("A temperatura em fahrenheit é "+df.format(fahr));

    }
}

package CAP03.ex2prop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.##");
        System.out.printf("Digite o valor do cateto adjacente ");
        double catA = sc.nextDouble();
        System.out.printf("Digite o valor do cateto oposto ");
        double catO = sc.nextDouble();
        double hip = Math.pow(catA,2)+Math.pow(catO,2);
        hip = Math.sqrt(hip);
        System.out.println("A hipotenusa é "+df.format(hip));


    }
}

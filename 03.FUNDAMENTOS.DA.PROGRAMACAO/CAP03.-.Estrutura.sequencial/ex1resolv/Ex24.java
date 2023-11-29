package CAP03.ex1resolv;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.##");
        double horas;
        System.out.printf("Digite a hora em numero real (H,MM) ");
        horas = sc.nextDouble();
        int hora = (int)horas;
        double min = horas-hora;
        double conversao = (hora*60)+(min*100);
        System.out.println("A conversão é "+conversao);
        System.out.println("A hora formatada é "+hora+":"+Math.round(min*100));
    }
}

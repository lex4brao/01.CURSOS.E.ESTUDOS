package aula13;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Ex06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.####");
        double raio, area;
        System.out.println("Calculo da area do circulo");
        System.out.println("Digite o raio do circulo");
        raio = sc.nextDouble();
        area = Math.PI*Math.pow(raio,2);
        System.out.println("Area do circulo é "+df.format(area));
    }
}

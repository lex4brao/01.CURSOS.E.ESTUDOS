package CAP03.ex1resolv;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        double pol, pes, jarda, milha;
        System.out.println("Conversor de medidada ");
        System.out.println("Digite uma medida em polegadas ");
        pes = sc.nextDouble();
        pol= pes*12;
        System.out.println("A medida em polegadas é "+pol);
        jarda = pes/3;
        System.out.println("A medida em jardas é "+jarda);
        milha = jarda/1760;
        System.out.println("A medida em milhas é "+milha);
    }
}

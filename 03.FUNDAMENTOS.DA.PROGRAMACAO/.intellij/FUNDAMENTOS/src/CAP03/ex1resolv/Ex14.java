package CAP03.ex1resolv;

import java.util.Calendar;
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();

        int nascimento;
        int anoAtual= calendar.get(Calendar.YEAR);
        System.out.println("Digite o ano em que vc nasceu");
        nascimento = sc.nextInt();
        int idade = anoAtual - nascimento;
        System.out.println("Sua idade é "+idade);
        System.out.println("Em 2050 você terá "+(2050-nascimento));

    }
}

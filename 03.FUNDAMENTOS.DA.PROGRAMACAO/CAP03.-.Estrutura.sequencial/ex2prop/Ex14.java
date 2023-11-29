package CAP03.ex2prop;

import java.time.LocalDate;
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate datenow = LocalDate.now();
        System.out.printf("Em que ano vc nasceu ");
        int nasc = sc.nextInt();
        int idA = datenow.getYear()-nasc;
        System.out.println("Voce tem "+idA+" anos");
        int idM = idA*12;
        System.out.println("Voce tem "+idM+" meses de vida");
        int idD = idA*365;
        System.out.println(" Voce tem "+idD+" dias de vida");
        int idS = idD/7;
        System.out.println("  Voce tem "+idS+" semanas de vida");

    }
}

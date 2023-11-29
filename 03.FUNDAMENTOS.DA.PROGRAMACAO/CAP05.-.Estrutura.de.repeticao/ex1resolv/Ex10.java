package CAP05.ex1resolv;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("###,###.##");
    System.out.print("Quantos times terão no campeonato: ");
    int qtdTime= sc.nextInt();
    System.out.print("Quantos jogadores tem cada time: ");
    int qtdJogador = sc.nextInt();
    int codTime;
    int codJogador;
    int idJogador;
    double pesoJogador;
    double altJogador;
    int jog18 = 0;
    double medId = 0;
    double medAlt = 0;
    double peso80=0;

    for (int i = 0; i < qtdTime; i++) {
        codTime = i+1;
        medId = 0;
      System.out.println("\n*** Cadastro Time "+(i+1)+" ***");
      for (int j = 0; j <qtdJogador ; j++) {
        codJogador = i+1;
        System.out.println("\n Jogador "+codJogador+" ");
        System.out.print("Idade: ");
        idJogador = sc.nextInt();
        jog18 = (idJogador<18)?(jog18+1): jog18;
        medId += idJogador;

        System.out.print("Altura: ");
        altJogador = sc.nextDouble();
        medAlt+=altJogador;

        System.out.print("Peso: ");
        pesoJogador = sc.nextDouble();
        peso80 = (pesoJogador>80)?(peso80+1): peso80;
      }
      medId = medId/qtdJogador;
      System.out.println("A media de idade do time é "+medId);
    }
    medAlt = medAlt/(qtdTime*qtdJogador);
    System.out.println("\n\n*** Resultados ***");
    System.out.println("Total de "+jog18+" jogadores menores que 18 anos");
    System.out.println("A media de altura de todos os jogadores é "+medAlt);
    peso80 = (peso80/(qtdTime*qtdJogador))*100;
    System.out.println("Jogadores com mais de 80kg é "+peso80+"% dos jogadores");
  }
}

package CAP06.ex1resolv;

public class Ex14 {
  public static void main(String[] args) {

    String[] nomes = {"João", "Maria", "Carlos", "Ana", "Pedro"};
    double[] salarios = {3500.0, 4200.0, 5000.0, 3800.0, 6000.0};
    int[] tempoDeServico = {2, 5, 10, 3, 7};
    System.out.println("Funcionários que terão aumento ");
    for (int i = 0; i < nomes.length; i++) {
      if (salarios[i]<4000&&tempoDeServico[i]>5){
        System.out.printf("%-9S", nomes[i]);
        System.out.printf(" Aumento de 35%% %n");
      } else if (salarios[i] < 4000) {
        System.out.printf("%-9S", nomes[i]);
        System.out.printf(" Aumento de 25%% %n");
      } else if (tempoDeServico[i]>5) {
        System.out.printf("%-9S", nomes[i]);
        System.out.printf(" Aumento de 15%% %n");
      }
    }
  }
}

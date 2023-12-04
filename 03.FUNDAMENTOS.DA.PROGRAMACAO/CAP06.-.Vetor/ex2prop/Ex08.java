package CAP06.ex2prop;

public class Ex08 {
  public static void main(String[] args) {
    String[] nomes = {"Ana", "João", "Maria", "Carlos", "Lúcia", "Pedro", "Laura"};
    double[] notasProva1 = {7.5, 8.0, 6.5, 9.0, 7.0, 8.5, 9.5};
    double[] notasProva2 = {6.0, 7.0, 8.5, 9.5, 8.0, 7.5, 8.0};
    double[] media = new double[nomes.length];
    double maior = Double.MIN_VALUE;
    String maiorNome="";

    System.out.println();
    System.out.println();
    for (int i = 0; i < nomes.length; i++) {
      media[i] = (notasProva1[i]+notasProva2[i])/2;
      if (Math.max(maior, media[i])==media[i]){
        maior = media[i];
        maiorNome = nomes[i];
      }
      System.out.printf("\"%-10s\" - Prova 1 = \"%-2.2f\" Prova 2 = \"%-2.2f\" Média = \"%-2.2f\"",
              nomes[i], notasProva1[i], notasProva2[i], media[i]);
      System.out.println((media[i]>=7)?" - APROVADO": " - REPROVADO");
    }
    System.out.println();
    System.out.println();
    System.out.println("A maior média é do "+maiorNome+" com a média "+maior);
  }
}

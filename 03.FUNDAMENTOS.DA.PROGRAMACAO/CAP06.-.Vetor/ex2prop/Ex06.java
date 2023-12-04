package CAP06.ex2prop;

public class Ex06 {
  public static void main(String[] args) {
    String[] nomesVendedores;
    nomesVendedores = new String[]{"Vendedor1", "Vendedor2", "Vendedor3", "Vendedor4",
            "Vendedor5", "Vendedor6", "Vendedor7", "Vendedor8", "Vendedor9", "Vendedor10"};
    double[] totalVendas = new double[]{1500.0, 2000.0, 1800.0, 2500.0, 3000.0, 1200.0,
            2800.0, 1700.0, 2200.0, 1900.0};
    double[] percentualComissao = {10.0, 8.0, 12.0, 9.5, 11.0, 10.5, 8.5, 9.0, 10.0, 8.0};
    double total = 0;
    double maior = Double.MIN_VALUE;
    double menor = Double.MAX_VALUE;
    int busMA = 0, busMe =0;

    for (int i = 0; i < nomesVendedores.length; i++) {
      System.out.println(nomesVendedores[i] + "  R$" + (totalVendas[i] * (percentualComissao[i] / 100)));
      total += totalVendas[i];
      if (Math.max(maior, totalVendas[i])==totalVendas[i]){
        maior = totalVendas[i];
        busMA = i;
      }
      if (Math.min(totalVendas[i], menor)==totalVendas[i]){
        menor = totalVendas[i];
        busMe = i;
      }
    }
    System.out.println();
    System.out.println("total = " + total);
    System.out.println("Maior vendedor ");
    System.out.println(nomesVendedores[busMA]+" R$"+totalVendas[busMA]);
    System.out.println();
    System.out.println("Menor vendedor ");
    System.out.println(nomesVendedores[busMe]+" R$"+totalVendas[busMe]);
    System.out.println();

  }
}

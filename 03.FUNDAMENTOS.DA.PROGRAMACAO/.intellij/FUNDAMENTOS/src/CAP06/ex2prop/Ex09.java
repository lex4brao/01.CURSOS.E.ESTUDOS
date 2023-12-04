package CAP06.ex2prop;

public class Ex09 {
  public static void main(String[] args) {
    String[] nomesProdutos = {"Produto A", "Produto B", "Produto C", "Produto D", "Produto E",
            "Produto F", "Produto G", "Produto H", "Produto I", "Produto J"};
    int[] codigosProdutos = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110};
    double[] precosProdutos = {19.99, 29.99, 14.99, 9.99, 49.99, 34.99, 24.99, 39.99, 17.99, 59.99};
    for (int i = 0; i < nomesProdutos.length; i++) {
      System.out.printf("%-10s | %3d | R$%2.2f%n", nomesProdutos[i], codigosProdutos[i], precosProdutos[i]);

    }
      System.out.println();
      System.out.println();
      System.out.println("Produtos que sofrerão aumento: ");
    for (int i = 0; i < nomesProdutos.length; i++) {
      if ((codigosProdutos[i]%2==0)&&(precosProdutos[i]>=20)){
        precosProdutos[i]= precosProdutos[i]*1.2;
        System.out.printf("%-10s | %3d | R$%2.2f%n", nomesProdutos[i], codigosProdutos[i], precosProdutos[i]);
      } else if ((codigosProdutos[i]%2==0)) {
        precosProdutos[i]= precosProdutos[i]*1.15;
        System.out.printf("%-10s | %3d | R$%2.2f%n", nomesProdutos[i], codigosProdutos[i], precosProdutos[i]);
      } else if (precosProdutos[i]>=20) {
        precosProdutos[i]= precosProdutos[i]*1.1;
        System.out.printf("%-10s | %3d | R$%2.2f%n", nomesProdutos[i], codigosProdutos[i], precosProdutos[i]);
      }
    }

  }
}

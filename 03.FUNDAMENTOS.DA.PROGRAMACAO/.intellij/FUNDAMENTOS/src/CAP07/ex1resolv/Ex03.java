package CAP07.ex1resolv;

public class Ex03 {
  public static void main(String[] args) {
    String[] nomesLojas = {"Loja A", "Loja B", "Loja C", "Loja D", "Loja E", "Loja F", "Loja G", "Loja H"};

    String[] nomesProdutos = {"Produto 1", "Produto 2", "Produto 3", "Produto 4"};

    double[][] precosProdutos = {
            {10.99, 20.49, 15.99, 5.99},
            {12.99, 18.99, 25.49, 8.99},
            {14.49, 22.99, 19.99, 7.49},
            {9.99, 16.49, 13.99, 6.99},
            {11.49, 24.99, 17.99, 9.49},
            {13.99, 21.49, 16.99, 4.99},
            {10.49, 19.99, 14.49, 7.99},
            {15.99, 23.49, 18.99, 6.49}
    };
    System.out.print("          ");
    for (int i = 0; i <nomesProdutos.length ; i++) {
      System.out.printf("%-11s",nomesProdutos[i]);
    }
    System.out.println();
    for (int i = 0; i < nomesLojas.length; i++) {
      System.out.printf("%8s   ", nomesLojas[i]);
      for (int j = 0; j < precosProdutos[0].length; j++) {
        System.out.printf("R$%-9.2f", precosProdutos[i][j]);
      }
      System.out.println();
    }

  }
}

package exerciciosloiane;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;


public class main {

    public static void main(String[] args) {
      int quantidadeNumeros = 30;

      Set<Integer> numerosSorteados = sortearNumerosUnicos(quantidadeNumeros);

      // Exibindo os números sorteados
      System.out.println("Números Sorteados:");
      for (int numero : numerosSorteados) {
        System.out.println(numero);
      }
    }

    public static Set<Integer> sortearNumerosUnicos(int quantidade) {

      Set<Integer> numerosSorteados = new HashSet<>();
      Random random = new Random();

      while (numerosSorteados.size() < quantidade) {
        int numeroAleatorio = random.nextInt(100); // Gera números aleatórios de 0 a 99 (ajuste conforme necessário)
        numerosSorteados.add(numeroAleatorio);
      }

      return numerosSorteados;
    }
  }
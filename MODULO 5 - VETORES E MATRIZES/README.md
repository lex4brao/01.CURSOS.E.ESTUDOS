# MÓDULO 5 - VETORES E MATRIZES

### Aula 19

### Vetores (Arrays)
Vetores é uma lista de dados, é muito parecido com uma coluna do excel, onde usamos cada linha da coluna para colocar dados, ou seja ao invés de colocarmos, cada dado em uma unica variável, criamos um vetor com um numero fixo de posições e cada posição armazena dados conforme o tipo do vetor, um vetor de 10 posições irá armazenar dados como se fosse 10 variáveis, as posições de um vetor é chamada de indices, e seus indices sempre começam do 0
Para criar um vetor colocamos seu tipo logo depois os colchete "[]" para mostrar que se trata de um vetor, logo após o nome do vetor veja o exemplo a seguir:
```
public class Vetor {
  public static void main (String[] args) {
    double[] temperatura = new double[5];
    temperatura[0]=35.7;
    temperatura[1]=34.8;
    temperatura[2]=35;
    temperatura[3]=35.2;
    temperatura[4]=36;
    System.out.println("Temperatura dia 1: " + temperatura[0]);
    System.out.println("Temperatura dia 2: " + temperatura[1]);
    System.out.println("Temperatura dia 3: " + temperatura[2]);
    System.out.println("Temperatura dia 4: " + temperatura[3]);
    System.out.println("Temperatura dia 5: " + temperatura[4]);
    
    System.out.println("\nTamanho do vetor " + temperatura.length);

  }
}

```

### Preenchendo e Imprimindo um Vetor
É muito comum a utilização do loop "for" para inserir dados em um vetor, e com isso também utilizamos para imprimir cada posição de um vetor, não é atoa que é muito utilizado a variável "i" como controle do "for" o i é uma nomeclatura para indice veja o exemplo abaixo:
```
package Aula19;

import java.util.Scanner;

public class Vetor2 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    double[] temperatura = new double[5];
    int i=0;
    
    for(i=0;i<temperatura.length;i++) {
      System.out.print("Digite a temperatura do " + (i+1) + "º dia: ");
      temperatura[i] = scan.nextDouble();
    } 
    for(i=0;i<temperatura.length;i++) {
      System.out.println("Dia " + (i+1) + ": " + temperatura[i]);
    } 

  }
}

```

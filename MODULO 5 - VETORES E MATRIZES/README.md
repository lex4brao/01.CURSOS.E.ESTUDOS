# MÓDULO 5 - VETORES E MATRIZES

## Aula 19

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
## Resolva a bateria de exercicíos
  ### [Lista de Exercicíos](https://github.com/lex4brao/02.CURSO.DE.JAVA.-.LOIANE.GRONER/tree/main/RESOLUCAO%20DE%20EXERCICIOS)

  
## Aula 20

### Matrizes (Arrays Multi-dimensionais)
Eu gosto de chamar Matrizes de vetor de vetores, ou seja da mesma forma que o vetor  é uma lista ordenada de variáveis eu digo ordenada pois os suas posições segue uma ordem crescente de 0 até N [tamanho do vetor], uma matris ao invéz de uma lista é uma tabela que armazena valores:
Vamos a uma situação real aonde vamos utilizar um vetor para armazenar as 4 notas bimestrais de um aluno
  aluno[] = {7.5, 8.5, 6.0, 7.0}

Acima temos um vetor de 4 posições aonde armazemanos as 4 notas de um aluno, ou seja com um vetor armazenamos dados do que seria necessário utilizar 4 variáveis, agora imagine se tivessemos 15, 20 alunos iriamos, utilizar 20 vetores? Claro que não! Para solucionar isso temos as matristes aonde poderiamos ilustrar da seguinte forma

  aluno1 = {6.0, 7.5, 9.0, 8.5}
  aluno2 = {7.0, 8.5, 6.0, 7.5}
  aluno3 = {8.5, 9.0, 7.5, 6.0}
  aluno4 = {7.0, 8.0, 6.0, 9.5}
  aluno5 = {6.0, 7.5, 9.0, 8.5}
  aluno6 = {8.5, 9.0, 7.5, 6.0}

Por isso que eu chamo matriz de vetor de vetores aonde cada linha da matriz armazena as notas do alunos e cada coluna as notas bimestrais do aluno

### Declaração de Matrizes
Para declarar um vetor anteriormente utilizavamos o colchetes "[]" para declarar uma matriz utilizamos dois colchetes "[][]" aonde o primeiro colchete é o numero de linhas e o segundo o numero de colunas veja o exemplo abaixo para uma matriz da situação das notas dos alunos
```
  double [][] matriz = new int[6][]
```
### Atribuindo valoves a uma matriz
a melhor forma de mostrar como atribuir valores a uma matriz é mostrando um exemplo de um código, veja o exemplo abaixo:

```
package Aula20;

public class Matrizes {
  public static void main (String[] args) {
    
    double[][] notasAlunos = new double[3][4];

    notasAlunos[0][0] = 10;
    notasAlunos[0][1] = 7;
    notasAlunos[0][2] = 8;
    notasAlunos[0][3] = 9.5;

    notasAlunos[1][0] = 9;
    notasAlunos[1][1] = 8;
    notasAlunos[1][2] = 7;
    notasAlunos[1][3] = 9;

    notasAlunos[2][0] = 8;
    notasAlunos[2][1] = 9;
    notasAlunos[2][2] = 10;
    notasAlunos[2][3] = 7;

  }
}

```
### Imprimendo os valores de uma matriz
Para imprimir na tela os valores de uma matriz vamos utilizar um "for", que pode ser usado tanto para imprimir um valor quando para receber um valor em cada uma das posições da matriz.
No caso das matrizes é necessário um "for" aninhado ou seja um "for" para as linhas e dentro de "for" outro para as colunas, veja o exemplo abaixo
```
for(i=0;i<notasAlunos.length;i++) {
        System.out.println("\nNotas Aluno "+(i+1));
          for(j=0;j<notasAlunos[i].length;j++) {
            System.out.print("\t"+notasAlunos[i][j]);
          } 
      } 
```

### A média do aluno
Podemos fazer a manipulação de dados de uma matriz e atravéz disso realizar calculos como a média do aluno veja o exemplo abaixo
```
for(i=0;i<notasAlunos.length;i++) {
        System.out.println("\nNotas Aluno "+(i+1));
        soma=0;
          for(j=0;j<notasAlunos[i].length;j++) {
            System.out.print("\t"+notasAlunos[i][j]);
            soma+= notasAlunos[i][j];
          } 
          System.out.println("\nA média do aluno é: "+(soma/j));
          System.out.println(" ");
      }
```

### Iniciando a Matris e colocando valore
Ao inicializar uma matriz também é possivel atribuir valores a ela de uma só vez veja o exemplo abaixo
```
public class Matrizes2 {
	public static void main(String[] args) {

		int i=0, j=0;
		double[][] matriz = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15 },{16,17,18,19,20}};

		for (i = 0; i < matriz.length; i++) {
			System.out.println("\nLinha" + i + ": ");
			for (j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+", " );
			}
		}

	}
```
Esse método de atribuição de valores também pode ser usado para vetores 

### Matrizes de 3 Dimensões
Até o momento vimos matrizes de 2 dimensões porem é possivel criar matrizes com mais dimensões, porem para grande maioria dos seres humanos é complexo de imaginar uma matriz de 4 dimensões então vamos imagina uma de 3 dimensões onde podemos ilustrar atrazes de um cubo onde uma dimensão é seu "COMPRIMENTO" a outra é sua "LARGURA" a outra sua profundidade no plano cartesiano chamamos isso de [x],[y],[z]

### Hands On
Para a gente entender melhor vamos fazer uma pratica, vamos criar uma matrix[3][3][3] 
```
public class Matriz3D {
	public static void main(String[] args) {

		int i = 0, j = 0, k = 0, somaTotal = 0, somaImpar = 0, somaPar = 0;
		int[][][] matriz3D = new int[3][3][3];

		// Atribuindo valores na matriz
		for (i = 0; i < matriz3D.length; i++) {
			for (j = 0; j < matriz3D[i].length; j++) {
				for (k = 0; k < matriz3D[j].length; k++) {
					matriz3D[i][j][k] = (int) (Math.random() * 100);
				}
			}
		}
		// Imprimindo a Matriz e fazendo a soma total da matriz e de cada e soma dos
		// pares e im
		for (i = 0; i < matriz3D.length; i++) {
			for (j = 0; j < matriz3D[i].length; j++) {
				for (k = 0; k < matriz3D[j].length; k++) {
					System.out.println("Matriz[" + i + "][" + j + "][" + k + "]:  " + matriz3D[i][j][k]);
					somaTotal += matriz3D[i][j][k];
					if (matriz3D[i][j][k] % 2 == 0) {
						somaPar += matriz3D[i][j][k];
					} else {
						somaImpar += matriz3D[i][j][k];
					}
				}
				System.out.println(" ");
			}
			System.out.println(" ");
			System.out.println(" ");
		}
		System.out.println("A soma total dos elementos é " + somaTotal);
		System.out.println("A soma total dos Pares é " + somaPar);
		System.out.println("A soma total dos Impares é " + somaImpar);

	}

}
```

### Matrizes Iregulares
Matrizes irregulares são matrizes com dimensões variadas, nas quais o numero de elementos em cada linha pode ser diferente nada melhor que praticarmos para entender melhor o conceito

### Hands On
Vamos fazer um programa para guardar dados de uma pesquisa onde pergunta-se a quantidade de filhos e o nome de cada filho, Essas informações serão guardadas em uma matriz de forma que cada entrevista ocupe somente o espaço necessário na memória para guardar os noms dos filhos, no final vamos mostrar a quantidade de pessoas entrevistadas a quantidade de cada filho de cada entrevistado e os nome dos seus filhos
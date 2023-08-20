# Java Básico

### Prof Loiane Groner

## [Exercicios Resolvidos](https://github.com/lex4brao/01.CURSOS.E.ESTUDOS/tree/main/03.JAVA%2CBASICO.-.LOIANE%2CGRONER/00.RESOLUCAO.DE.EXERCICIOS)

## Aula 19 - Vetores e Arrays

Vetor é uma lista ordenada de dados

```java
public class Teste {
    public static void main(String[] args) {
        // declarando o vetor
        int[] vet = new int[10];
        // preenchando o vetor
        for (int i=0;i<vet.length;i++){
            vet[i] = (i*3)+2;
        }
        // mostrando o vetor na tela
        for (int i=0;i<vet.length;i++){
            System.out.println("pos["+i+"]: "+vet[i]);
        }
    }
}
```

```java
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();
        
        // Declarando e criando um vetor de inteiros com o tamanho fornecido
        int[] vetor = new int[tamanho];
        
        // Preenchendo o vetor com valores fornecidos pelo usuário
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor para a posição " + i + ": ");
            vetor[i] = scanner.nextInt();
        }
        
        // Imprimindo o vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("vetor[" + i + "] = " + vetor[i]);
        }
        
        scanner.close();
    }
}

```

## Aula 20 - Arrays multi demensionais (matrizes)

Matriz é uma tabela de dados, também conhecido como o Array de Arrays

```java
public class Ex01 {
    public static void main(String[] args) {
        double[][] matriz = new double[4][4];
        for (int i=0;i< matriz.length;i++){
            for (int j=0;j<matriz[i].length;j++){
                matriz[i][j] = Math.random()*10;
                System.out.printf("%.2f  ",matriz[i][j]);
            }
            System.out.println();
        }

    }
}
```

## Aula 21 - For Each

O loop "for-each" faz a iteração por cada elemento da coleção, sem que você precise se preocupar com índices ou iteradores. Cada elemento é atribuído a uma variável temporária e o corpo do loop é executado para cada elemento. Quando todos os elementos são percorridos, o loop termina automaticamente.

```java
import java.util.Random;

public class Teste {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbs = new int[10];
        for (int i=0;i< numbs.length;i++){
            numbs[i] = random.nextInt(100);
        }
        // FOR EACH
        for(int numb : numbs){
            System.out.printf(numb+" ");
        }
    }
}

```

Esse é apenas um exemplo básico. Você pode usar o loop "for-each" em muitos outros cenários, desde percorrer listas até trabalhar com conjuntos ou outras coleções. Lembre-se de que o loop "for-each" é mais adequado quando você não precisa modificar os elementos da coleção durante a iteração. Ou seja, com o "for-each" nós só conseguimos "vizualizar" e percorrer os elementos de um vetor, matriz, listas, etc..., não podemos fazer alteração em qualquer valor de qualquer elemento para fazer alguma modificação é utilizado o for convencional

## [VOLTAR](https://github.com/lex4brao/01.CURSOS.E.ESTUDOS/blob/main/README.md)
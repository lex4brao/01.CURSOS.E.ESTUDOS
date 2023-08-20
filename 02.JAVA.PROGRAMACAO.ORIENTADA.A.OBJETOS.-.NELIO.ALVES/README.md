# Java COMPLETO 2023 Programação Orientada a Objetos + Projetos

### Prof Nélio Alves

## [Exercicios Resolvidos](https://github.com/lex4brao/01.CURSOS.E.ESTUDOS/tree/main/02.JAVA.PROGRAMACAO.ORIENTADA.A.OBJETOS.-.NELIO.ALVES/01.-.EXERCICOS)

## Seção 1: Introdução

### Aula 1. Introdução: visão geral do curso

## Seção 2: Conceitos de programação

### Aula 2. Visão geral do capítulo

### Aula 4. Algoritmo, Automação, Programa de Computador

### Aula 5. O que é preciso para se fazer um programa de computador

- Uma Linguagem de Programação
- Uma IDE
- Um Compilador
- Um gerador de código ou maquina virtual

### Aula 6. Linguagem de programação, léxica, sintática

### Aula 7. IDE - Ambiente Integrado de Desenvolvimento

### Aula 8. Compilação, interpretação, código fonte, código objeto, máquina virtual

## Seção 3: Introdução à linguagem Java

### Aula 11. Entendendo as versões do Java

### Aula 12. Histórico e edições de Java

### Aula 13. JDK / JVM - Máquina Virtual do Java

### Aula 14. Estrutura de uma aplicação Java

- Todo código em java tem que estar dentro de Classes
- Todas as classes relacionadas estão dentro de Pacotes
- Todos os pacotes relacionados estçao dentro de um Módulo
- Aplicação é um agrupamento de módulos relacionados

### Aula 15. Instalando o Java JDK

### Aula 16. Instalando o Eclipse

### Aula 17. Primeiro programa em Java no Eclipse

## Seção 4: Estrutura sequencial

### Aula 20. Expressões aritméticas

### Aula 21. Variáveis e tipos básicos em Java

### Aula 22. As três operações básicas de programação

### Aula 23. Saída de dados em Java

### Aula 24. Processamento de dados em Java, Casting

### Aula 25. Entrada de dados em Java - Parte 1

### Aula 26. Entrada de dados em Java - Parte 2

### Aula 27. Funções matemáticas em Java

## Seção 5: Estrutura condicional

### Aula 32. Expressões comparativas

### Aula 33. Expressões lógicas

### Aula 34. Estrutura condicional (if-else)

### Aula 37. Sintaxe opcional - operadores de atribuição cumulativa

### Aula 38. Sintaxe opcional - switch-case

```java
switch ( expressão ) {
  case valor1:
    comando1
    comando2
  break;
  case valor2:
    comando3
    comando4
  break;
  default:
    comando5
    comando6
  break;
}

```

### Aula 39. Expressão condicional ternária

Estrutura opcional ao if-else quando se deseja decidir um VALOR com base em uma condição
**If-Else comum**

``` java
  double preco = 34.5;
  double desconto;
  if (preco < 20.0) {
    desconto = preco * 0.1;
  }
  else {
    desconto = preco * 0.05;
  }
```

**Expressão ternária**

```java
double preco = 34.5;
double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
```

### Aula 40. Escopo e inicialização

## Seção 6: Estruturas repetitivas

### Aula 44. Estrutura repetitiva enquanto (while)

```java
import java.util.Scanner;
public class Teste {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x = sc.nextInt();
        int soma=0;
        while (x!=0){
            soma +=x;
            x = sc.nextInt();
        }
        System.out.println(soma);

    }
}
```

### Aula 49. Estrutura repetitiva para (for)

```java
import java.util.Scanner;
public class Teste {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fim, i;
        System.out.printf("Digite o valor do final da contagem: ");
        fim = sc.nextInt();
        for (i=0;i<=fim;i++){
            System.out.println(i);
        }
    }
}
```

```java
import java.util.Scanner;
public class Teste {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fim, i;
        System.out.printf("Digite o valor do final da contagem: ");
        fim = sc.nextInt();
        for (i=fim;i>=0;i--){
            System.out.println(i);
        }
    }
}

```

### Aula 54. Estrutura repetitiva faça-enquanto (do-while)

```java
import java.util.Scanner;
public class Teste {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String resp;
        int x=0;
        do {
            System.out.printf("Digite um valor: ");
            x= sc.nextInt();
            System.out.println(x+"² = "+Math.pow(x,2));
            System.out.printf("Deseja continuar\n[S]im\n[N]ão\n>>");
            resp= sc.next();
        } while (!resp.equalsIgnoreCase("n"));

    }
}

```

## Seção 7: Outros tópicos básicos sobre Java

### Aula 56. Restrições e convenções para nomes

### Aula 57. Operadores bitwise

### Aula 58. Funções interessantes para String

```java
public class Teste {
    public static void main(String[] args) {
        String original ="abcde FGHIJ ABC abc DEFG";
        String s1 = original.toLowerCase();
        System.out.println(original);
        System.out.println(s1);
        s1 = original.toUpperCase();
        System.out.println(s1);
        String nome="Alexandre Abrão";
        String primeiroNome = nome.substring(0,9);
        System.out.println(nome);
        System.out.println(primeiroNome);
        String sobrenome = nome.substring(10);
        System.out.println(sobrenome);

    }
}
```

### Aula 59. Comentários em Java (básico)

### Aula 60. Funções (sintaxe)

```java
import java.util.Random;

public class Teste {
    public static void main(String[] args) {
        Random random = new Random();
        int x= random.nextInt(100);
        System.out.println("O numero sorteado é: "+x);
        String texto = txt(x);
        System.out.println("Esse é um numero "+texto);
    }
    public static String txt(int x){
        String aux;
        if (x%2==0){
            aux = "PAR";
        }else {
            aux = "IMPAR";
        }
        return aux;
    }
}
```

## Seção 8: Introdução à Programação Orientada a Objetos

### Aula 64. Criando uma classe com três atributos para representar melhor o triângulo

### Aula 65. Criando um método para obtermos os benefícios de reaproveitamento e delegação

Classe Principal Main

```java
public class Teste {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Triangulo x,y;
        x= new Triangulo();

        System.out.println("Entre com as medidas do triangulo: ");
        System.out.printf("Lado A: ");
        x.a= sc.nextInt();
        System.out.printf("Lado B: ");
        x.b= sc.nextInt();
        System.out.printf("Lado C: ");
        x.c= sc.nextInt();
        System.out.println("A area do triangulo é "+x.area());

    }
}
```

Classe Triangulo

```java
public class Triangulo {
    public double a;
    public double b;
    public double c;
    public double area(){
        double p=((a+b+c)/2);
        return Math.sqrt(p*((p-a)*(p-b)*(p-c)));
    }
}
```

### Aula 66. Começando a resolver um segundo problema exemplo

### Aula 67. Object e toString

toString() é um método que pertence à classe Object, a classe base de todas as outras classes em Java. Ele é usado para retornar uma representação em forma de string do objeto. Por padrão, todas as classes em Java herdam esse método da classe Object, mas muitas classes personalizam a implementação do método toString() para fornecer informações úteis sobre o objeto quando convertido em uma string.

### Aula 68. Finalizando o programa

### Aula 70. Membros estáticos - Parte 1

### Aula 71. Membros estáticos - Parte 2

A O método main por padrão sempre será statico, uma metodo estático e mebros estáticos não tem a necessidade de instanciar a classe no Método "MAIN", Já os métodos e membros não estáticos tem a necessidade de se instanciar a classe

### Aula 

## [VOLTAR](https://github.com/lex4brao/01.CURSOS.E.ESTUDOS/blob/main/README.md)

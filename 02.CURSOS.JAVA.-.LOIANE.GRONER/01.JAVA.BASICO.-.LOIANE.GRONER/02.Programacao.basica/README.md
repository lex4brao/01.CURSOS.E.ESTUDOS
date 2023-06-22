# 02 - Programação Básica

## Aula 10 - Introdução as variáveis

### O que são variáveis

Váriavel é onde armazenamos os dados que precisamos utilizar em nossos programas, Cada váriavel possui 4 caracteristicas, nome, endereço de memórial, valor, e tipo de dado, o nome da várivael é usado para identificar e acessar em um programa

### Declaração de uma variável em java

Para declarar uma variável em java utilizamos uma ordem de declaração da seguinte forma

```<tipo da variável> <nome da variável>;```

Para declara uma variável atribuindo seu valos utilizamos 

```<tipo da variável> <nome da variável> = <valor da variável>;```

### Convensão de uma nomenclatura de uma variável

Convensão podemos chamar de algumas regras e boas práticas utilizada na programação em java

1. Não pode ser uma palavra reservada do java
2. O nome da variável deve começar com uma letra do alfabeto de a até z e por convensão inicial sempre por letra minuscula
3. Da segunda letra em diante é possivel utilizar o "_" underline e numero de 0 até 9
4. Utilizar o CamelCase para nomes compostos em uma variável como "idadeFuncionario", "nomeDaPessoa", salarioDoColaborador"

**Não é permitido utilizar**

- Não pode usar acentos
- Não pode haver espaços
- Não pode haver caracteres especiais (%$&\*#@!”/?ºª°¹²³)

### Os tipos primitivos em Java
Alguns tipos primitivos em Java são
- Int para numeros inteiros
- float ou double para numeros reais
- char para caracter
- boolean para valores lógicos como verdadeiro ou falso

### Hands On
Exemplos de declaração de algumas variáveis

```java
public class Variaveis {
  public static void main (String[] args){    
    int idade;
    String nome;
    String nomeDoCachorro;
    char sexoDaPessoa;
    boolean maiorDe18;
    String sobrenome = "Silva";
    idade = 25;
    sexoDaPessoa = 'H';
    nome = "Alexandre";
    System.out.println(nome+" "+sobrenome+" tem "+idade+" anos");
  }
}
```

### Práticas ruins

```java
  int a = 10;
  String nP;
  double valor;
```

## Aula 11 - Os tipos primitivos

Na linguagem java podemos dividir os tipos primitivos em 2 grupos de tipos primitivos os tipos para numeros, sendo que os caracteres se enquadram nos tipos de numeros, e o tipo boolean que só recebem valores lógicos ou seja, "True" e "false"

### Os Tipos Numéricos

- Para numeros inteiros
  - byte
  - short
  - int
  - long
  - char (o char é para caractres porem conforme a tabela ASCII se enquadram em numeros inteiros)

- Para numeros reais
  - float
  - double

### O tipo **char**

O tipo char se enquadra nos tipos numeros defivo a refencia a tabela ASCII, onde cada caracter tem um código numérico, veja a tabela [**CLICANDO AQUI**](https://www.ime.usp.br/~kellyrb/mac2166_2015/tabela_ascii.html)
Para nós que falamos e escrevemos em lingua latinas temos a tabela unicode e utilizamos a tabela UTF-8, que contem caracteres com acentuação como é utilizado no portugues brasileiro, veja a tabela [**CLICANDO AQUI**](https://www.utf8-chartable.de/)

Veja o exemplo da atribuição de valores para tipos char
```java
public class Main {
    public static void main(String[] args) {
        char caracter1 = 35;
        char caracter2 = 36;
        char caracter3 ='#';
        char caracter4 ='$';

        System.out.println(caracter1+" "+caracter3);
        System.out.println(caracter2+" "+caracter4);
    }
}
```

Veja que quando o exemplo quando atribuimos valores contendo o caracter utilizamos aspas simples ' ', isso é uma regra pra quando for atribuir valor a uma variável do tipo char, quando não foi utilizado as aspas simples é porque o Java faz referencia a tabela ASCII

### As Strings

Para utilizar uma variável contendo uma palavra ou uma frase utilizando uma String, a String não é um tipo primitivo e sim uma classe da linguagem java, porem tratamos a classe String como se fosse um tipo primitivo, outro aspecto impotante é sempre que formos atribuir um valor pra uma String utilizamos as aspas duplas ""

Veja o Exemplo

```java
public class Main {
    public static void main(String[] args) {
        String nome = "Alexandre";
        String sobrenome = "Abrão";

        System.out.println(nome+" "+sobrenome);
    }
}
```

### Valores Literais

O Java nos possibilita atribuit valores para tipos inteiros utilizando bases numéricas, porem antes dos valores é necessário colocar o prefixo de sua base

- Hexadecimal prefixo ```0x```
- Octal prefixo ```0```
- Binario prefixo ```0b```

### Sequencia de Escapes no Java

| Descrição | Sequencia de Escape |
| --- | :---: |
| tabulação | \t |
| nova linha | \n |
| aspas simples | \' |
| aspas duplas | \" |
| barra invertida | \\\ |

## Aula 12 - Lendo entrada de dados pelo teclado

Para ler as entrada de dados do teclado no Java utilizamos a classe Scanner, pra isso é necessário colocar alguns comando em nosso códgio como importar a classe Scanner e determinar e precisamos instanciar a classe veja o exemplo:

```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    }
}
```
### Lendo uma linha inteira 

Para receber os dados do teclado precisamos utilizar o comando ```scan.nextLine()```
  Ao clicarmos a tecla enter o java irá receber os dados

### Lendo tipos especificos

Para receber o valor de um tipo inteiro utilizamos o comando ```scan.nextInt()```
Para receber o valor de um tipo real utilizamos o comando ```scan.nextDouble()```
Para receber o valor de uma unica palavra utilizamos o comando ```scan.next()```
  O Java só 

### Exemplo

```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        String nomeCompleto;
        int idade;
        double salario;

        System.out.println("Digite seu nome: ");
        nome = scan.next();
        System.out.println("Digite sua idade");
        idade = scan.nextInt();
        System.out.println("Digite seu salario");
        salario = scan.nextDouble();
        System.out.println("Digite seu nomes completo");
        scan.nextLine();
        nomeCompleto = scan.nextLine();


        System.out.println("\nCadastro: ");
        System.out.println(nome);
        System.out.println(idade);
        System.out.println("R$:"+salario);
        System.out.println(nomeCompleto);
    }
}
```

## Aula 13 - Operadores

### Operadores Aritméticos

| Operador | Descrição |
| :---: | --- |
| + | adição (positivo unário) |
| - | subtração (negativo unário) |
| * | multiplicação |
| / | divisão |
| % | módulo da divisão (resto da divisão) |
| ++ | incremento (pós ou pré fix) |
| -- | decremento (pós ou pré fix) |

Veja alguns exemplos

```java
public class Main {
    public static void main(String[] args) {
     int valor1 = 1;
     int valor2 = 2;
     int resultado;
     resultado = valor1+valor2;
     System.out.println(resultado);
     resultado= resultado*7;
     System.out.println(resultado);
     resultado= resultado/2;
     System.out.println(resultado);
     resultado= resultado-3;
     System.out.println(resultado);
     resultado= resultado%2;
     System.out.println(resultado);
     resultado= resultado+9;
     System.out.println(resultado);
     resultado++;
     System.out.println(resultado);
     resultado--;
     System.out.println(resultado);
    }
}
```

## Operadores Relacionais

São os operadores para ser fazer comparações

| Operador | Descrição |
| :---: | --- |
| == | igual a |
| != | diferente de |
| > | maior que |
| < | menos que |
| >= | maior ou igual a |
| <= | menor ou igual a |

Veja alguns exemplos
```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    int valor1 = 1;
    int valor2 = 3;
     System.out.println(valor1+" = "+valor2+" "+(valor1==valor2));
     System.out.println(valor1+" != "+valor2+" "+(valor1!=valor2));
     System.out.println(valor1+" > "+valor2+" "+(valor1>valor2));
     System.out.println(valor1+" < "+valor2+" "+(valor1<valor2));
    }
}
```

### Operadores Lógicos

| Operador | Descrição |
| :---: | --- |
| & | AND |
| | | OR |
| ^ | XOR |
| && | AND curto circuito |
| || | OR curto circuito |
| ! | NOT |

Você que não estudou sobre os operadores lógicos e suas tabelas verdade leia o artigo falando sobre [**clicando aqui**](http://www.universidadejava.com.br/materiais/java-operadores-logicos/)

### Resolva os exercicios da Aula 13

### [Veja a Lista de Exercícios Aqui](https://github.com/lex4brao/01.CURSOS.E.ESTUDOS/blob/main/02.CURSOS.JAVA.-.LOIANE.GRONER/01.JAVA.BASICO.-.LOIANE.GRONER/Lista.de.Exercicios/README.md)

### [Voltar](https://github.com/lex4brao/01.CURSOS.E.ESTUDOS/blob/main/02.CURSOS.JAVA.-.LOIANE.GRONER/01.JAVA.BASICO.-.LOIANE.GRONER/README.md)
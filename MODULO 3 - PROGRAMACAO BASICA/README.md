# MÓDULO 3 - PROGRAMÇÃO BÁSICA
## Aula 10

### O que é uma variável
Imagine que você tem arquivos em um pendrive, ou em uma nuvem, esse arquivo tem um endereço na na memoria por exemplo uma foto está no endereço "c:/meus_arquivos/fotos/eu.jpg" variaveis são referencias para um endereço na memória
Variável é uma referencia para o endereço para guardar valores de uma aplicação, por exemplo nome, idade, ou seja

**Variável é uma área na memória associada a um nome, que pode armazenar valores de um determinado tipo**

### Como declarar uma variável em Java
  - <tipo da variável> <nome da variavel>
  - <tipo da variável> <nome da variavel> = <valor da variável>
    - **o sinal de igual "=" é um operador de atribuição de valor**

### Padrões de nomeclatura de uma variável
#### Não pode
  - Palavras Reservadas (Java tem mais em 70 palavras reservadas)
  - Caracteres especial (&%$#@_)
  - Iniciar com Numeros
  - Começar com uma letra maiuscula

### Tipos Primitivo
  - Inteiro "int"
  - Reais "float
  - Caracteres "char"
  - Logico  "boolean"

### Declarando as Variaveis
Vamos criar uma class para declarar algumas variáveis

```
class DeclarandoVariaveis {
  public static void main(String[] args){
    String nome;
    int idade;

    nome = "Pandora";
    idade = 8;

    System.out.println("Nome: "+nome);
    System.out.println("Idade: "+idade+" anos");
  }
}
```
## Aula 11

### Os tipos primitivos em Java
Básicamente temos 4 tipos primitivos em java que são:
  - Inteiros
  - Ponto flutuante 
  - Caracter 
  - Booleanos
  - Literais

Nos tipos para numeros temos:
  - Inteiro
    - byte
    - short
    - int
    - long
    - char (caracter é considerado como um numero inteiro)
  
  - Ponto flutuante (Reais)
    - float
    - double

### Os inteiros
Veja na tabela abaixo o tamanho de cada tipo inteiro ocupa na memoria e os seus valores:
| Tipo       | Tamanho (bits)    | Valores Suportado        |
| ---------- | ----------------- | ------------------------  |
| byte | 8 | -128 até 127|
| short | 16 | -32,768 até 32,767 |
| int | 32 | -2,147,483,648 até 2,147,483,647 |
| long | 64 | -9,223,372,036,854,775,808 até 9,223,372,036,854,775,807 |

Ou seja, se você declarar uma variável desses tipos ela só receberá valores até o valor suportado

### Pontos Flutuante
Veja na tabela o tamanho de cada tipo:
 Tipo       | Tamanho (bits)    |
| ---------- | ----------------- |
| float | 8 | 
| double | 16 |

Na lingagem Java utilizamos o ponto "." para separar os valores decimais, e a virgula "," para separar os milhares ao contrario do padrão brasileiro
Quando utilizamos o tipo primitivo float é necessario colocar um f após a sua atribuição de valores veja o exemplo junto com o double
```
float saldo1 = 1,300.30f
double saldo2 = 1,300.30
```
isso é um grande motivo que o float é muito pouco usado

Obs: as váriaveis de ponto flutuente tem suporte a notações cientificas como "123e4"

### Caracter "Char"
Uma letra do alfabeto nada mais é que uma letra do alfabeto, a linguagem java suporta os caracter da tabela ASCII e cada caracter na tabela tem um valor por isso o tipo char entra como um tipo inteiro, java também suporta as tabelas unicode no caso do português utilizamos a tabela UTF-8
  #### [Veja a tabela ASCII](https://www.asciitable.com/)
  #### [Veja a tabela UTF-8](https://www.utf8-chartable.de/)

### Boolean 
são variáveis do tipo lógica que recebem valores verdadeiro ou falso

### Hands On
Vamos criar um programa que declarando os tipos de variaveis e fazer um output para mostrar os valores das variaveis

```
public class Tiponumeros {

	public static void main(String[] args) {
		byte valor1 = 127;
		short valor2 = 32767;
		int valor3 = 500000;
		long valor4 = 1000000;
		
		float valor5 = 3.14f;
		double valor6 = 14.8;
		
		System.out.println("Valor 1: "+valor1);
		System.out.println("Valor 2: "+valor2);
		System.out.println("Valor 3: "+valor3);
		System.out.println("Valor 4: "+valor4);
		System.out.println("Valor 5: "+valor5);
		System.out.println("Valor 6: "+valor6);
		
		
	}

}
```

Vamos criar um programa para utilizar os valores da tabela ASCII e colocar o caracter na variável e no output sair o valor da tabela ASCII

```
class TipoCaracter{
  public static void main(String[] args){
    
    char i = 'i';
    char a = 'a';
    char asciiI = 73;
    char asciiA = 65; 
    char utf = 0x21;
    char utf2 = 0b00100001;

    System.out.println(i+a+i);
    System.out.println(""+i+a+i);
    System.out.println(asciiI+asciiA+asciiI);
    System.out.println(""+asciiI+asciiA+asciiI+utf+utf2);

  }
}
```

### Notação Literal
Na linguagem Java, temos algumas notações literal, como por exemplo o sufixo "f" na atribuição de valores de uma variável do tipo float temos outra notações literais como:
 - Sufixo "L" ou "l": Indica que o valor é do tipo long.
 - Sufixo "F" ou "f": Indica que o valor é do tipo float.
 - Sufixo "D" ou "d": Indica que o valor é do tipo double. Como o tipo padrão para valores de ponto flutuante é  o double, não é necessário utilizar esse sufixo para valores do tipo double.
 - Sufixo "B" ou "b": Indica que o valor é do tipo byte. 
 - Sufixo "S" ou "s": Indica que o valor é do tipo short. 

Existem outros tipos de notações literais para conversão de valores de uma base numérica para uma base decima como veja o exemplo de código abaixo:
```
public class Literais {

	public static void main(String[] args) {
		int valor = 28;
		int binario = 0b11100;
		int octal = 034;
		int hexadecimal = 0x1C;
		
		System.out.println("Valor em decimal: "+valor);
		System.out.println("Valor em binário: "+binario);
		System.out.println("Valor em octal: "+octal);
		System.out.println("Valor em hexadecima: "+hexadecimal);

	}

}
```
veja que para converter o valor utilizamos o prefixo "0b" para binário, "0" para octal, "0x" para hexadecimal, para atribuição de valores na váriavel veja que no output sairá todos os valores na base decimal

### Strings
String não é um tipo primitivo em java String é uma classe, nota-se que até na sua declaração o "S" é escrito em maiusculo, acredito eu que é para deixar clara que se trata de uma classe e não um tipo primitivo, porem para facilitar nossa vida em escrever textos vamos a alguns escape na linguagem Java

### Sequencia de Escape
  - \t	tabulação horizontal
  - \n	newline
  - \r	carriage return
  - \"	aspas
  - \'	aspas simples
  - \\	contrabarra

## Aula 12

### Input Lendo dados do teclado
Para ler os dados do teclado temos que usar a classe Scanner que é uma classe da API linguagem Java, no nosso código precisamos instanciar a classe pra gente (Vamos intender isso melhor quando entrar na Orientação a Objetos):
```
  Scanner scan = new Scanner(System.in)
``` 
A API do Java está organizada em várias pastas, por causa dessa organização precisamos de "dizer" que vamos utilizar essa classe e pra isso precisamos "importar essa classe" antes de declarar essa classe e pra isso vamos utilizar o comando 

```
```
### Lendo os tipos especificos
Para ler um tipo especifico dado digitado no teclado conforme o tipo primitivo utilizamos alguns métodos que está presente na classe Scanner que apelidamos de "scan" vamos aos métodos:
```
  Stiing nomeCompleto = scan.nextLine(); /* Lê todos os dados digitado na linha */
  String nome = scan.next(); /* Lê somente uma palavra */
  int idade = scan.nextInt();
  double altura = scan.Double();
```

### Hands On
```
import java.util.Scanner;
public class LeituraTeclado {

	public static void main(String[] args) {
	  
    Scanner scan = new Scanner(System.in);
	  System.out.println("Digite seu nome:");
	  String nomeComp = scan.nextLine();
	  System.out.println("Muito prazer "+nomeComp);
	  
	  System.out.println("Digite seu nome:");
	  String nome = scan.next();
	  
	  System.out.println("Muito prazer "+nome);
	  System.out.println("Qual é sua idade: ");
	  int idade = scan.nextInt();
	  System.out.println("Você tem "+idade+" anos!!");
	  System.out.println("Qual é sua Altura: ");
	  double altura = scan.nextDouble();
	  System.out.println("Você tem "+altura+" metros");
	  
	  System.out.println("Qual seu nome?, Sua idade?, qual sua altura?");
	  nome= scan.next();
	  idade= scan.nextInt();
	  altura= scan.nextDouble();
	  System.out.println("Voce se chama "+nome+" tem "+idade+" anos, e tem "+altura+"m de altura");
  
  }
}
```

## Aula 13

### Os Operadores 
  - Operadores Aritimético
  - Operadores Relacionais
  - Operadores Lógicos
  - Operadores de Assignment
  - Ordem de Precedência

### O que são operadores
Os operadores são símbolos que solicitam ao compilador realizar alguma operação, a soma, subtração, divisão, multiplicação

### Os Operadores Aritiméticos
| Operador | Operação |
| -------- | -------- |
| + | adição (positivo unário) |
| - | subtração (negativo unário) |
| * | multiplicação  |
| / | divisão |
| % | módulo (resto da divisão) |
| ++ | Incremento (pós ou pré fix) |
| -- | Decremento (pós ou pré fix) |

### Operação de incremento e decremento
Quando usamos o "++" irá ser somado +1 no valor, quando usamos "--" irá ser subtraido -1 do valor porém existe uma ordem a ser colocada esse esse operator veja o exemplo: 
```
	int valor = 8;
	System.out.println(valor++);
	valor=8;
	System.out.println(++valor);
```
Quando colocamos o operador depois do valor para imprimir na tela, irá primeiro imprimir o valor depois fazer a operação quando colocamos antes irá primeiro fazer a operação depois imprimir na tela 


### Hands On
```
import java.util.Scanner;
public class OperadoresAritimeticos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor inteiro: ");
		int valor1 = scan.nextInt();
		System.out.println("Digite outro valor inteiro: ");
		int valor2 = scan.nextInt();
		
		int resultado = valor1+valor2;
		System.out.println("O resultado é = "+resultado);
		
		resultado = valor1-valor2;
		System.out.println("O resultado é = "+resultado);

		resultado = valor1*valor2;
		System.out.println("O resultado é = "+resultado);
		
		resultado = valor1/valor2;
		System.out.println("O resultado é = "+resultado);
		
		resultado = valor1%valor2;
		System.out.println("O resultado é = "+resultado);
		
		resultado++;
		System.out.println("O resultado é = "+resultado);
		
		resultado--;
		System.out.println("O resultado é = "+resultado);
		
		int valor = 8;
		System.out.println(valor++);
		valor=8;
		System.out.println(++valor);
  }
}
```
### Funções Matematicas
Java tem uma classe chamata Math em sua biblioteca nativa, que existe diversas metodos(funções) que no ajuda na hora de nos auxiliam muito na hora de operações aritiméticas vamos a tabela:

<table>
  <tr>
    <th>Metodo</th>
    <th>Exemplo</th>
    <th>Comentário</th>
  </tr>
  <tr>
    <td>ceil</td>
    <td>Math.ceil(x)</td>
    <td>Arredonda um número real para cima. Por exemplo, ceil(3.2) é 4.</td>
  </tr>
  <tr>
    <td>cos</td>
    <td>Math.cos(X)</td>
    <td>Calcula o cosseno de X (X deve estar representado em radianos).</td>
  </tr>
  <tr>
    <td>exp</td>
    <td>Math.exp(X)</td>
    <td>Obtém o logaritmo natural e elevado à potência X.</td>
  </tr>
  <tr>
    <td>abs</td>
    <td>Math.abs(X)</td>
    <td>Obtém o valor absoluto de X.</td>
  </tr>
  <tr>
    <td>floor</td>
    <td>Math.floor(X)</td>
    <td>Arredonda um número real para baixo. Por exemplo, floor(3.2) é 3.</td>
  </tr>
  <tr>
    <td>log</td>
    <td>Math.log(X)</td>
    <td>Obtém o logaritmo natural de X.</td>
  </tr>
  <tr>
    <td>log10</td>
    <td>Math.log10(X)</td>
    <td>Obtém o logaritmo de base 10 de X.</td>
  </tr>
  <tr>
    <td>pow</td>
    <td>Math.pow(X,Y)</td>
    <td>Calcula a potência de X elevado a Y.</td>
  </tr>
  <tr>
    <td>sin</td>
    <td>Math.sin(X)</td>
    <td>Calcula o seno de X (X deve estar representado em radianos).</td>
  </tr>
  <tr>
    <td>sqrt</td>
    <td>Math.sqrt(X)</td>
    <td>Calcula a raiz quadrada de X.</td>
  </tr>
  <tr>
    <td>cbrt</td>
    <td>Math.cbrt(X)</td>
    <td>Calcula a raiz cúbica de X.</td>
  </tr>
  <tr>
    <td>tan</td>
    <td>Math.tan(X)</td>
    <td>Calcula a tangente de X (X deve estar representado em radianos).</td>
  </tr>
  <tr>
    <td>PI</td>
    <td>Math.PI</td>
    <td>Retorna o valor de π.</td>
  </tr>
  <tr>
    <td>toDegrees</td>
    <td>Math.toDegrees(X)</td>
    <td>Converte a medida de X de radianos para graus.</td>
  </tr>
  <tr>
    <td>toRadians</td>
    <td>Math.toRadians(X)</td>
    <td>Converte a medida de X de graus para radianos.</td>
  </tr>
  </table>

### Formatação de Casas decimais
No java temos a classe DecimalFormart onde podemos formatar as casas decimal de um numero real("double") veja o exemplo abaixo como proceguir:
```
package Aula13;

import java.text.DecimalFormat; //inclua a classe em seu programa

public class CasasDecimal {

	public static void main(String[] args) {
		double pi = 3.14159265;
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("O valor de PI é "+df.format(pi));
	}

}

```

### Operadores Relacionais
| Operador | Operação |
| -------- | -------- |
| == | igua a |
| != | diferente de |
| > | maior que |
| < | menor que |
| >= | maior ou igual que |
| <= | menor ou igual que |

** O resultado das operações relacionais sem será de um tipo lógico "false" ou "true"

### Hands On
```
import java.util.Scanner;

public class OperadoresRelacionais {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor inteiro: ");
		int valor1 = scan.nextInt();
		System.out.println("Digite outro valor inteiro: ");
		int valor2 = scan.nextInt();
		
		boolean resultado = valor1==valor2;
		System.out.println("O resultado é = "+resultado);
		
		resultado = valor1!=valor2;
		System.out.println("O resultado é = "+resultado);
		
		resultado = valor1>valor2;
		System.out.println("O resultado é = "+resultado);
		
		resultado = valor1<valor2;
		System.out.println("O resultado é = "+resultado);
		
		resultado = valor1>=valor2;
		System.out.println("O resultado é = "+resultado);
		
		resultado = valor1=valor2;
		System.out.println("O resultado é = "+resultado);
		
	}

}
```

### Operadores Lógicos 
| Operador | Operação |
| -------- | -------- |
| & | And |
| | | OR |
| ^ | XOR |
| && | And Curto circuito |
| || | Or Curto circuito |
| ! | Not |

### Tabela da verdade

| a | b | a&b | a\|b | a^b | ! |
| -------- | -------- | -------- | -------- | -------- | -------- |
| Falso | Falso | Falso  | Falso | Falso | Verdadeiro |
| Verdadeiro | Falso | Falso  | Verdadeiro | Verdadeiro | Falso |
| Falso | Verdadeiro | Falso  | Verdadeiro | Verdadeiro | Verdadeiro |
| Verdadeiro | Verdadeiro | Verdadeiro | Verdadeiro | Falso | Falso |

### O que é curto Circuito
A operação com curso circuito, tem mais influencia na execução rapida de nosso programa a linguagem java faz uma verificação com o primeiro valor junto a tabela verdade por exemplo se um valor for falso e a operação é "And" o Java já saberá que o resultado é falso e nem análizará o segundo valor, da mesma forma se a operação for "OR" e o primeiro valor for verdadeiro ela já sabe que seu resultado será verdadeiro e não análizará o segundo valor 
Então no dia a dia sempre utilizamos as operações de curto circuito

### Hands on
```
public class OperadoresLogico {

	public static void main(String[] args) {
		
		boolean valor1 = true;
		boolean valor2 = false;
		
		boolean resultado = valor1&valor2;
		System.out.println(resultado);
		
		resultado = valor1|valor2;
		System.out.println(resultado);

		resultado = valor1^valor2;
		System.out.println(resultado);
	
	
		resultado = valor1&&valor2;
		System.out.println(resultado);
		
		resultado = valor1||valor2;
		System.out.println(resultado);
		
		resultado = !valor1;
		System.out.println(resultado);
		
		
	}

}
```
### Oderm de Precedencia
A Tabela abaixo é uma ordem de precedencia da linguagem java, a linguagem executará as operações em ordem do primeiro ao ultimo, caso uma expressão aritimética tenha soma e multiplicação, a linguagem executará primeiro a multiplicação depois a soma 
<table>
  <tr>
    <th>Ordem</th>
    <th>Operador</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td> 1º </td>
    <td>. [] ()</td>
    <td>Máxima precedência: separador, indexação, parâmetros, conversão de tipo</td>
  </tr>
  <tr>
    <td> 2º </td>
    <td>+ - ~ ! ++ --</td>
    <td>Operador unário: positivo, negativo, negação (inversão bit a bit), não (lógico), incremento, decremento</td>
  </tr>
  <tr>
    <td> 3º </td>
    <td>* / %</td>
    <td>Multiplicação, divisão e módulo (inteiros)</td>
  </tr>
  <tr>
    <td> 4º </td>
    <td>+ -</td>
    <td>Adição, subtração</td>
  </tr>
  <tr>
    <td> 5º </td>
    <td>&lt;&lt; ,   &gt;&gt;, &gt;&gt;&gt;</td>
    <td>Translação (bit a bit) à esquerda, direita sinalizada, e direita não sinalizada (o bit de sinal será 0)</td>
  </tr>
  <tr>
    <td> 6º </td>
    <td>&lt; ,   &lt;=,  &gt;=  &lt;</td>
    <td>Operador relacional: menor, menor ou igual, maior ou igual, maior</td>
  </tr>
  <tr>
    <td> 7º </td>
    <td>== !=</td>
    <td>Igualdade: igual, diferente</td>
  </tr>
  <tr>
    <td> 8º </td>
    <td>&amp;</td>
    <td>Operador lógico <b><tt>e</tt></b> bit a bit</td>
  </tr>
  <tr>
    <td> 9º </td>
    <td>^</td>
    <td>Ou exclusivo (<b><tt>xor</tt></b>) bit a bit</td>
  </tr>
  <tr>
    <td> 10º </td>
    <td>| </td>
    <td>Operador lógico <b><tt>ou</tt></b> bit a bit</td>
  </tr>
  <tr>
    <td> 11º </td>
    <td>&amp;&amp;</td>
    <td>Operador lógico <b>e</b> condicional</td>
  </tr>
  <tr>
    <td> 12º </td>
    <td>||</td>
    <td>Operador lógico <b>ou</b> condicional</td>
  </tr>
  <tr>
    <td> 13º </td>
    <td>?:</td>
    <td>Condicional: <b><tt>if-then-else</tt></b> compacto</td>
  </tr>
  <tr>
    <td> 14º </td>
    <td>= op=</td>
    <td>Atribuição</td>
  </tr>
  </table>
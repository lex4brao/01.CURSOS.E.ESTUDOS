# Curso de Java Básico
### Prof: Loiane Groner

## Aula 1

### A linguagem Java
As principais caracteristicas da linguagem são:
  - Simples
  - Orientada a Objetos
  - Distribuída
  - Multithreades
  - Dinâmica
  - Arquitetura neutra
  - Portável
  - Ótima Performace
  - Robusta
  - Segura

O código java passa por 3 estágios, Codigo Fonte, Código compilado no JavaC (Java Compiler)  que transforma Codigo bytecode que é executado na JVM (Java virtual machina)

### As Aplicações do Java
  - JavaSE
    - Java EE (servidores)
    - Java FX (Desktops)
  - JavaME
    - Embedded, Embarcados
    - Tv, Blu-ray (Ginga TV é em java)
    - Mobile
    - Cartãos
  
Vinicus Senger (Referencias em Embarcados)

### Revista Java (Legado)
  ##### [Java Magazine](https://www.devmedia.com.br/revista-java-magazine/edicoes)
  ##### [easy Java Magazine](https://www.devmedia.com.br/revista-easy-java-magazine)
  ##### [SQL Magazine](https://www.devmedia.com.br/revista-easy-java-magazine)

### Livros
  #### Java Como Programar - Deitel

## Aula 2, 3, 4 

### O Que é necessário para programar
Para aprender a programar em java é necessário ter instalado o JDK (Java Development Kit) eu vou utilizar a versão 17 que é o a ultima versão LTS (Long Term Support) disponivel atualmente 
  ##### [DOWNLOAD AQUI](https://www.oracle.com/java/technologies/downloads/#jdk17-windows)

### Configurando o JDK
Vamos adicionar o JDK na váriaveis de ambiente do windows, nas Variáveis do sistema adicione uma nova variável chamada ```%JAVA_HOME``` como nome da variável, normalmente o JDK fica instalado na pasta "C:\Program Files\Java\jdk-17" e o caminho da pasta será o valor da variável
Adicionando o JDK na variável Path, abra a variável e click em novo, e adiciona o valor ```%JAVA_HOME%\bin```, e pronto agora no cmd vamos verificar se está tudo certo, aperte as teclas ```Win+R``` para abrir o executar, e digite cmd abrindo o CMD use os comandos

```
java --version
```

###### Este será o resultado
```
java 17.0.7 2023-04-18 LTS
Java(TM) SE Runtime Environment (build 17.0.7+8-LTS-224)
Java HotSpot(TM) 64-Bit Server VM (build 17.0.7+8-LTS-224, mixed mode, sharing)
```

###### Logo após use o comando
```
javac --version 
```

###### Este será o resultado
```
javac 17.0.7
```

## Aula 5
### Executando o Codigo fonte
Para escrevermos nosso códio em java, será necessáro de um editor de texto, eu tenho preferencia pelo VS Code, ele está disponivel em: 
  #### [DOWNLOAD AQUI](https://code.visualstudio.com/download)
 
Com o editor instalado, temos que criar uma pasta para salvar nossos códigos fonte. Abrindo o editor de texto criar nosso primeiro código fonte e fazer a compilação e execução no estilo "old school", nosso primeiro código será 

```
public class SalveQuebrada {
  public static void main (String[] args){
    System.out.println("Salve Quebrada!!!") ;
  }
}

```
### O que é Class
A linguagem Java por ser uma linguagem Orientada a Objeto é composta de classes ```class NomeClasse {}``` uma classe é um modelo de objeto, como um um lapis, e um objeto sempre tem suas caractristicas e funções como o lapis, é de madeitra, com grafite, tem a função de desenhar, de escrever, ou seja uma classe pode ter atributos (variáveis), e funções(métodos), As classes define as propriedade e compotamentos de um objeto, auxiliando muito na organização do nosso código e a reutilização delas em varias partes do nosso programa 

**Por padrão na linguagem java os nomes das classes utilizam a convenção CamelCase, ou seja sem espaços caracteres especiais e o inicio de cada palavram em maiusculo**


### Método (Funções)
 ```public static void main(Strin[] arg)``` {}, a parte ```public static``` são os modificadores de acesso a função(metodo) vamos entender melhor isso quando entrar na Orientação a Objeto, basicamente estamos declarando uma função(método) o ```void``` é o tipo de retorno da função(método) no caso "vazia" ou seja, sem retorno, main determina que esta é o método inicial e principal da nossa classe, ```(String[] arg)``` é o parametro da nossa funça(metodo), nesses caso ela irá receber uma coleção de  String(palavras ou cadeia de caracters) como argumentos
 
### System.out.println("");
Esté é um comando de output(saida) na tela ou imprima na tela o mesmo que escreva(" "), o "ln" seria imprima uma linha, e sempre que temos que escrever uma string(cadeia) é necessario escrever entre aspas duplas " "
  
  #### **Java é uma linguagem Case Sensitive, ou seja se escrevermos uma letra maiuscula fora so lugar causa erros em nossos códigos**
    system.out.println está errado, o correto é System.out.println, Main está errado, o correto é main

  #### **Todos os comandos em java termina com ; no final não esqueça pois isso causa erros de compilação nos códigos**

### Salvando o código fonte
Por padrão sempre salvamos nosso código com o nome exatamente igual da classe colocada no código, no caso do código acima seria "SalveQuebrada" e colocamos a extensão .java no caso ficaria "SalveQuebrada.java"

### Compilando o código
Para compilar nosso código é necessário abrirmos o CMD na pasta que está o código e no cmd digitamos o comando 
```
javac SalveQuebrada.java
```
após isso irá ser criado um código bytecode em baixo nivel que é interpretado pela JVM e aparecerá um arquivo na pasta chamado SalveQuebrada.class

### Executando nosso Código
Para executar nosso código após compilado temos que voltar no CMD ainda na pasta que está o arquivo .class e digitar o comando:
```
java Salvequebrada
```

**Não digite a extensão do arquivo que pode causar erros é sem qualquer extensão**

## Aula 6

### Passando arqumentos para um programa
Quando passamos os parametros para a função do nosso Salve Quebrada colocamos (String[] args) args são os argumentos... então vamos fazer uma função que receba os argumentos ou seja uma palavra ou frase digitada entre aspas duplas em relação a ao código da aula passada vamos mudar apenas o comando de output para:

```
System.out.println("Voce digitou: "+args[0]);
```
### Execuanto com argumentos
ao executar nosso novo código iremos, precisar digitar nosso argumento após o nome do arquivo.class ou seja

```
java Argumentos Lex4brao
```
e o resultado será
```Voce digitou: Lex4brao```

### Exercicio 01
Escreva um código que receba um argumento depois de um Salve Quebrada, compile e execute seu código

## Aula 07
Analizando possiveis erros como falta de ponto e virgula ";", falta de aspas, escrever comandos Com maiusculos sem ser exatamente assim olhando o Case Sensitive

## Aula 08

### Instalando a IDE
Instalando a IDE, para programar em java vamos utilizar o Eclipce 

#### [Download Aqui](https://www.eclipse.org/downloads/) 

### Configurando o Eclipse
No Eclipse temos que selecionar uma pasta para que seja nossa workspace, crie uma pasta a seu gosto para ser sua "área de trabalho", logo após temos que mudar o layout do Eclipse para programação na linguagem Java pra isso vamos em:
  Window -> Perspective -> Open Perspective -> Java

Veja que irá mudar o layout da IDE, como o próprio Eclipse denomina a perspectiva caso você dejese voltar a perspectiva original é só ir em:
  Window -> Perspective -> Reset Perspective

Outra coisa bem necessária no Eclipse é termos a aba da linha de comando para execução dos nossos códigos, pra isso vamos em:
  Window -> Show View -> Console

Agora é só criar nosso primeiro projeto em java indo em:
  File -> New -> Java Project

Eu chamei meu projeto de "Aulas", se você for na sua pasta que é sua workspace verá que dentro dela tem uma pasta com o nome do seu projeto e dentro desta pasta terá outra pasta chamada src(source) é nessa pasta que ficarão nossos códigos fontes.
Voltando para o eclipse vá no Package Explorer expanda nosso projeto click com o botão direito vá em:
  New -> Package

Eu particularmente crio um pacote para cada aula, e crirei um projeto para os Exercicios

## Aula 09

### Paradigma Estruturado Vs Orientação a Objeto

### Vantagens da Orientação a Objetos
  - Reuso de Código
  - Reflete o mundo real
  - Facilita Manutenção no Códgio

### Conceitos
  - Classes
  - Objetos
  - Heranças
  - Polimorfismo

### Classes
Descrição de um grupo de objetos, na programação um cachorro pode ser um objeto, então podemos ter uma classe chamada cachorro então temos
  - Nome da Classe (Dog)
  - Conjunto de Atributos (descrição do Dog)
  - Conjunto de métodos (comportamento do Dog)

Caracteristica de um cachorro, raça, altura, peso, temperamento, nivel de inteligencia, isso são caracteristicas de um cachorro isso seria os atributos de uma classe 

### Objeto
Quando vamos contruir uma casa é sabemos que a casa terá 3 quartos, sala, cozinha, etc...
Apartir do momento que a casa foi construida se torna "Casa da Maria" apartir do momento que a casa ganha "vida" se torna um objeto na programação

### Método
Metodos são comportamentos de ação como o cachorro pode latir, brincar, correr, lamber, ou seja metodos são comportamentos que define uma classe

### Herança
A herança permite a reutilização da estrutura e o comportamento de uma classe, se pegarmos um canino e um felino ambos tem pelo, ambos são animais, ambos são mamifero, a idéia de herança é que ambos tem caracteristicas 

### Polimorfismo
O polimorfismo é um conceito parecido com as heranças, porem são comportamentos incomum em objetos, como o canino e felino, ambos comem, ambos emitem som

### Pacotes
é uma forma de organizarmos nossa classe um exemplo as operações matemática soma, subtração, divisão, multiplicação, cada operação é uma classe a organização das operações se torna um pacote de operações matemáticas

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


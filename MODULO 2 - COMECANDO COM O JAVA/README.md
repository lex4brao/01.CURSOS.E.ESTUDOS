# MÓDULO 2 - COMEÇANDO COM O JAVA

## Aula 5
### Executando o Código fonte
Para escrevermos nosso código em java, será necessário de um editor de texto, eu tenho preferência pelo VS Code, ele está disponível em: 
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
A linguagem Java por ser uma linguagem Orientada a Objeto é composta de classes ```class NomeClasse {}``` uma classe é um modelo de objeto, como um lápis, e um objeto sempre tem suas características e funções como o lápis, é de madeira, com grafite, tem a função de desenhar, de escrever, ou seja uma classe pode ter atributos (variáveis), e funções(métodos), As classes define as propriedade e comportamentos de um objeto, auxiliando muito na organização do nosso código e a reutilização delas em várias partes do nosso programa 

**Por padrão na linguagem java os nomes das classes utilizam a convenção CamelCase, ou seja, sem espaços caracteres especiais e o início de cada palavram em maiúsculo**


### Método (Funções)
 ```public static void main(String[] args)``` {}, a parte ```public static``` são os modificadores de acesso a função(método) vamos entender melhor isso quando entrar na Orientação a Objeto, basicamente estamos declarando uma função(método) o ```void``` é o tipo de retorno da função(método) no caso "vazia" ou seja, sem retorno, main determina que esta é o método inicial e principal da nossa classe, ```(String[] arg)``` é o parâmetro da nossa função(método), nesses caso ela irá receber uma coleção de  String(palavras ou cadeia de caracteres) como argumentos
 
### System.out.println("");
Este é um comando de output(saída) na tela ou imprima na tela o mesmo que escreva(" "), o "ln" seria imprima uma linha, e sempre que temos que escrever uma string(cadeia) é necessário escrever entre aspas duplas " "
  
  #### **Java é uma linguagem Case Sensitive, ou seja, se escrevermos uma letra maiúscula fora do lugar, pode causar erros em nossos códigos**
    system.out.println está errado, o correto é System.out.println, Main está errado, o correto é main

  #### **Todos os comandos em java termina com ; no final não esqueça pois isso causa erros de compilação nos códigos**

### Salvando o código fonte
Por padrão sempre salvamos nosso código com o nome exatamente igual da classe colocada no código, no caso do código acima seria "SalveQuebrada" e colocamos a extensão .java no caso ficaria "SalveQuebrada.java"

### Compilando o código
Para compilar nosso código é necessário abrirmos o CMD na pasta que está o código e no cmd digitamos o comando 
```
javac SalveQuebrada.java
```
após isso irá ser criado um código bytecode em baixo nível que é interpretado pela JVM e aparecerá um arquivo na pasta chamado SalveQuebrada.class

### Executando nosso Código
Para executar nosso código após compilado temos que voltar no CMD ainda na pasta que está o arquivo .class e digitar o comando:
```
java Salvequebrada
```

**Não digite a extensão do arquivo que pode causar erros é sem qualquer extensão**

## Aula 6

### Passando argumentos para um programa
Quando passamos os parâmetros para a função do nosso Salve Quebrada colocamos (String[] args) args são os argumentos... então vamos fazer uma função que receba os argumentos ou seja uma palavra ou frase digitada entre aspas duplas em relação a ao código da aula passada vamos mudar apenas o comando de output para:

```
System.out.println("Você digitou: "+args[0]);
```
### Executando com argumentos
ao executar nosso novo código iremos precisar digitar nosso argumento após o nome do arquivo.class ou seja

```
java Argumentos Lex4brao
```
e o resultado será
```Você digitou: Lex4brao```

### Exercício 01
Escreva um código que receba um argumento depois de um Salve Quebrada, compile e execute seu código

## Aula 07
Analisando possíveis erros como falta de ponto e vírgula ";", falta de aspas, escrever comandos com maiúsculos sem ser exatamente assim olhando o Case Sensitive

## Aula 08

### Instalando a IDE
Instalando a IDE, para programar em java vamos utilizar o Eclipse 

#### [Download Aqui](https://www.eclipse.org/downloads/) 

### Configurando o Eclipse
No Eclipse temos que selecionar uma pasta para que seja nossa workspace, crie uma pasta a seu gosto para ser sua "área de trabalho", logo após temos que mudar o layout do Eclipse para programação na linguagem Java pra isso vamos em:
  Window -> Perspective -> Open Perspective -> Java

Veja que irá mudar o layout da IDE, como o próprio Eclipse denomina a perspectiva caso você deseje voltar a perspectiva original é só ir em:
  Window -> Perspective -> Reset Perspective

Outra coisa bem necessária no Eclipse é termos a aba da linha de comando para execução dos nossos códigos, pra isso vamos em:
  Window -> Show View -> Console

Agora é só criar nosso primeiro projeto em java indo em:
  File -> New -> Java Project

Eu chamei meu projeto de "Aulas", se você for na sua pasta que é sua workspace verá que dentro dela tem uma pasta com o nome do seu projeto e dentro desta pasta terá outra pasta chamada src(source) é nessa pasta que ficarão nossos códigos fontes.
Voltando para o eclipse vá no Package Explorer expanda nosso projeto click com o botão direito vá em:
  New -> Package

Eu particularmente crio um pacote para cada aula, e criei um projeto para os Exercícios

## Aula 09

### Paradigma Estruturado Vs Orientação a Objeto

### Vantagens da Orientação a Objetos
  - Reuso de Código
  - Reflete o mundo real
  - Facilita Manutenção no Código

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

Característica de um cachorro, raça, altura, peso, temperamento, nível de inteligência, isso são características de um cachorro isso seria os atributos de uma classe 

### Objeto
Quando vamos construir uma casa é sabemos que a casa terá 3 quartos, sala, cozinha, etc...
A partir do momento que a casa foi construída se torna "Casa da Maria" a partir do momento que a casa ganha "vida" se torna um objeto na programação

### Método
Métodos são comportamentos de ação como o cachorro pode latir, brincar, correr, lamber, ou seja, métodos são comportamentos que define uma classe

### Herança
A herança permite a reutilização da estrutura e o comportamento de uma classe, se pegarmos um canino e um felino ambos têm pelo, ambos são animais, ambos são mamíferos, a ideia de herança é que ambos têm características 

### Polimorfismo
O polimorfismo é um conceito parecido com as heranças, porem são comportamentos incomum em objetos, como o canino e felino, ambos comem, ambos emitem som

### Pacotes
é uma forma de organizarmos nossa classe um exemplo as operações matemáticas soma, subtração, divisão, multiplicação, cada operação é uma classe a organização das operações se torna um pacote de operações matemáticas


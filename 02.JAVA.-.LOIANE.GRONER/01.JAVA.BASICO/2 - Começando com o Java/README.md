## Aula 05 - Primeiro Programa em Java

1. Abra um editor de texto de sua preferencia, vamos criar nosso primeiro programa em java, digite o comando

```java
public class HelloWorld{

}
```

este comando determina o nome do nosso programa

2. Agora vamos declarar a função principal do nosso programa com o comando

```java
  public static void main (String[] args){

  }
```
esta é a função principal ou método do nosso programa

3. Logo após vamos digitar o comando para o java escrever na tela Hello World

```java
  System.out.println("Hello World");
```

Agora vamos revisar todo o código:

```java
public class HelloWorld{
  public static void main (String[] args){
    System.out.println("Hello World");
  }
}
```

4. Agora salve este arquivo de texto com a extensão .java, Abra o prompt de comando na pasta que está o arquivo
   *Obs. Convensões java os nomes das Classes sempre começam com letras maiúsculas e siga o padrão "CamelCase" e o nome do arquivo sempre terá que ser o mesmo da classe*
5.  Abra o prompt de comando na pasta que está o arquivo e digite o comando

```
javac HelloWorld.java
```

6. Note que um arquivo do mesmo nome foi criado na pasta porem com a extensão .class, agora volte ao prompt de comandos e digite o comando 

```
java HelloWorld
```

Este foi o nosso primeiro programa em java

### Entendendo nosso Código
Class como foi dito é o nome do nosso programa, O Java por ser uma linguagem Orientada a Objetos a Class é um objeto no java quando digitamos o comando public class estamos declarando a classe e logo após o nome da classe

No Java cada Classe tem um método ou seja uma função quando digitamos "public static" é os modificadores de acesso do método "void" é o tipo de retorno do nosso método que nesse caso é vazio, main é o nome do nosso método nesse caso é o método principal da classe "main", o comando (String[] args) são os parâmetros ou argumentos do método

Cada parte do código chamamos de bloco e utilizamos as chaves {} para iniciar e terminar um bloco de comandos, 

# [Voltar](https://github.com/lex4brao/01.CURSOS.E.ESTUDOS/tree/main/02.JAVA.-.LOIANE.GRONER/01.JAVA.BASICO)

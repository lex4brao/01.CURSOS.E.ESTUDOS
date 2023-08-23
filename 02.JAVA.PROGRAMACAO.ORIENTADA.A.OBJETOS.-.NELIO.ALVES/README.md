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

[Diretório da Aula](https://github.com/lex4brao/01.CURSOS.E.ESTUDOS/tree/main/02.JAVA.PROGRAMACAO.ORIENTADA.A.OBJETOS.-.NELIO.ALVES/aula68)

### Aula 70. Membros estáticos - Parte 1

### Aula 71. Membros estáticos - Parte 2

A O método main por padrão sempre será statico, uma metodo estático e mebros estáticos não tem a necessidade de instanciar a classe no Método "MAIN", Já os métodos e membros não estáticos tem a necessidade de se instanciar a classe

[Diretório da Aula](https://github.com/lex4brao/01.CURSOS.E.ESTUDOS/tree/main/02.JAVA.PROGRAMACAO.ORIENTADA.A.OBJETOS.-.NELIO.ALVES/aula71)

## Seção 9: Construtores, palavra this, sobrecarga, encapsulamento

### Aula 75. Construtores

É uma operação especial da classe, que executa no momento da instanciação do objeto Usos comuns:
    - Iniciar valores dos atributos
    - Permitir ou obrigar que o objeto receba dados / dependências no momento de sua instanciação (injeção de dependência)
Se um construtor customizado não for especificado, a classe disponibiliza o construtor padrão:
Product p = new Product();
É possível especificar mais de um construtor na mesma classe (sobrecarga)

Sintaxe de um Construtor:
Um construtor tem o mesmo nome da classe e não possui tipo de retorno, nem mesmo void. Ele pode aceitar argumentos, que são usados para inicializar os atributos da classe. Aqui está a sintaxe básica:

```java
public class Produtos {
    // Atributos

    // Construtor
    public Produtos(TipoParametro parametro1, TipoParametro parametro2) {
        // Inicialização de atributos usando os parâmetros
    }

    // Outros métodos
}

```
Exemplo 2
```java
class Carro {
    String marca;
    String modelo;
    int ano;

    // Construtor
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    void ligar() {
        System.out.println("O carro está ligado.");
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        // Criando objetos usando o construtor
        Carro carro1 = new Carro("Toyota", "Corolla", 2020);
        Carro carro2 = new Carro("Honda", "Civic", 2019);

        // Chamando o método ligar()
        carro1.ligar();
        carro2.ligar();
    }
}

```

### Aula 76. Palavra this

É uma referência para o próprio objeto
    - Usos comuns:
        - Diferenciar atributos de variáveis locais
        - Passar o próprio objeto como argumento na chamada de um método ou construtor

A palavra-chave "this" é uma referência para o próprio objeto no qual um determinado código está sendo executado. Ela é usada para acessar os atributos e métodos da instância atual da classe. O uso mais comum do "this" é para resolver ambiguidades entre nomes de variáveis quando há uma variável local (dentro de um método) com o mesmo nome de um atributo da classe.

```java
class Pessoa {
    String nome;

    Pessoa(String nome) {
        this.nome = nome; // Atribui o parâmetro nome ao atributo nome da instância
    }

    void saudacao() {
        System.out.println("Olá, meu nome é " + this.nome);
    }
}

```

### Aula 77. Sobrecarga (overloading)

É um recurso que uma classe possui de oferecer mais de uma operação com o mesmo nome, porém com diferentes listas de parâmetros
A sobrecarga permite que você crie métodos com o mesmo nome, mas com diferentes conjuntos de parâmetros. Isso é útil quando você deseja fornecer funcionalidades semelhantes, mas com diferentes tipos de entrada.

Características da Sobrecarga:

1. Mesmo nome de método: Os métodos sobrecarregados têm o mesmo nome.
2. Assinaturas diferentes: As assinaturas dos métodos devem ser diferentes, o que significa que eles devem ter uma quantidade diferente ou tipos diferentes de parâmetros.
3. Tipo de retorno: A sobrecarga não é determinada apenas pelo tipo de retorno. Dois métodos não podem ser sobrecarregados apenas diferindo no tipo de retorno.

### Aula 78. Encapsulamento

O encapsulamento é um dos princípios fundamentais da programação orientada a objetos (POO) e é implementado na linguagem Java (e em muitas outras linguagens orientadas a objetos) para controlar o acesso aos atributos e métodos de uma classe. O encapsulamento ajuda a proteger os dados e o funcionamento interno de uma classe, fornecendo uma interface controlada através da qual os objetos interagem com ela.

O encapsulamento é alcançado através do uso de modificadores de acesso (como private, public, protected) e pela definição de métodos de acesso (getters) e métodos de modificação (setters) para os atributos privados da classe.

Benefícios do Encapsulamento:

1. Controle de Acesso: O encapsulamento permite que você controle quais partes do código podem acessar e modificar os atributos e métodos de uma classe. Isso ajuda a evitar alterações não autorizadas e a manter a consistência dos dados.
2. Modificação Segura: Ao encapsular os atributos com métodos de modificação (setters), você pode implementar validações e lógica para garantir que os dados sejam alterados de forma segura e coerente.
3. Ocultação de Detalhes: Encapsular os detalhes internos de uma classe ajuda a ocultar sua complexidade e proporciona uma interface mais simples para os usuários da classe.
4. Flexibilidade: Com o encapsulamento, você pode modificar a implementação interna de uma classe sem afetar o código que a utiliza, desde que a interface pública permaneça a mesma.

[Diretório da Aula](https://github.com/lex4brao/01.CURSOS.E.ESTUDOS/tree/main/02.JAVA.PROGRAMACAO.ORIENTADA.A.OBJETOS.-.NELIO.ALVES/aula78)

### Aula 79. Gerando automaticamente construtores, getters e setters com Eclipse

Referência: [https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html)

- private: o membro só pode ser acessado na própria classe
- (nada): o membro só pode ser acessado nas classes do mesmo pacote
- protected: o membro só pode ser acessado no mesmo pacote, bem como em subclasses de pacotes diferentes
- public: o membro é acessado por todas classes (ao menos que ele resida em um módulo diferente que não exporte o pacote onde ele está)

## Seção 10: Comportamento de memória, arrays, listas

### Aula 86. Tipos referência vs. tipos valor

### Aula 87. Desalocação de memória - garbage collector e escopo local

É um processo que automatiza o gerenciamento de memória de umprograma em execução
O garbage collector monitora os objetos alocados dinamicamente pelo programa (no heap), desalocando aqueles que não estão mais sendo utilizados

- Objetos alocados dinamicamente, quando não possuem mais referência para eles, serão desalocados pelo garbage collector
- Variáveis locais são desalocadas imediatamente assim que seu escopo local sai de execução

### Aula 88. Vetores - Parte 1

```java
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=0;
        double soma=0, media;

        System.out.print("Quantas pessoas deseja cadastrar: ");
        n = sc.nextInt();

        double[] vet = new double[n];

        for (int i=0; i<vet.length; i++){
            System.out.print("["+(i+1)+"]: ");
            vet[i] = sc.nextDouble();
            soma += vet[i];
        }
        media = soma/vet.length;
        System.out.println("A média das idades é "+ media);
    }
}

```

### Aula 89. Vetores - Parte 2

[Diretório da Aula](https://github.com/lex4brao/01.CURSOS.E.ESTUDOS/tree/main/02.JAVA.PROGRAMACAO.ORIENTADA.A.OBJETOS.-.NELIO.ALVES/aula89)

### Aula 90. Exercícios de fixação sobre vetores

### Aula 91. Correção do exercício negativos

### Aula 92. Correção do exercício alturas

### Aula 93. Desafio sobre vetores (pensionato)

### Aula 94. Correção do desafio sobre vetores (pensionato)

### Aula 

## [VOLTAR](https://github.com/lex4brao/01.CURSOS.E.ESTUDOS/blob/main/README.md)

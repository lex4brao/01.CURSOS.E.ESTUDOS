# Anotações sobre o aprendizado em java

## Operador ternário
Operador ternário tem a mesma função da operação condicional, porem permide tomar uma decisão de uma forma simples e concisa, veja o exemplo

```java
public class Teste {
    public static void main(String[] args) {
        int x=5;
        String resp;
        resp = (x%2==0)?"par":"impar";
        System.out.println(resp);
    }
}
```

  - (x%2==0) : Condição
  - "par" : se (if)
  - "impar": senão (else)

## Formatção de numeros reais

### Formatação por concatenação

```java
System.out.printf("%.2f", variavel)
```

Esta formatação funciona somente no comando "printf", onde .2 é o numero de casas decimais e f é a identicação para ponto flutuante, temos também:

  - %f = ponto flutuante
  - %d = inteiro
  - %s = texto
  - %n = quebra de linha

### Formatação pela classa DecimalFormat

```java
import java.text.DecimalFormat;
public class Ex04 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        double numb= 21.45445;
        System.out.println(df.format(numb));
    }
}
```
Para essa formatação importamos a classe DecimalFormat da API do Java declaramos o padrão para formatação dos numeros através do ```DecimalFormat df = new DecimalFormat("#.##");``` e para saida de dados utilizamos o ```df.format(variavel)```

## Métodos das classe String 

  - **equalsIgnoreCase**: Compara a String ignorando maiusculos e minusculos
  - **length()**: Retorna o comprimento da string.
  - **charAt(int index)**: Retorna o caractere na posição especificada.
  - **substring(int beginIndex)**: Retorna uma subtring a partir da posição especificada.
  - **substring(int beginIndex, int endIndex)**: Retorna uma substring entre as posições especificadas.
  - **indexOf(String str)**: Retorna o índice da primeira ocorrência da substring especificada.
  - **toLowerCase()**: Retorna uma nova string com todos os caracteres em minúsculas.
  - **toUpperCase()**: Retorna uma nova string com todos os caracteres em maiúsculas.

## Métodos da classe Math

  - **abs**: Retorna o valor absoluto de um número.
  - **acos**: Retorna o arco cosseno de um número.
  - **asin**: Retorna o arco seno de um número.
  - **atan**: Retorna o arco tangente de um número.
  - **atan2**: Retorna o arco tangente de dois números.
  - **cbrt**: Retorna a raiz cúbica de um número.
  - **ceil**: Arredonda um número para cima.
  - **copySign**: Retorna o valor do primeiro argumento com o sinal do segundo argumento.
  - **cos**: Retorna o cosseno de um número.
  - **cosh**: Retorna o cosseno hiperbólico de um número.
  - **exp**: Retorna o valor da exponencial (elevado ao poder).
  - **expm1**: Retorna exp(x) - 1.
  - **floor**: Arredonda um número para baixo.
  - **getExponent**: Retorna o expoente do valor de ponto flutuante.
  - **hypot**: Retorna a raiz quadrada da soma dos quadrados de dois argumentos.
  - **IEEEremainder**: Retorna o restante da divisão de dois números no estilo IEEE 754.
  - **log**: Retorna o logaritmo natural (base e) de um número.
  - **log10**: Retorna o logaritmo na base 10 de um número.
  - **log1p**: Retorna log(x + 1).
  - **max**: Retorna o maior de dois valores.
  - **min**: Retorna o menor de dois valores.
  - **nextAfter**: Retorna o número representável mais próximo ao valor especificado na direção do segundo argumento.
  - **nextDown**: Retorna o número representável mais próximo do valor especificado na direção do valor negativo infinitesimal.
  - **nextUp**: Retorna o número representável mais próximo do valor especificado na direção do valor positivo infinitesimal.
  - **pow**: Eleva um número a uma potência.
  - **random**: Retorna um número decimal aleatório entre 0 (inclusive) e 1 (exclusive).
  - **rint**: Retorna o número mais próximo inteiro, arredondado conforme a regra "mais próximo e par".
  - **round**: Arredonda um número para o inteiro mais próximo.
  - **scalb**: Retorna o resultado de multiplicar o número por 2 elevado à potência do segundo argumento.
  - **signum**: Retorna o sinal de um número (-1, 0 ou 1).
  - **sin**: Retorna o seno de um número.
  - **sinh**: Retorna o seno hiperbólico de um número.
  - **sqrt**: Retorna a raiz quadrada de um número.
  - **tan**: Retorna a tangente de um número.
  - **tanh**: Retorna a tangente hiperbólica de um número.
  - **toDegrees**: Converte um ângulo em radianos para graus.
  - **toRadians**: Converte um ângulo em graus para radianos.

## Sortear um valor

Para sortear um valor utilizamos a classe **java.util.Random**, veja o exemplo abaixo

```java
import java.util.Random;
public class Teste {
    public static void main(String[] args) {
        Random random = new Random();
        int sorteio = random.nextInt(100);
        System.out.println("O numero sorteado é: "+sorteio);
    }
}
```
No exemplo à cima a classe Random irá sortear um numero de 0 a 99

### Sorteando valores com a classe Math
```java
public class Teste {
    public static void main(String[] args) {
        double x;
        x = Math.random();
        System.out.printf("%.2f\n",x);
        long x1;
        x1 = Math.round(Math.random()*10);
        System.out.println(x1);
        x1 = Math.round(Math.random()*100);
        System.out.println(x1);
        x1 = Math.round(Math.random()*1000);
        System.out.println(x1);
        x1 = Math.round(Math.random()*10000);
        System.out.println(x1);
    }
}
```
Em resumo, se você precisa de valores decimais, Math.random() é a escolha. Se você precisa de números inteiros em um intervalo específico, random.nextInt() é a melhor opção.

## Casting
Cast refere-se à conversão explícita de um valor de um tipo de dado para outro tipo compatível. Isso é útil quando você deseja converter um valor de um tipo para outro, como de um tipo numérico para outro tipo numérico ou de um tipo mais genérico para um tipo mais específico.

**Casting Implícito:** Isso acontece quando você converte um tipo de dado de tamanho menor para um tipo de dado de tamanho maior. Java realiza esse tipo de casting automaticamente e não há perda de dados envolvida. Por exemplo:

```java
int intValue = 10;
long longValue = intValue; // Conversão implícita de int para long
```

**Casting Explícito:** Isso ocorre quando você converte um tipo de dado de tamanho maior para um tipo de dado de tamanho menor ou quando há uma perda potencial de dados. Nesse caso, você precisa fazer o casting explicitamente usando parênteses e especificando o tipo desejado. No entanto, esteja ciente de que pode haver perda de dados se o valor não couber no novo tipo. Exemplo:

```java
double doubleValue = 3.14;
int intValue = (int) doubleValue; // Conversão explícita de double para int
```

Lembre-se de que, ao fazer casting explícito, você deve estar ciente de possíveis perdas de dados ou comportamentos inesperados. Certifique-se de entender bem os tipos de dados envolvidos e os possíveis impactos antes de realizar um casting explícito.

## Resolvendo o problema da quebra de linha que fica no buffer do teclado
Normalmente aprendemos utilizar o seguinte forma: 

```java
import java.util.Scanner;

public class ExemploLeituraInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n = sc.nextInt;
        sc.nextLine;

        System.out.println("Número inteiro digitado: " + n);

        scanner.close();
    }
}

```

Porem com a wrapper class é possivel da seguinte forma: 

```java
import java.util.Scanner;

public class ExemploLeituraInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n = Integer.parseInt(sc.nextLine);
        sc.nextLine;

        System.out.println("Número inteiro digitado: " + n);

        scanner.close();
    }
}

```
O método da classe Integer converte a "String" digitada em um valor do tipo primitivo inteiro

### Atribuindo valor a uma variável utilizando com o switch

```java
int result = switch (operator) {
    case "+" -> a + b;
    case "-" -> a - b;
    default -> {
        // Caso nenhum dos operadores seja correspondente, retorne um valor padrão
        System.out.println("Operador não reconhecido: " + operator);
        return 0; // Valor padrão
    }
};

```
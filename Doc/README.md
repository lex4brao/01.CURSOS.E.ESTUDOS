# Minha Documentação
Este arquvido é para anotação de comandos classes, métodos, e procedimentos da linguagem Java para relembrar e servir de cola na hora do sufoco

### Class String
**charAt(int index)**: retorna o caractere no índice especificado.
**length()**: retorna o comprimento da string.
**substring(int beginIndex)**: retorna uma substring a partir do índice especificado.
**substring(int beginIndex, int endIndex)**: retorna uma substring entre os índices especificados.
**toUpperCase()**: retorna uma string com todos os caracteres em maiúsculas.
**toLowerCase()**: retorna uma string com todos os caracteres em minúsculas.
**trim()**: retorna uma string sem espaços em branco no início ou no final.
**equals(Object obj)**: verifica se a string é igual ao objeto especificado.
**equalsIgnoreCase(String str)**: verifica se a string é igual a outra string, ignorando maiúsculas e minúsculas.

### Class Scanner
  **next()**: lê a próxima string do input do scanner.
  **nextInt()**: lê o próximo inteiro do input do scanner.
  **nextDouble()**: lê o próximo valor double do input do scanner.
  **nextLine()**: lê a próxima linha do input do scanner.
  **hasNext()**: retorna verdadeiro se o scanner tiver mais tokens no input.
  **hasNextInt()**: retorna verdadeiro se o próximo token no input for um inteiro.
  **hasNextDouble()**: retorna verdadeiro se o próximo token no input for um valor double.

  **Scanner(System.in)**: lê entradas do teclado do usuário.
  **Scanner(File file)**: lê entradas de um arquivo.
  **Scanner(String source)**: lê entradas de uma string.
  **Scanner(InputStream source)**: lê entradas de um stream de bytes.

### Formatação de Numeros
DecimalFormt, para usar a classe DecimalFormat é necessário incluir o java.txt, Exemplo:
```
import java.text.DecimalFormat;

public class ExemploDecimalFormat {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        double numero = 1234.5678;
        String numeroFormatado = df.format(numero);
        System.out.println(numeroFormatado); // imprime "1.234,57"
    }
}

```
### Gerando Numeros Aleatórios
Random, é uma classe pra essa clase é necessário incluir o java.util o mesmo do Scanner veja o Exemplo
```
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Random rnd = new Random();
    int valorAleatorio = rnd.nextInt(100);
    System.out.println("Valor aleatório: " + valorAleatorio);
  }
}

```
quando colocamos random.nextInt(100) a classe tem um intervalo de 100 numeros para gerar, porem esse intervalo vai de 0 até 99, existe a possibilidade de se colocar maiores intervalos 1000 10000

### Outro modo de gerar nnumero Randomicos
podemos gerar numeros randomicos, através da classe Math da linguagem java, como o método Math.Random, porem o método retorna um numero real entre 0 e 1 ou seja de ponto flutuante, pra isso colocamos o ```(int)``` antes do méodo e multiplicamos para por 100 para ir de 0 até 99 ou 1000 para ir de 0 até 9999, veja o exemplo abaixo
```
  i = (int) (Math.random()*10); //é importante ambos estarem dentro dos parentes
  System.out.println(i+"");

``` 
Podemos tambem usar o método arredondar da classe Math para ter resultados melhores veja o exemplo
``` 
  vetorA[i]=(int)Math.round(Math.random()*100);
  System.out.println(vetorA[i]+"");
``` 

### Operadores Ternários
# MÓDULO 4 - ESTRUTURAS DE CONTROLE DECISÕES E LOOPS

## Aula 14

### Estrutura de Decisão
Na linguagem java temos o comando IF("SE") e o comando ELSE("SENÃO"), te amos eles juntos ELSE IF("SENÃO SE)

### O comando IF (Se)
O IF é uma condicional, ou seja se a condição proposta ao comando if for "verdadeira" o programa irá executar um bloco de comandos, se a condição for "falsa" o bloco não será executado vamos ao exemplo: 

```
package Aula14;
import java.util.Scanner;

class IfElse {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Qual sua idade?: ");
    int idade = scan.nextInt();

    if (idade>=18){
      System.out.println("Você é maior de idade");
    }
  }
}
```

### O Comando ELSE (Senão)
O ELSE também é uma condicional, porém o comando else só será execudado quando a condicional do comando if for falsa e os comandos dentro do  se bloco também 

```
package Aula14;
import java.util.Scanner;

class IfElse {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Qual sua idade?: ");
    int idade = scan.nextInt();

    if (idade>=18){
      System.out.println("Você é maior de idade");
    } else {
      System.out.println("Você é menor de idade");
    }
  }
}
```

### Else If
Na estrutura condicional if e else pose ser pode conter uma tercira condicional, no portugues falamos senão se que podemos utilizar o else if veja o exemplo abaixo:

```
package Aula14;
import java.util.Scanner;

class IfElse2 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Digite o valor do produto R$:");
    double valor = scan.nextDouble();

    if((valor<=10)&&(valo<15)){
      System.out.println("O produto está barato");
    } else if ((valor>=15)&&(valor<17)){
      System.out.println("Pedir desconto");
    } else if ((valor<=17)&&(valor<20)){
      System.out.println("Pesquisar melhor preço");
    } else {
      System.out.println("Produto muito caro");
    }

  }
}
```

## Aula 15

### O comando Switch - Case (Escolha Caso)
O comando Switch - Case pode ser uma alternativa quando temos muitos if e else aninhados, onde o código fica um pouco confuso e nada bonito vamos ao exemplo

```
package Aula14;
import java.util.Scanner;

class SwitchCase {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Digite um numero do dia da semana(1-7:  ");
    int dia = scan.nextInt();

    if (dia==1){;
      System.out.println("Domigo");
    } else if (dia==2){;
      System.out.println("Segunda - Feira");
    } else if (dia==3){;
      System.out.println("Terça - Feira");
    } else if (dia==4){;
      System.out.println("Quarta - Feira");
    } else if (dia==5){;
      System.out.println("Quinta - Feira");
    } else if (dia==6){;
      System.out.println("Sexta - Feira");
    } else if (dia==7){;
      System.out.print("Sabado");
    } else {;
      System.out.println("Não é um dia da semana valido");
    } 
    /* usando a estrutura switch - case */
    switch(dia){
      case 1: System.out.println("Domingo"); break;
      case 2: System.out.println("Segunda"); break;
      case 3: System.out.println("Terça"); break;
      case 4: System.out.println("Quarta"); break;
      case 5: System.out.println("Quinta"); break;
      case 6: System.out.println("Sexta"); break;
      case 7: System.out.println("Sabado"); break;
      default: System.out.println("Não é um dia da semana");
    }

  }
}
```
### Comando BREAK
noste que após cada comando de caso utilizamos o comando break esse comando é como um pare ou breque, se não colocado o comando  switch executará  todos os outros casos apartir do caso q ele começar

```
package Aula14;
import java.util.Scanner;

class SwitchCase2 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Digite um numero do dia da semana :");
    int dia = scan.nextInt();
    switch(dia){
      case 2: System.out.println("Dia util"); 
      case 3: System.out.println("Dia util"); 
      case 4: System.out.println("Dia util"); 
      case 5: System.out.println("Dia util"); 
      case 6: System.out.println("Dia util"); break;
      case 1: System.out.println("Final de Semana");
      case 7: System.out.println("Final de Semana"); break;
    }

  }
}
```
### Suporte do Switch
As condições suportada na estrutura condicional if e else só são aceitas condicionais boolean ou seja, verdadeiro ou falso, no Switch-Case tem suporte de compar, numeros inteiros, como do exemplo, também suporta caracter e também tem suporte a String, por exemplo poderia ter colocado para ler do teclado o nome do dia da semana e o programa mostrar o numero do dia

### Análise na String
Como já foi dito String não é um tipo de variável na lingugagem Java e sim um tipo de classe da nativa da linguagem dentro dessa classe existe vários métodos(funções), para analizarmos o conteudo de uma String na utilização das condicionais IF e Else temos o método ```equalsIgnoreCase()``` ele faz a comparação com o conteudo de uma String ignorando se as letas estão em maiusculo ou minusculo e retorna uma valor boolian vamos ao exemplo

```
String sexo = "f"
if (sexo.equalsIgnoreCase("f")){
  System.out.println("Feminino")
}
```
Veja acima o método compara se o valor que está na String sexo é "f" ingnorando se "f" é minusculo ou maiusculo

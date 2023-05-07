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

## Resolva a bateria de exercicíos
### [Lista de Exercicíos](https://github.com/lex4brao/02.CURSO.DE.JAVA.-.LOIANE.GRONER/tree/main/RESOLUCAO%20DE%20EXERCICIOS)


## Aula 16

### Loops WHILE e Do WHILE 

### O comando while
O comando while siguinifica enquando, o comando avalia uma expressão ou condição e enquando ela for verdadeira ele executa um bloco de comando veja o exemplo abaixo

```
class LoopWhile {
  public static void main (String[] args) {
    
    int count=0; 
    System.out.println("Contador até 10");
   
    while(count<=10){
      System.out.println(""+count);
      count++;
    }
  }
}
```

### o Comando do-while
O comando do-while que siguinifica faça enquanto, é similar o comando while porem ele faz a verificação da expressão ou condição após executar o bloco de comando veja o exemplo abaixo
```
class LoopWhile {
  public static void main (String[] args) {
    
    int count=0; 
    do {
      System.out.println(" - "+count);
      count++;
    } while(count<=25);
  }
}
```

## Aula 17

### O Loop For
O comando for é o mais utilizado dentro da programação ele também executa um bloco de comandos enquando uma expressão ou condição for verdadeira 
O comando for é mais utilizado por oferecer a possibilidade de inicializar uma variável, colocar uma condição e colocar uma atualização como o incremento, tudo em uma linha de comando 

```
class LoopFor {
  public static void main (String[] args) {
    System.out.println("Contador até 10");

    for(int count=0; count<=10; count++){
      System.out.println(" "+count);
    }
  }
}
```
Vale observar, que quando uma variável é declarada dentro do comando for, ela só poderá ser utilizada dentro do bloco de comando for 

### For com mais de uma variável
Veja que dentro dos parâmentros do comando for separamos por ; (ponto é virgula) como se fosse uma linha de comando temos a possibilidade de separar as variáveis por virgula

```
class LoopFor {
  public static void main (String[] args) {
  
    for(int i=0, j=10; i<=j; i++, j--){
      System.out.println("i="+i+" j="+j);
    }

  }
}
```
### For com partes ausentes
o comando for pode ser utilizado com partes ausentes como iniciar a variavel fora do comando for veja o exemplo:

```
class LoopFor {
  public static void main (String[] args) {
  
   int i=0;
    for( ; i<=100; ){
      System.out.println(""+i);
      i+=5;
    }

  }
}
```
### For de corpo vazio
O for de corpo vazio é muito utilizado para somatórias veja o exemplo abaixo
```
package Aula16;

class LoopFor {
  public static void main (String[] args) {

    int soma=0;
    for(int k=0; k<=5; soma+=(k++));
    System.out.println("A soma é "+soma);

  }
}
```
## Resolva a bateria de exercicíos
  ### [Lista de Exercicíos](https://github.com/lex4brao/02.CURSO.DE.JAVA.-.LOIANE.GRONER/tree/main/RESOLUCAO%20DE%20EXERCICIOS)

## Aula 18

### Comando Break
O comando Break é um comando, que breca ou para a execução de um bloco de comandos como os loops, e até mesmo o switch, e pode ser usado com um rótulo (label), veja o exemplo abaixo utilizando o break
```
import java.util.Scanner;

class BreakContinue {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Entre com um numero");
    int nun= scan.nextInt();
    System.out.println("Entre com um com um limite");
    int max= scan.nextInt();
    for(int i=num;i<=max;i++) {
      if (i%7==0){
        System.out.println(i;"");
        break;
      } 
    }  
  }  
}
```
### Break com rótulos (label) - GoTo
Rótulos são nomes que damos para um bloco de comandos, quando usamos o break com rótulos podemos parar a execução de um loop e mandar o programa para um bloco de comandos expecifico veja o exemplo abaixo
```
class Rotulo {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    for(int i=0;i<=4;i++) {
      rotulo1:{
        rotulo2:{
          rotulo3:{
            if (i==1){
              break rotulo1;
            } 
            if (i==2){
              break rotulo2;
            } 
            if (i==3){
              break rotulo3;
            } 
            System.out.println("Rotulo 3");
          }
          System.out.println("Rotulo 2");
        }
        System.out.println("Rotulo 1");
      }
      System.out.println(i);
    } 
  }
}
```

### Continue
O comando Continue é um complemento do código break, ele continua o loop apartir do ponto espeficiado com o comando, veja o exemplo abaixo
```
import java.util.Scanner;

class Continue {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    for(int i=0;i<=10;i++) {
      if (i%2==0){
        continue;
      } 
      System.out.println(i+"");
    } 
  }
}
```
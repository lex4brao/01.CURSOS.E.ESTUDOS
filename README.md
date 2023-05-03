# Curso de Java Básico
### Prof: Loiane Groner


# Repositório em Construção

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
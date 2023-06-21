# MÓDULO 5 - ROTINAS

## Aula 0

### As Rotinas

A partir do momento, que estamos avançando na programação nossos algoritmos, temos muitas coisas acontecendo dentro dos nossos programas e isso vai se tornando cada vez mais complexos, nós podemos dividir isso, pois tem muitas coisas em nossos programas e sobre carregando o método principal e pra isso temos as ROTINAS

### Rotinas sem retorno [Procedimento]

### Rotinas com retorno [Funções]

As Rotinas também são conhecidas como Função, Método, Módulo, Modularização, Procedimento

**O Portugol Studio generaliza todas as rotinas e denominada como FUNÇÕES**

## Aula 1

### Rotinas

Em termos técnicos podemos dizer que rotina é:

**É uma ação que acontece periodicamente, sempre que ocorre um evento DISPARADOR. Em alguns casos PARÂMETROS são recebidos e afetam na execução da rotina.**
**Terminada AÇÃO , o fluxo de execução volta ao ponto em que estava no momento do disparo**

### Disparador

Imagine que você está na sua rotina normal e sua mãe te manda ir buscar pão, o fato de ela lhe mandar buscar pão é um disparo na execução de uma das duas rotinas.

### Parâmetro

Ao mandar sua você buscar pão sua mãe lhe dá R$10,00 a quantidade de dinheiro é o parâmetro passado, conforme a quantidade de dinheiro você poderá trazer até uma certa quantidade de pão

### Ação

é o fato de você chegar na padaria e ver que o pão está R$1,00 então você pede R$10,00 pão

### Retorno

Você chegando em casa com 10 pães

**Assim se resumo uma rotina com retorno**

## Aula 2

### Rotinas sem Retorno

O Portugol Studio não diferencia Rotinas com ou sem retorno, adota-se o nome Função, se você não percebeu usamos função desde o nosso primeiro programa

```
programa
{

	funcao inicio()
	{
		escreva("Olá Mundo")
	}
}

```

Veja que tudo que executamos até agora foi dentro de uma função chamada início, ou seja a função inicio é uma função sem retorno

vamos ao exemplo para fazer nossa primeira função

### Exemplo

Imagina sua rotina

```
programa
{

  funcao inicio()
  {

    escreva("\nAcordar")
    escreva("\nTrabalhar")
    escreva("\nEstudar")
    escreva("\n\n")
  }
}
```

Agora você lembra que precisa ir ao dentista e isso alterará sua rotina comum, pra isso temos a função dentista

```
programa
{
  funcao inicio()
  {

    escreva("\nAcordar")
    escreva("\nTrabalhar")
    dentista()
    escreva("\nEstudar")
    escreva("\n\n")
  }

    funcao dentista()
  {
    escreva("\n")
    escreva("\nEscovar os dentes")
    escreva("\nIr ao consultório")
    escreva("\nPassar pelo dentista")
    escreva("\nVoltar do consultório")
    escreva("\n")
  }
}

```

O procedimento padrão de execução do programa é sempre executar a funçao inicio primeiro independente se você escreve uma função acima ou abaixo da função inicio, faça o teste de no seu Portugol Studio

```
programa
{

    funcao dentista()
  {
    escreva("\n")
    escreva("\nEscovar os dentes")
    escreva("\nIr ao consultório")
    escreva("\nPassar pelo dentista")
    escreva("\nVoltar do consultório")
    escreva("\n")
  }

  funcao inicio()
  {

    escreva("\nAcordar")
    escreva("\nTrabalhar")
    dentista()
    escreva("\nEstudar")
    escreva("\n\n")
  }

}
```

Veja que isso não se trata de um looping(estrutura de repetição) e sim um desvio em nosso programa acionado através de um DISPARO, veja um exemplo com mais de um disparo

```
programa
{

    funcao dentista()
  {
    escreva("\n")
    escreva("\nEscovar os dentes")
    escreva("\nIr ao consultório")
    escreva("\nPassar pelo dentista")
    escreva("\nVoltar do consultório")
    escreva("\n")
  }

  funcao inicio()
  {

    escreva("\nAcordar")
    dentista()
    escreva("\nTrabalhar")
    dentista()
    escreva("\nEstudar")
    dentista()
    escreva("\nDormir")
    escreva("\n\n")
  }

}

```

## Aula 3

### Passagem de Parâmetros

Lembra da historinha de ir na padaria comprar pão, vamos criar uma função chamada padaria() dentro dos parênteses é onde passamos os parâmetros que a função irá receber, ou seja o DISPARO é o comando padaria os parênteses () é os parâmetros recebidos

```
programa
{
  funcao inicio()
  {

    escreva("\nAcordar")
    padaria(10)
    escreva("\nTrabalhar")
    padaria(50)
    escreva("\nEstudar")
    padaria(30)
    escreva("\nDormir")
    escreva("\n\n")
  }

}

```

Se notarmos criamos um comando chamado padaria, assim como é o comando **leia()**, **escreva()**, ou seja, esses comandos são funções pré estabelecidas pelo Portugol Studio

Agora vamos escrever o algoritmo da função padaria

```
    funcao padaria(inteiro din)
  {
    escreva("\n")
    se(din<=10) {
      escreva("\nComprar pão")
    }senao se(din < 50) {
      escreva("\nCompara pão e leite")
    }senao {
      escreva("\nComprar pão, refrigerante, presunto e queijo")
    }
    escreva("\n")
  }
```

Note que ao receber um parâmetro em uma função, temos que declarar esses parâmetros em uma variável dentro dos parentes da função, quando declaramos um parâmetro chamamos de PARÂMETRO REAL, quando recebemos o parâmetro em uma função chamamos de PARÂMETRO FORMAL

### PARÂMETRO REAL

Parâmetro real é o parâmetro que informamos na função:
dobro(50)

### PARÂMETRO FORMAL

Parâmetro Formal é o parâmetro que recebemos na função, veja que declaramos a variável nun para receber o parâmetro
funcao dobro(inteiro nun)
{
escreva(nun\*2)
}

### Passagem de Parâmetro por valor

Em termos técnicos passagem de parâmetro por valor é:

**Na PASSAGEM POR VALOR, o conteúdo do PARÂMETRO REAL, é copiado para o PARÂMETRO FORMAL. Qualquer mudança no do valor forma NÃO AFETARÁ o valor real**

### Exemplo

Vamos ao exemplo de dois parâmetros ou mais em uma única função, note que é necessário indicar o tipo primitivo para cada parâmetro formal passado

```
programa
{
  funcao soma(inteiro	a, inteiro b)
  {
    inteiro	s
    s= a+b
    a++
    b--
    escreva("\nA soma de ", a, " e ", b, " é ", s)
  }
  funcao inicio()
  {
    inteiro	a, b
    escreva("\nDigite um valor: ")
    leia(a)
    escreva("\nDigite outro valor: ")
    leia(b)
    soma(a, b)
    escreva("\n\nOs valores digitados foram ", a, " e ", b)
    escreva("\n\n")
  }
}
```

Note que os valores recebidos nas variáveis a e b, não foram alterados por mais q alteramos os valores na função soma com as variáveis do mesmo nome

## Aula 4

### Variáveis de escopo Global

Escopo é basicamente aonde uma variável irá funcionar, se declararmos uma variável dentro da estrutura de repetição para, ela só funcionará dentro da estrutura para de foi declarada, se declararmos uma variável dentro de uma função, ela só funcionará dentro da função que foi declarada, por mais que utilizamos o mesmo nome como no exemplo da aula passada
Variável de escopo Global é uma variável é fora das funções e ela funcionará em todos os escopos do programa

### Exemplo

vamos ao programa utilizado na aula passada para entendermos o comportamento de uma variável de escopo global, porem a variável tem que receber valor na hora da sua declaração para poder funcionar em todas as funções

´´´
programa
{
inteiro a=0, b=0
funcao soma(inteiro n1, inteiro n2)
{
inteiro s
n1++
n2--
s=n1+n2
escreva("\nA soma de ", n1, " e ", n2, " é ", s)
escreva("\nParâmetro 1: ", a)
escreva("\nParâmetro 2: ", b)
}
funcao inicio()
{
escreva("\nDigite um valor: ")
leia(a)
escreva("\nDigite outro valor: ")
leia(b)
soma(a, b)
escreva("\n\nOs valores digitados foram ", a, " e ", b)
escreva("\n\n")
}
}
´´´
Note que parâmetro formal não é o mesmo que uma variável ou seja tem que ser declarado na função para receber o valor do parâmetro real

## Aula 5

Bateria de exercícios utilizando com rotinas

### Resolva os exercícios 69, 70, 71, 72, 73, 74 e 75

### [Veja a Lista de Exercícios Aqui](https://github.com/lex4brao/01.CURSOS.E.ESTUDOS/blob/main/01.PROGRAMACAO.BASICA.-.ESTUDONAUTA/RESOLUCAO%20DOS%20EXERCICIOS/README.md)

## Aula 6

### Funções com retorno

Basicamente a estrutura de uma função com retorno é basicamente o mesmo das funções sem retorno porem temos que identificar o tipo da função, inteiro, real, cadeia, caracter e adicionar o comando retorne com o valor a ser retornado

**Obs.: Em meus estudos até agora só vi a possibilidade de uma função retornar apenas um valor por vez, tentei o retorno de vetores mais foi sem sucesso**

### Exemplo

Vamos ao exemplo de uma função soma

```
programa
{

  funcao inicio()
  {
    inteiro	a, b
    escreva("\nDigite um valor: ")
    leia(a)
    escreva("\nDigite outro valor: ")
    leia(b)
    escreva("\nA soma dos valores é ", soma(a,b))
    escreva("\n\n")
  }

  funcao inteiro	soma(inteiro	n1, inteiro	n2)
  {
    retorne(n1+n2)
  }
}
```

Note que a função soma é do tipo inteiro e retorna um valor inteiro

## Aula 7

### Função que chama função

Nós já utilizamos este conceito porem acho interessante analisar utilizando funções com retorno, basicamente, é uma função de que tem uma chamada pra outra função dentro dela basicamente poderíamos dizer que seja funções aninhadas

### Exemplo

```
programa
{

  funcao inicio()
  {
    real	nota1, nota2
    escreva("\nDigite sua primeira nota: ")
    leia(nota1)
    escreva("\nDigite sua segunda nota: ")
    leia(nota2)
    escreva("\n")
    escreva("\nVocê está ", situacao(nota1, nota2))
    escreva("\n\n")
  }

  funcao cadeia situacao(real n1, real n2)
  {
    real	m= media(n1, n2)
    se(m<5) {
      retorne("REPROVADO")
    }senao se(m<7) {
      retorne("EM RECUPERAÇÃO")
    }senao {
      retorne("APROVADO - PARABÉNS")
    }
  }

  funcao real media(real	not1, real	not2)
  {
    retorne((not1+not2)/2)
  }
}
```

Veja que dentro da função situacao temos uma função media que conforme o retorno desta função será o resultado do retorno da função situcao

## Aula 8

### A passagem de Parâmetros por Referência

Até o momento utilizamos a passagem de parâmetro por valor, que nada mais é copiar o valor vindo de uma função e atribuir o valor em uma variável dentro de outra função em nosso programa, teoricamente esse procedimento utilizaria dois espaços na memória resultando em duas variáveis com o mesmo valor em nosso programa.
Existe também a passagem de parâmetro por referencia

### Valor vs Referência

Para um melhor entendimento gosto de imagina que a passagem de parâmetro por valor é como uma cópia do valor de uma variável para outra, a passagem por referência seria como se criássemos um atalho para aquela variável aonde qualquer alteração naquele valor é uma alteração no próprio valor da variável. Por mais que a própria variável não esteja declarada na função a variável de referência irá sofrer alteração

### Declaração do Parâmetro de referência

Para atribuir um valor de parâmetro utilizamos o caracter '&' na declaração do parâmetro da função vamos ao exemplo para entendermos melhor

### Exemplo Passagem de Parâmetro por Valor

```
programa
{
  funcao idade(inteiro	i)
  {
    escreva("\nIdade recebida é ", i)
    i = i+10
  }
  funcao inicio()
  {
    inteiro	id=25
    idade(id)
    escreva("\n")
    escreva("\nA idade é ", id)
    escreva("\n\n")
  }
}
```

veja o resultado a variável id não sofrerá alteração caso o valor mude na variável i

```
Idade recebida é 25

A idade é 25

```

### Exemplo Passagem de Parâmetro por Referência

```
programa
{
  funcao idade(inteiro	&i)
  {
    escreva("\nIdade recebida é ", i)
    i = i+10
  }
  funcao inicio()
  {
    inteiro	id=25
    idade(id)
    escreva("\n")
    escreva("\nA idade é ", id)
    escreva("\n\n")
  }
}

```

Note que a única alteração em nosso programa foi o caracter '&' antes do parâmetro "i" na declaração da função agora veja o resultado

```
Idade recebida é 25

A idade é 35

```

A variável id acrescentou +10 em seu valor que foi adicionado através da função idade com o parâmetro "i"

**Passagem de Parâmetro por Valor copia os valores**
**Passagem de Parâmetro por Referência aponta para a referência e ela pode ou não ter alteração de valores**

## Aula 9

### Recursividade

Recursividade é um assunto um pouco complexo na área de programação, porém bem resumidamente uma Função Recursiva, é uma função que chama ela mesma dentro de sua estrutura, metaforicamente falando é um espelho refletindo outro espelho e se torna aquele túnel de reflexões de espelhos...
Eu gosto de usar a analogia que uma função recursiva é similar a uma estrutura de repetição que se repete até um determinado ponto determinado.

### Função Recursiva

A estrutura de uma função recursiva é basicamente dividida em duas condições, a condição-base é a parada da função para não entrar em um looping infinito, a condição-geral onde existe a chamada dela mesmo para a resolução de um problema, o caso clássico de uma função recursiva é o cálculo de um fatorial matemático

### Exemplo com estrutura de repetição

Sabemos que um fatorial é o produto de todos os números inteiros de n até 1 ou seja:
5! = 5\*4\*3\*2\*1 = 120

```
programa
{

  funcao inicio()
  {
    inteiro	x, fat=1
    escreva("\nDigite um valor positivo: ")
    leia(x)
    se(x==0) {
      x=1
    }senao {
      faca {
        fat= fat*x
        x--
      } enquanto(x>=1)
    }
    escreva("\nFatorial = ", fat)
    escreva("\n\n")
  }
}
```

### Exemplo com Função recursiva

```
programa
{

  funcao inteiro fatorial(inteiro x)
  {
    se(x==0 ou x==1) {
      retorne 1
    }senao {
      retorne x*fatorial(x-1)
    }
  }

  funcao inicio()
  {
    inteiro	x
    escreva("\nDigite um valor positivo: ")
    leia(x)
    escreva("\n", x, "! = ", fatorial(x))
    escreva("\n\n")
  }
}
```

Note que a função fatorial acumulou os valores da multiplicação assim como a variável fat no exemplo com estrutura de repetição e a própria passagem de parâmetro da função executou o mesmo que o x-- da estrutura de repetição

## Aula 10

Bateria de exercícios utilizando com rotinas

### Resolva os exercícios 76, 77, 78, 79, 80 e 81

### [Veja a Lista de Exercícios Aqui](https://github.com/lex4brao/01.CURSOS.E.ESTUDOS/blob/main/01.PROGRAMACAO.BASICA.-.ESTUDONAUTA/RESOLUCAO%20DOS%20EXERCICIOS/README.md)

### [Voltar](https://github.com/lex4brao/01.CURSOS.E.ESTUDOS/blob/main/01.PROGRAMACAO.BASICA.-.ESTUDONAUTA/README.md)


# MÓDULO 2 - ESTRUTURAS CONDICIONAIS

## Aula 0

### As estruturas de Controle

## Aula 1

### Operação Relacional

As principais operações relacionais que temos na programação é são as comparações para comparar valores que utilizamos as seguintes simbologias

### Os Operadores Relacionais

- Igualdade [==]
- Diferença [!=]
- Maior [>]
- Menor [<]
- Maior ou igual [>=]
- Menor ou igual [<=]

Nos operadores relacionais não temos exatamente uma ordem de precedência pois normalmente não é possível fazer mais de uma comparação simultaneamente então neste caso utilizamos os parentes para separar as comparações

Lembre-se o resultado de uma operação relacional até mesmo a operação de comparação esse resulta sempre será do tipo primitivo lógico

### Exemplo

```
programa
{

  funcao inicio()
  {
    inteiro a=7, b=9
    escreva("\n", a==b)
    escreva("\n", a!=b)
    escreva("\n", a>=b)
    escreva("\n", a<=b)
    escreva("\n\n")
  }
}
```

## Aula 2

### Operadores Lógicos

Como dito sobre os operadores relacionais não é possível ter dois operadores relacionais em uma mesma expressão, porem a grande maioria das linguagens tem um artificio, que utilizando operadores lógicos podemos fazer microexpressões onde podemos fazer comparações muito mais complexas
A grande maioria das linguagens de programação existem 3 operadores lógicos podendo assim fazer comparações um pouco mais complexas

- Conjunção (E) [AND]
- Disjunção (OU) [OR]
- Negação (NAO) [NOT]

Os operadores lógicos são regidos por algo que chamamos de Tabela Verdade, e cada operador lógico tem sua Tabela Verdade com suas particularidades, é importante ressaltar que todo Operador Lógico também será do tipo primitivo lógico, ou seja, eles só receberão os valores verdadeiros e falso

### Operação E [AND]

Veja a Tabela Verdade Abaixo da operação E, onde atribuímos valores verdadeiros e falsos para X e Y e vemos o resultado da operação E

| X          | Y          | (E)        |
| ---------- | ---------- | ---------- |
| Verdadeiro | Verdadeiro | Verdadeiro |
| Verdadeiro | Falso      | Falso      |
| Falso      | Verdadeiro | Falso      |
| Falso      | Falso      | Falso      |

Note que para termos um resultado verdadeiro nessa operação necessitamos que ambos os seus valores sejam verdadeiros, melhor dizendo tem que ser verdadeiro **E** verdadeiro pois não existe a possibilidade de algo ser verdadeiro **E** falso ao mesmo tempo diante de um parâmetro

### Operação OU [OR]

Um bom exemplo que gosto na operação ou é o símbolo >= por seu nome já diz maior **OU** igual, ou seja, só será verdadeiro se ele for maior **OU** igual a sua referência por não existe o maior **E** igual não é possível algo ser maior e igual no mesmo instante então isso já nos diz bastante sobre sua Tabela Verdade

| X          | Y          | (OU)       |
| ---------- | ---------- | ---------- |
| Verdadeiro | Verdadeiro | Verdadeiro |
| Verdadeiro | Falso      | Verdadeiro |
| Falso      | Verdadeiro | Verdadeiro |
| Falso      | Falso      | Falso      |

Note se algo é verdadeiro ou falso se torna verdadeiro e só se assume o valor Falso tudo aquilo que for Falso **OU** Falso

À primeira vista é bem complexo "=S" porem conforme formos praticando isso vai se habituando

### Negação NAO [NOT]

A operação de negação é tipo um inversor do seu estado atual, ou seja, se algo é verdadeiro sua negação é falsa

| X          | NAOX       |
| ---------- | ---------- |
| Verdadeiro | Falso      |
| Falso      | Verdadeiro |

### ORDEM DE PRECEDENCIA

Com os operadores lógico nós podemos colocar mais de um operador em uma mesma expressão e pra isso existe uma ordem de precedência na sua resolução

1. Negação (NAO) [NOT]
2. Conjunções (E) [AND]
3. Disjunções (OU) [OR}

Agora que já vimos quase todos os tipos de operadores vamos tentar decorar a ordem de precedência GLOBA

## ORDEM DE PRECEDENCIA GLOBAL

### 1. PARENTESES ()

"Tudo que estiver dentro dos parentes é prioridade"

### 2. ARITIMÉTICOS

[*, /, %, +, -, ]

### 3. RELACIONAIS

[==, !=, >, <, >=, <=]

### 4. Lógicos

[Nao, E, Ou ]

#### DECORE A ORDEM DE PRECEDENCIA

isso lhe ajudará muito no seu dia a dia como programador

### Exemplo

- NAO(5>3) OU (10 >= 10) e (7<4)
- NAO(VERDADE) OU (VERDADE) E (FALSO) - **"RESOLVIDO OS OPERADORES RELACIONAIS"**
- FALSO OU (VERDADE) E (FALSO) - **"RESOLVIDO O OPERADOR NÃO"**
- FALSO OU FALSO - **"RESOLVIDO O OPERADOR E"**
- FALSO - **"RESOLVIDO O OPERADOR OU"**

**Obs.: Todo resultado dos operadores relacionais e dos operadores lógicos sempre serão do tipo lógico ou seja [Verdadeiro] ou [Falso]**

### Exemplo no Código

```
programa
{

  funcao inicio()
  {
    inteiro a=3, b=5
    logico x
    x = (a>b)  ou (b<a*2) e nao(b>a)
    escreva("\n", x) //falso
    x = (a<b)  ou (b<a*2) e nao(b>a)
    escreva("\n", x) //verdadeiro
    escreva("\n\n")
  }
}
```

## Aula 3

### Estrutura Condicional Simples

Estruturas de Controle nos dá a possibilidade de controlar através do nosso código do que será controlado e do que não será controlado, as Estruturas Condicionais nos trazem as possibilidades de controle através de condições, melhor falando ela nos dá possibilidades de escolhas

**Exemplificando** quando passamos em um radar de velocidade ele nos dá duas condições **SE** passar acima da velocidade você é multado **SENAO** você não é multado e você segue sua vida
Basicamente Estruturas Condicionais simples trazem essas situações reais para podemos colocar em nosso código, trazendo duas possibilidades a de **SER** ou **NÃO SER** multado conforme a velocidade que informamos ao radar...
Ou seja, você só será multado se a condição da velocidade for **Maior OU Igual** a permitida pelo radar

### Estrutura Condicional SE [IF]

Para usarmos a estrutura SE, ela só executará os comandos dentro do bloco de comandos [] SE a condicional que ficará em parênteses() for verdadeira vamos ao exemplo

### Exemplo

```
SE(velocidade >= 80)
  {
    escreva("\nVocê foi Multado)
  }
```

Desta forma a mensagem "Você foi Multado", só irá aparecer se a velocidade do carro for maior ou igual a 80KM

Veja outro exemplo abaixo de um programa onde aparece uma mensagem para mulheres de 30 a 50 fazerem o exame de prevenção ao câncer de mama

### Exemplo com Código

```
programa
{
  inclua biblioteca Calendario --> c
  funcao inicio()
  {
    inteiro ano_nas, id
    escreva("\nOlá em que ano você nasceu [YYYY]")
    escreva("\n>> ")
    leia(ano_nas)
    id = c.ano_atual() - ano_nas
    escreva("\nVoce tem ", id, " anos de idade")
    se(id>=30 e id<=50)
      {
        escreva("\n\nVocê precisa fazer o exame de prevenção ao câncer de mama")
      }
    escreva("\n\n")
  }
}
```

Note e a condição do SE foram usadas operações relacionais como >= e <= e operações lógicas como o E, ou seja, a condição só se tornou verdadeira se a idade for entre 30 até 50 anos

\*\*OBS.: veja q o portugol é case sensitive, ou seja, caracteres maiúsculos e minúsculos fazem toda a diferença então sempre que for usar os comandos "se", "ou", "e", "nao", é sempre em minúsculo

### Faça os exercícios 13, 14, 15 
### [Veja a Lista de Exercícios Aqui](https://github.com/lex4brao/01-CURSO-DE-PROGRAMACAO-BASICA/tree/main/RESOLUCAO%20DOS%20EXERCICIOS)

## Aula 4

### Estrutura Condicional Composta

Na estrutura condicional simples ela só executa os comandos do bloco **SE** a condição for verdadeira, na estrutura condicional composta já se abre duas possibilidades no caso **SE** for verdadeiro temos uma condição **SENAO** temos outra condição, ou seja, nosso algoritmo sempre terá um fluxo para seguir, **SE** a condição for verdadeira **SENAO** a condição for falsa

### Estrutura Condicional SENAO [ELSE]

A estrutura condicional **SENAO** basicamente executa um bloco de comandos se a condição **SE** não for verdadeira

### Exemplo

Veja um exemplo SE um numero é par SENAO ele é impar

```
programa
{

  funcao inicio()
  {
    inteiro num
    escreva("\nDigite um numero ")
    escreva("\n>> ")
    leia(num)
    escreva("\n")
    escreva("\nO número ", num)
    se(num%2==0) {
      escreva(" é par")
    } senao {
      escreva(" é impar")
    }
    escreva("\n\n")
  }
}
```

### Resolva os exercícios 16, 17, 18, 19, 20
### [Veja a Lista de Exercícios Aqui](https://github.com/lex4brao/01-CURSO-DE-PROGRAMACAO-BASICA/tree/main/RESOLUCAO%20DOS%20EXERCICIOS)

## Aula 5

### Condicionais aninhadas

Aninhado nada mais é que agrupado, em forma de ninho, pois nem tudo na vida existe somente duas possiblidades como as condicionais compostas nos oferece, na realidade nem tudo é verdadeiro ou falso, um número pode ser positivo negativo e até mesmo nulo no caso do ZER0 e pra isso usamos as condições aninhadas

### Estrutura Condicional SENAO SE [ELSE IF]

A condicional **SENAO SE** nos traz a possibilidade de colocar uma condição dentro da condição SENAO, como a comparação de dois números **SE** 2>2? **SENAO SE** 2<2? **SENAO** 2==2

### Exemplo com Códigos

```
programa
{

  funcao inicio()
  {
    inteiro n1, n2
    escreva("\nDigite um numero")
    escreva("\n>> ")
    leia(n1)
    escreva("\nDigite outro número")
    escreva("\n>> ")
    leia(n2)
    escreva("\n")
    se(n1>n2) {
      escreva("\n", n1, " é maior que ", n2)
    } senao se(n1<n2) {
      escreva("\n", n1, " é menor que ", n2)
    } senao {
      escreva("\n", n1, " é igual a ", n2)
    }
    escreva("\n\n")
  }
}
```
### Resolva os exercícios 21, 22, 23, 24 e 25 
### [Veja a Lista de Exercícios Aqui](https://github.com/lex4brao/01-CURSO-DE-PROGRAMACAO-BASICA/tree/main/RESOLUCAO%20DOS%20EXERCICIOS)

## Aula 6

### Estrutura Escolha

A estrutura escolha nos permite muito mais possibilidades que as estruturas **SE, SENAO SE e SENAO, e se torna um pouco mais simples de ser escrita em relação a escrita das condicionais aninhadas, e eu acho menos gambiarrenta e mais lógica que as condições aninhadas
Com ela você **ESCOLHE\*\* uma variável e conforme o valor que essa variável a assumir retornará um bloco de comandos, porem essa variável escolhida só pode ser do tipo primitivo inteiro ou caractere "não cadeia" caractere mesmo

### Exemplo

```
escolha(num){
  caso 1:
    escreva("um")
    pare
  caso 2:
    escreva("dois")
    pare
  caso 3:
    escreva("três")
    pare
  caso contrario:
    escreva("ERRO")
    pare
}
```

Note que conforme o valor da variável nun receba o valor um o programa irá escrever "Um" e assim sequencialmente, note que o caso contrário faze meio q o papel do senão se não for nenhum dos valores esperados ela escreve uma mensagem em referência a isso
Outro aspecto muito importante para é o comando pare se ele não for colocado a estrutura executará todos os outros blocos de comando da estrutura

### Resolva os exercícios 26, 27, 28 
### [Veja a Lista de Exercícios Aqui](https://github.com/lex4brao/01-CURSO-DE-PROGRAMACAO-BASICA/tree/main/RESOLUCAO%20DOS%20EXERCICIOS)



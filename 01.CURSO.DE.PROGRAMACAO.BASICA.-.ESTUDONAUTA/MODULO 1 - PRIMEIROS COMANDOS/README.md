# MÓDULO 1 - PRIMEIROS COMANDOS

## Aula 0

### O que são variáveis?

Variáveis são pequenos espaços que reservamos na memória principal do computador e este espaço tem:

- Nome (Identificador)
- Tipo número (real ou inteiro), caractere, cadeia (palavras ou frases), lógico (booleano),

### Regras para Identificadores

1. Todo identificador tem que começar com uma letra
2. Só se usa caracteres números e \_(underline)
3. Não pode usar acentos
4. Não pode haver espaços
5. Não pode haver caracteres especiais (%$&\*#@!”/?ºª°¹²³)
6. Não pode ser uma palavra reservada (isso é dependente da linguagem de programação)

## Aula 1

Os Tipos Primitivos se dividem basicamente em 3 tipos, os números, as letras e respostas, melhor falando em verdadeiro ou falso

### Números

Os números se dividem em dois tipos, os inteiros ou reais

- Inteiros são os números {2, 3, 999999, 100, 3255}
- Reais são os números {2.5, 9.5, 3.1416}
  _Obs.¹: em algumas linguagens como o C os reais são chamados de float por conta do seu ponto flutuante_

### Caracteres

Os caracteres são letras e são divididos em dois tipos

- Caractere para apensas uma letra {’a’, ‘b’, ‘z’, ‘y’, ‘x’, ‘ ‘} para colocar em nosso código usamos aspas simples para declarar caracteres
- Cadeia para palavras com mais de uma lera {”amor”, “fé”, “vencer”, “j”} para coloca em nosso código usamos aspas duplas para declarar cadeias
  _Obs.¹: um caractere apenas pode ser uma cadeia assim como o espaço pode ser uma cadeia e também um caractere_

## Aula 2

### Declarando as variáveis

Declarando as variáveis, algumas linguagens como Python e PHP não precisamos declarar as variáveis, porem para outras linguagens isso é fundamental
Para declarar uma variável primeiro colocamos o tipo, logo depois colocamos o identificador.
Para declarar o valor a variável temos que já colocar em mente que sempre vermos o símbolo de igual [”=”] em um algoritmo é um símbolo de atribuição para atribuir o valor da variável, vamos a alguns exemplos

- inteiro idade  
  note q [inteiro] é o tipo da variável e [idade] é o identificador
- real nota = 7,5
  Nota é uma variável do tipo real, que recebe o valor de 7,5
- cadeia nome = “Zé”
- logico casado = falso

## Aula 3

### Usando as constantes

Usando as constantes, para declarar um constante colocamos o comando const antes de declarar a variável, uma boa prática na programação é sempre colocar o identificador de uma constante em maiúsculo ou com o Caps Lock ligado, veja os exemplos

```
const real NOTA = 8.5
const cadeia NOME = "Alexandre"
const caractere SEXO = 'h'
const inteiro IDADE = 20
```

_Obs.: É obrigatório atribuir o valor da constante na declaração da variável_

## Aula 4

### Entrada e Saída de Dados

- Para entrada de dados temos os dispositivos de entrada como o mouse e o teclado
- Para saída de dados temos os dispositivos de saída como o monitor e a impressora
- No Portugol também temos a auto entrada onde o portugol gera um número randomicamente com a função sorteia
  _Obs.: existem dispositivos que servem como entrada e saída de dados como a unidade de disco_

### Saída de Dados

Para saída de dados utilizamos um comando de saída que é o escreva(""), veja abaixo dois algoritmos utilizando o comando escreva("")

### Exemplo

```
programa
{

  funcao inicio()
  {

    escreva("Olá Mundo")
  }
}
```

### Exemplo 2

```
programa
{

  funcao inicio()
  {
    const inteiro MAIORIDADE = 18
    inteiro idade = 15
    escreva("Você tem ", idade, " anos de idade!")
    escreva("\nA maior idade é a partir ", MAIORIDADE, " anos de idade")
  }
}
```

### Entrada de Dados

Para entrada de dados utilizamos o comando leia(), este comando lê aquilo digitado pelo teclado, com esse comando podemos trazer mais interação do usuário com nosso programa, veja o algoritmo abaixo como exemplo

### Exemplo

```
programa
{

  funcao inicio()
  {
    const inteiro MAIORIDADE = 18
    inteiro idade
    escreva("Qual é sua idade: \t")
    leia(idade)
    escreva("\nVoce tem ", idade, " anos de idade!")
    escreva("\nPara a maior idade é necessário ter ", MAIORIDADE, " anos de idade")
  }
}

```

_Obs.: Note que usamos o comando \n ele é utilizado para pular de linha ou quebra de linhas, e o comando \t é usado para tabular a escrita_
_Obs.: para colocarmos um comentário em nosso código utilizamos o // ou seja //Comentário_

### Faça os Exercícios 1 e 2 
### [Veja a Lista de Exercícios Aqui](https://github.com/lex4brao/01-CURSO-DE-PROGRAMACAO-BASICA/tree/main/RESOLUCAO%20DOS%20EXERCICIOS)

## Aula 5

### Como usar as Bibliotecas

Quando incluímos bibliotecas em nosso código, basicamente é colocar mais funções em nosso código, geralmente uma biblioteca traz uma série de novos comandos ao nosso código
No Portugol Studio temos a biblioteca Util e incluindo essa biblioteca em nosso código com isso teremos o comando sorteia

sorteia(numero mínimo, numero máximo)
Veja o Exemplo abaixo

### Exemplo 1

```
programa
{
    inclua biblioteca Util
  funcao inicio()
  {
    inteiro n
    n = sorteia(0,100)
    escreva("\nO número sorteado é ", n)
  }
}
```

### Exemplo 2

Veja outro exemplo de comando que temos na biblioteca Util
Util.aguarde(tempo em milissegundos)

```
programa
{
  inclua biblioteca Util
  funcao inicio()
  {
    inteiro n
    n = sorteia(0,100)
    escreva("\nIrei sortear um numero")
    Util.aguarde(1000)
    escreva("\nO número sorteado é ", n)
    escreva("\nAgora vou sortear outro número")
    Util.aguarde(1000)
    n = sorteia(0,100)
    escreva("\nO número sorteado agora é ", n)

  }
}
```

## Aula 6

### Operações Aritméticas

No Portugol Studio temos os operadores [+] soma e [-] subtração esses dois operação são usados de duas formas da forma unária e binária

### Forma Unária

A forma unária serve para distinguir se um número vai se tornar positivo ou negativo [+2], [-3]

### Forma Binária

A forma binária é o que utilizamos para fazer operações aritméticas como
(+) - Soma
(-) - Subtração
(\*) - Multiplicação
(/) - Divisão [esteja sempre atento ao tipo primitivo da variável na divisão, pois geralmente seus resultados são números reais]
(%) - Módulo da divisão [o famoso resto da divisão]

### Exemplo

```
programa
{

  funcao inicio()
  {

    escreva(4+2)
    escreva("\n4 + 2 = ", 4+2)
  }
}
```

### Exemplo com porcentagem

```
programa
{

  funcao inicio()
  {
    real	valor, por
    escreva("\nDigite um valor : ")
    escreva("\n>> ")
    leia(valor)
    escreva("\nQual a porcentagem de você quer desse valor?")
    escreva("\n>> ")
    leia(por)
    escreva("\n", por, "% de ", valor, " é igual ", valor*(por/100) )
    escreva("\n\n")
  }
}
```

Note no Exemplo Acima que utilizamos parênteses para ordem de precedência matemática onde primeiro é resolvido a operação que está dentro dos parênteses

### Ordem de precedência

1. ()
2. +-  unário
3. \*/%
4. +-  binário

### Exemplo de um cálculo de uma média

```
programa
{

  funcao inicio()
  {
    real n1, n2, med
    escreva("\nDigite o da primeira nota")
    escreva("\n>>\t")
    leia(n1)
    escreva("\nDigite a segunda nota")
    escreva("\n>>\t")
    leia(n2)
    escreva("\nA média do aluno é ", (n1+n2)/2)
  }
}
```

Note que se não colocássemos o n1+n2 dentro dos parênteses pela precedência iria ser feiro n2/2 primeiro que a soma das notas

### Biblioteca Matemática

A biblioteca matemática vem recheada de novas funções ("novos comandos") como

- Pi - Valores de Pi
- potencia(base, expoente)
- raiz(radicando, índice)
- Arredondar(numero, casa depois da virgula)

### Exemplo com a Biblioteca Matemática

```
programa
{
  inclua biblioteca Matematica --> m
  funcao inicio()
  {

    escreva(m.potencia(9,2))
    escreva("\n\n")
    escreva(m.PI)
    escreva("\n\n")
    escreva(m.raiz(81,2))
    escreva("\n\n")
    escreva(m.arredondar(m.PI,0))
    escreva("\n\n")
  }
}
```

Note que quando inclui a biblioteca Matemática eu usei o sinal --> m para apelidar a biblioteca como m

**Atenção** No Portugol Studio qual uma divisão feita de por um tipo primitivo inteiro, por um tipo primitivo real a operação aritmética poderá não ser exata ou use os dois operadores do tipo real ou utilize a biblioteca Tipos para converter o tipo primitivo da variável

## Aula 6
Exercícios de Fixação

### Resolver de Exercícios 3, 4, 5, 6, 7, 8, 9, 10 
### [Veja a Lista de Exercícios Aqui](https://github.com/lex4brao/01-CURSO-DE-PROGRAMACAO-BASICA/tree/main/RESOLUCAO%20DOS%20EXERCICIOS)

## Aula 8

### Operadores de Atribuição

Já sabemos que o sinal de igual (=) é um operador de atribuição onde a variável receber o valor de atribuição, porém podemos acrescentar o valor atual da variável e acrescentando uma nova operação

- k = k + 1
- x = x \* 2
- y = y - 1

Porem na programação podemos simplificar essas atribuições veja os exemplos

- k = k + 3 é o mesmo que k \*= 3
- x = x + 4 é o mesmo que x += 4
- y = y - 1 é o mesmo que y -= 1

essa simplificação é possível com todos operadores aritméticos básicos ["+, -, *, /, %"]

### Atribuição de contadores

Na programação utilizamos muitos contadores por isso é possível essa simplificação veja o exemplo

- k = k + 1 é o mesmo que k += 1 é o mesmo que k++
- x = x - 1 é o mesmo que x -= 1 é o mesmo que x--

## Aula 9

### Operações com texto

O Portugol Studio não é uma linguagem de programação em si porem ele vem com bibliotecas assim como as linguagens de programação em si como Java, c, python, php
Temos então a biblioteca Texto, e para trabalhar com texto no Portugol Studio iremos utilizar essa biblioteca que tem comandos como

- numero_caracteres(texto tipo cadeia)
- obter_caracter(texto, posição do caracter)

É importante saber que uma cadeia de caratcter na programação chamamos de string

### Exemplo

```
programa
{
  inclua biblioteca Texto --> txt
  funcao inicio()
  {
    cadeia nome = "Alexandre"
    escreva("\n", nome)
    escreva("\n", txt.numero_caracteres(nome))
    escreva("\n", txt.caixa_alta(nome))
    escreva("\n", txt.obter_caracter(nome, 0))
    escreva("\n\n")
  }
}
```

### Resolva os exercícios 11, 12 
### [Veja a Lista de Exercícios Aqui](https://github.com/lex4brao/01-CURSO-DE-PROGRAMACAO-BASICA/tree/main/RESOLUCAO%20DOS%20EXERCICIOS)

## Aula 10

### Representação com fluxograma


# MÓDULO 4 - VETOR E MATRIZ

## Aula 0
Apresentação sobre as variáveis compostas

  **OBS: Não Copie a solução. até veja a solução mais tente fazer a sua solução**

## Aula 1
O que é variável simples e o que é variável composta

### Vetor a variável composta
Normalmente em uma variável simples só é possível atribuir um valor por vez na variável, porem em uma variável composta podemos guardar quantos valores você quiser, as variáveis compostas são chamadas de vetores 
Ao declarar uma variável composta determinamos quando espaços ela irá ter, ou melhor quantos valores ela poderá receber

### Exemplo da declaração de vetor
```
inteiro n // dessa forma declarávamos uma variável simples

inteiro n[4] // dessa forma declaramos uma variável composta, ou seja, um vetor  
```
Note q o número 4 é a quantidade de valores que será possível colocar nesse vetor chamamos o **[4]** de índice, porem
quando temos um vetor com índice 4 não pense que é 1,2,3,4 na programação sempre começamos com o 0 ou seja é 0,1,2,3

## Aula 2
Vetores = Variáveis Compostas Homogenias unidimensionais

### Atribuição de valores em um vetor 
como vimos ao declarar um vetor determinamos a quantidade de índices dele, se você está achando que para atribuir valor a um vetor é só colocar o "nome" da variável e o valor está muito enganado não é só digitar idade=35
Para atribuir valor a um vetor temos que determinar em qual índice receberá o valor atribuído.
**Lembre-se o tamanho do vetor pode ser [4] ou seja ter 4 índices porem o primeiro índice será o 0**

### Exemplo
```
programa
{
    
  funcao inicio()
  {
    inteiro	idade[4]
    idade[0]=11
    idade[1]=25
    idade[2]=40
    idade[3]=30
    escreva("\n")
    escreva("\n\n")
  }
}
```
Veja ao atribui valor ao vetor de 4 índices tivemos q determina a posição de cada índice que iria receber o valor, da mesma forma se formos colocar o vetor dentro do comando leia por exemplo temos que determina em qual índice será colocado o valor, da mesma forma ao utilizar o comando escreva temos q determinar qual índice do vetor será que escrito

### Exemplo 
```
programa
{
    
  funcao inicio()
  {
    inteiro	idade[4]
    idade[0]=11
    idade[1]=25
    idade[2]=40
    idade[3]=30
    escreva(idade[0])
    escreva(idade[1])
    escreva(idade[2])
    escreva(idade[3])
    idade[0]50
    escreva("\n\n")
  }
}
```
No início do programa atribuímos o valor 11 no índice 0 do vetor idade e no final do programa atribuímos o valor 50 no mesmo índice, nesse caso perderemos o valor 11 assim como em uma variável simples 

### Atribuindo valores no vetor na declaração
```
programa
{
    
  funcao inicio()
  {
    inteiro	idade[4]={11,21,31,41}
    escreva("\n", idade[0])
    escreva("\n", idade[1])
    escreva("\n", idade[2])
    escreva("\n", idade[3])
    escreva("\n\n")
  }
}
```
Note que conforme a sequência da declaração de valores no vetor, foi na atribuição aos índices, porem nesse tipo de atribuição de valores você sempre será obrigado a determinar os valores de todos os índices 

### Atribuindo valores no vetor utilizando o para
Com o laço de repetição da estrutura para podemos colocar valores no vetor se o vetor tem 4 índices é só determinar um para com até o número de índices do vetor 
```
programa
{
    
  funcao inicio()
  {
    inteiro	idade[4], i // i de índice 
    para(i=0;i<4;i++) { //pode ser usado i<=3 
      escreva("\nIdade: ")
      leia(idade[i])
    }
    para(i=0;i<4;i++) {
      escreva("\n", idade[i])
    }
    escreva("\n")
    escreva("\n\n")
  }
}
```
note conforme é o valor atribuído na variável i, se torna o índice do vetor, ou seja, se você souber organizar o percurso e suas atribuições de valores você não perderá seus valores

## Aula 3
O tamanho do vetor

### O tamanho do vetor
no uso de vetores utilizamos muito a estrutura para e com ela percorremos todos os índices do vetor porem cada vetor pode ter um tamanho diferente para isso resolvermos isso na Biblioteca Util temos o comando **numero_elementos** esse comando mostra quantos “elementos”, ou seja, quantos índices tem o vetor

```
programa
{
    inclua biblioteca Util --> u
  funcao inicio()
  {
    inteiro	idade[5], ele
    para(ele=0;ele<u.numero_elementos(idade);ele++) {
      idade[ele]= sorteia(1,50)
    }
    para(ele=0;ele<u.numero_elementos(idade);ele++) {
      escreva("\n", idade[ele])
    }
    escreva("\n\n")
  }
}
```
veja por mais que mude o tamanho do vetor a o laço de repetição é o mesmo mudando somente o nome do vetor 

## Aula 4
Resolver os exercícios

### Resolva os exercícios 55, 56, 57 e 58
### [Veja a Lista de Exercícios Aqui](https://github.com/lex4brao/01-CURSO-DE-PROGRAMACAO-BASICA/tree/main/RESOLUCAO%20DOS%20EXERCICIOS)

## Aula 5

### Busca sequencial dentro de um vetor
imagine que você sabe que tem um determinado valor guardado em um dos índices(posição) de um vetor porem você não sabe em qual posição está aquele valor para isso fazemos podemos fazer uma busca dentro do vetor a mais simples dela é uma busca sequencial onde você coloca uma chave e o laço para percorre o valor do vetor e quando o valor que está na posição do vetor for igual ao da chave o programa mostra a posição q está o valor 

### Exemplo 
```
programa
{
    inclua biblioteca Util --> u
  funcao inicio()
  {
    inteiro	chave=5, vet[5]={3,8,4,5,9}, pos
    para(pos=0;pos<u.numero_elementos(vet);pos++) {
      se(chave==vet[pos]) {
        escreva("\nO valor ", chave, " está na posição [", pos, "]")
      }
    }
    escreva("\n\n")
  }
}
```
Porem esse método do exemplo é muito básico e simples caso não tenha encontrado o valor o programa não irá mostrar nada vamos ao segundo exemplo

### Exemplo 2

```
programa
{
    inclua biblioteca Util --> u
  funcao inicio()
  {
    inteiro	vet[20], chave, pos 
    logico	achei=falso
    para(pos=0;pos<u.numero_elementos(vet);pos++) {
      vet[pos]= sorteia(1,10)
    }
    escreva("\nQual o valor que você está procurando: ")
    leia(chave)
    para(pos=0;pos<u.numero_elementos(vet);pos++) {
      se(chave==vet[pos]) {
        escreva("\nO valor ", chave, " está na posição [", pos, "]")
        achei=verdadeiro
      }
    }
    se(nao(achei)) {
      escreva("\nO valor ", chave, " não se encontra no vetor")
    }
    escreva("\n\n")
  }
}
```
Caso você saiba q em seu vetor não existe uma repetição do valor buscado você pode usar o comando pare e encerrar o laço de repetição para

### Exemplo 3
```
   para(pos=0;pos<u.numero_elementos(vet);pos++) {
      se(chave==vet[pos]) {
        escreva("\nO valor ", chave, " está na posição [", pos, "]")
        pare
      }
    }
```

## Aula 6

### Contagem com vetores
Como vimos na aula passada como encontrar um valor dentro de um vetor, nós podemos também contabilizar isso vendo quantas vezes aquele mesmo valor se repete no vetor, ou quantos valores pares existem dentro do vetor ou quantos valores acima de 5 existem dentro do vetor existe uma infinidade de possibilidade de contabilizar assim como vimos nos laços de repetições
Veja um exemplo de um programa q mostra quantos valores pares tem dentro de um vetor e quantos valores maiores q 5 existem dentro desse mesmo vetor 

```
programa
{
    inclua biblioteca Util --> u
  funcao inicio()
  {
    inteiro	vet[20], chave, pos, pchave=0, par=0, m5=0
    logico	achei=falso
    para(pos=0;pos<u.numero_elementos(vet);pos++) {
      vet[pos]= sorteia(1,10)
    }
    escreva("\nQual valor você deseja encontrar: ")
    leia(chave)
    para(pos=0;pos<u.numero_elementos(vet);pos++) {
      se(vet[pos]==chave) {
        escreva("\nValor ", chave, " encontrado na posição [", pos, "]")
        pchave++
        achei=verdadeiro
      }
      se(vet[pos]%2==0) {
        par++
      }
      se(vet[pos]>5) {
        m5++
      }
    }
    se(nao(achei)) {
      escreva("\nO valor não foi encontrado no vetor")
    }senao {
      escreva("\nO valor foi encontrado ", pchave, " no vetor")
    }
    escreva("\nNo vetor tem ", par, " números pares")
    escreva("\nNo vetor tem ", m5, " números maiores que 5")
    escreva("\n\n")
  }
}
```

## Aula 7
### Totais em vetores
Ao meu ver esse conteúdo é bem parecido com os laços de repetições, mas vamos ver como fazer somatória com os elementos dos vetores

### Exemplo
```
programa
{
    inclua biblioteca Util --> u
  funcao inicio()
  {
    inteiro	vet[20], soma=0, pos
    para(pos=0;pos<u.numero_elementos(vet);pos++) {
      vet[pos]= sorteia(1,100)
    }
    para(pos=0;pos<u.numero_elementos(vet);pos++) {
      escreva(vet[pos]," - ")
      soma+=vet[pos]
    }
    escreva("\nA soma dos elementos do vetor é ", soma)
    escreva("\n\n")
  }
}
```
Podemos fazer para somar somente números pares ou impares ou a partir de um valor q determinamos e ao meu ver podemos simplificar esse código 

```
programa
{
    inclua biblioteca Util --> u
    inclua biblioteca Tipos --> t
  funcao inicio()
  {
    inteiro	vet[20], pos, s=0
    real	med
    para(pos=0;pos<u.numero_elementos(vet);pos++) {
      vet[pos]= sorteia(1,10)
      escreva(vet[pos], " - ")
      s+= vet[pos]
    }
    escreva("\nA soma dos elementos do vetor é ", s)
    escreva("\n\n")
  }
}
```

## Aula 8

### Maior e o menor valor do vetor
Para encontrar o maior e o menor valor de um vetor é basicamente igual quando fazemos o exercício de achar o mais velho e o mais novo no cadastro de amigos, fazemos isso usando uma estrutura condicional composta

### Exemplo
```
programa
{
    inclua biblioteca Util --> u
  funcao inicio()
  {
    inteiro	vet[10], p, maior=0, menor=0
    para(p=0;p<u.numero_elementos(vet);p++) {
      vet[p]= sorteia(1,10)
    }
    para(p=0;p<u.numero_elementos(vet);p++) {
      se(p==0) {
        maior=vet[p]
        menor=vet[p]
      }senao {
        se(vet[p]>maior) {
          maior=vet[p]
        }
        se(vet[p]<menor) {
          menor=vet[p]
        }
      }
    }
    escreva("\nO maior valor do vetor é ", maior)
    escreva("\nO menor valor do vetor é ", menor)
    escreva("\n\n")
  }
}
```
Também podemos após encontrar o maior e o menor valor de um vetor, podemos usar o sistema de busca sequencial como se o maior e o menor valor fossem uma chave na busca do vetor e saber em quais posições está o maior e o menor valor

## Aula 9
Bateria de exercícios utilizando vetores

### Resolva os exercícios 59, 60, 61, 62 e 63
### [Veja a Lista de Exercícios Aqui](https://github.com/lex4brao/01-CURSO-DE-PROGRAMACAO-BASICA/tree/main/RESOLUCAO%20DOS%20EXERCICIOS)

## Aula 10

### Matrizes - o vetor de vetor =P
Com os vetores, podemos guardar mais de um valor dentro de uma “variável”, ou seja, podemos guardar uma linha de valores dentro de um vetor de acordo com seu número de índices(posições)
Eu gosto de chamar Matriz o vetor de vetores pois temos a possibilidade de guardar valores em mais de uma linha de índices(posições)  ou seja

### Os vetores
Um vetor v[3] pode ter os valores [2,4,6], com as matrizes podemos adicionar linhas, ou seja, vetores abaixo

### As matrizes
Com uma matriz m[2][3] podemos colocar os valores:

[2,4,6]
[3,5,7]

Ou seja, com matrizes temos as "linhas" e as colunas, basicamente as colunas é como se fosse as posições dos vetores e as colunas é meio q um vetor embaixo do outro no caso acima a matriz tem [2] LINHAS e [3] COLUNAS e para atribuir valores é basicamente igual a posição dos vetores porem temos que "identificar" em qual linha e coluna será atribuído o valor 

m[0][0]=2
m[0][1]=4
m[0][2]=6

m[1][0]=3
m[1][1]=5
m[1][2]=7

com isso atribuímos os valores da matriz: 
                                          [2,4,6]
                                          [3,5,7]

## Aula 11
Atribuindo valores a uma matriz(Variável composta homogenia multidimensional)

### Para dentro de Para
Na atribuição de valores em um vetor é muito útil utilizar a estrutura para como percurso
No caso das matrizes utilizamos um para dentro de um para o para externo será as linhas e o para interno é para as colunas( as colunas é meio q as posições de um vetor) veja uma matriz de uma linha

### Exemplo 
```
programa
{
    
  funcao inicio()
  {
    inteiro	m[1][3], l, c
    para(l=0;l<1;l++) {
      para(c=0;c<3;c++) {
        m[l][c]= sorteia(1,10)
        escreva("\nM[",l,"][",c,"]", m[l][c])
      }
    }
    escreva("\n\n")
  }
}
```
teste esse código no seu portugol studio, agora vamos com uma matriz com mais linhas

### Exemplo 

```
programa
{
    
  funcao inicio()
  {
    inteiro	m[3][4], l, c
    para(l=0;l<3;l++) {
      para(c=0;c<4;c++) {
        m[l][c]= sorteia(1,9)
        escreva("  [",l,"][",c,"]= ", m[l][c]) //note q removi o \n para escrever os valores na coluna
      }
      escreva("\n") //o barra /n veio para depois q termina de preencher as colunas para pular as linhas
    }
    escreva("\n\n")
  }
}
```
Veja o resultado do console

```
  [0][0]= 2  [0][1]= 5  [0][2]= 9  [0][3]= 4
  [1][0]= 8  [1][1]= 8  [1][2]= 5  [1][3]= 3
  [2][0]= 2  [2][1]= 8  [2][2]= 6  [2][3]= 6

```
Note que os números que estão em [](chaves) são as posições da matriz linhas e coluna [L][C]   

## Aula 12
Ajuda com as matrizes

### O Tamanho da Matriz
Assim como nos vetores temos a ajuda da Biblioteca Util para saber o número de posições de um vetor com o comando numero_eletemos(), temos também o comando numero_colunas e numero_linhas, sendo assim esses comandos nos dá a possibilidade de alterar o tamanho da matriz, sem ter a necessidade de ter que fazer alteração no percurso(do número de repetições do "para")

### Exemplo
```
programa
{
    inclua biblioteca Util --> u
  funcao inicio()
  {
    inteiro	m[3][4], l, c
    para(l=0;l<u.numero_linhas(m);l++) {
      para(c=0;c<u.numero_colunas(m);c++) {
        m[l][c]= sorteia(1,10)
      }
    }

    para(l=0;l<u.numero_linhas(m);l++) {
      para(c=0;c<u.numero_colunas(m);c++) {
        escreva(m[l][c], "\t")
      }
      escreva("\n")
    }
    escreva("\n\n")
  }
}
```
Note que foi feito um percurso para colocar valores na matriz, e um percurso para escrever a matriz na tela, isso é para que você note q foi colocada uma \t(tabulação) na hora que escrever o valor para não bagunçar a matriz caso um valor tenha mais dígitos que outros e no final do laço de repetição do laço das colunas foi inserido um escreve("\n") isso é para pular de linha e ser mostrado como uma matriz se não pareceria um "vetor"...

## Aula 16

### Isolando elementos de uma matriz
Imagine que você deseja isolar uma coluna de uma matriz, se ao declarar uma matriz sabemos que é M[L][C] sabemos que o valor do índice da coluna será sempre o mesmo para isolar os valores de uma coluna seria basicamente o mesmo q ver os valores de um vetor porem no caso da coluna seria abstratamente falando o mesmo que um vetor em "PÉ"
ou seja, fazemos um percurso para e alteramos o valor da linha e fixamos o valor da coluna vamos ao exemplo 

### Exemplo 

```
programa
{
    inclua biblioteca Util --> u
  funcao inicio()
  {
    inteiro	m[3][4], l, c
    para(l=0;l<u.numero_linhas(m);l++) {
      para(c=0;c<u.numero_colunas(m);c++) {
        m[l][c]= sorteia(1,9)
      }
    }

    para(l=0;l<u.numero_linhas(m);l++) {
      escreva("\n", m[l][2])
    }
    escreva("\n\n")
  }
}
```
Para isolar uma coluna variamos o valor a linha e fixamos o valor da coluna vejo no código acima e o mesmo é feito para isolar a linha varia o valor da coluna e fixamos o valor da coluna, veja o exemplo para isolar a linha

### Exemplo 

```
programa
{
    inclua biblioteca Util --> u
  funcao inicio()
  {
    inteiro	m[3][4], l, c
    para(l=0;l<u.numero_linhas(m);l++) {
      para(c=0;c<u.numero_colunas(m);c++) {
        m[l][c]= sorteia(1,9)
      }
    }

    para(c=0;c<u.numero_colunas(m);c++) {
      escreva(m[2][c], "\t")
    }
    escreva("\n\n")
  }
}
```
  **SEMPRE QUE FOR ISOLAR A COLUNA VAREIA OS VALORES DA LINHA**
  **SEMPRE QUE FOR ISOLAR A LINHA VAREIA OS VALORES DA COLUNA**

Com isso você pode somar valores de uma linha, somar valores de uma coluna, saber o maior valor de uma linha ou o maior valor de uma coluna e fazer todas as mesmas contabilizações que fizemos com vetores 

## Aula 14
Bateria de exercícios utilizando matrizes

### Resolva os exercícios 64, 65, 66, 67 e 68
### [Veja a Lista de Exercícios Aqui](https://github.com/lex4brao/01-CURSO-DE-PROGRAMACAO-BASICA/tree/main/RESOLUCAO%20DOS%20EXERCICIOS)

## Aula 15
Os registros, o Portugol Studio infelizmente ainda não tem a possibilidade da utilização de registros porem vamos tentar entender esses conceitos

### REVISÃO - Básica
### Variáveis - Simples
cria um espaço na memória que suporta apenas um valor

### Vetor - Variáveis Compostas homogenias unidimensionais
cria um espaço na memória que suporta valores de acordo com sua quantidade de índices

### Matriz - Variáveis Compostas homogenias bidimensionais
cria um espaço na memória que suporta valores de acordo com a sua quantidade de "posições" sendo linhas e colunas 

  **Esses tipos de variáveis são Homogenias**

Elas só irão suportar valores de acordo com o seu tipo primitivo, se você declarar a variável como inteiro ela só suportará valores do tipo inteiro, se for do tipo real, cadeia, ou seja, só irá suportar valores de acordo com seu tipo

### Registos[listas ou Coleção] - Variável Composta Heterogenia 
Os registros é basicamente como se fosse um vetor que suporta valores de vários tipos primitivos, veja um exemplo conceitual

Imagine que vamos declarar uma variável(vetor) chamada funcionário
```
funcionário{3} = [nome, salário, idade]
```
Note que o REGISTRO recebeu 3 valores e esses valores cada um tem um tipo diferente o primeiro valor é uma cadeia, o segundo um número real, o tercio um número inteiro

**Obs.: nos registros cada valor não tem o nome de índice como nos vetores e sim CAMPOS**

### Exemplo 

```
registro funcionario[
  cadeia nome,
  real salario,
  inteiro idade
  ]

funcionario[nome]= José
funcionario[salario]=1950.65
funcionario[idade]=30

```

## Aula 16
Algumas técnicas adicionais

### Sortear valores sem repetir
em um grande projeto ter valores duplicados em um vetor ou matriz ou até mesmo em registro pode ser um problema, evitar a duplicação de dados, pode trazer eficiência em nossos códigos, ter integridade nos dados e até mesmo agilizar as operações dos programas então vamos analisar uma técnica onde antes de preencher o valor de um índice de um vetor analisamos os valores dos índices anteriores e isso pode até ser usado como uma validação de dados

Vamos usar um vetor como exemplo, porem para que tenhamos um maior controle no preenchimento do vetor, temos q utilizar a estrutura enquanto, pois a varredura da estrutura para é "automática" e com enquanto podemos ter o controle de só passar para próxima posição se o valor não for repetido

### Exemplo
```
    inteiro	vet[6], p=0, paux
    logico	repetido
    enquanto(p<u.numero_elementos(vet)) {
      vet[p]=sorteia(1,60)
      repetido=falso
      para(paux=0;paux<p;paux++) {
        se(vet[paux]==vet[p]) {
          repetido=verdadeiro
          pare
        }
      }
      se(nao(repetido)) {
        p++
      }
    }
```
### Entendendo a Lógica
Veja que com a estrutura enquanto o "p++" só acontecerá se o valor não for repetido, temos a variável p para as posições do vetor e a variável "paux"(posição auxiliar) que faz a varredura através do "para" verificando se não existe o mesmo valor nas posições anteriores e se já existe a variável repetido se torna verdadeira aonde não per permitirá q acrescente +1 na rival p onde não passará para próxima posição do vetor

  **Obs.: Note q esse código é um gerador de números para jogar na MEGASENA**

## Aula 17
Algumas técnicas adicionais

### Ordenando um vetor - Bubble-sort
A ordenação de vetores é muito importante dentro da programação, facilita a pesquisa e recuperação de dados, uma busca binária só acontece em valores ordenados, traz eficiência no código, agiliza as operações e reduz erros facilitando a manutenção

### O Bubble-sort
O bubble-sort(organização em bolha) é a maneira mais simples de se ordenar um vetor, fazendo uma varredura no vetor ou melhor duas varreduras (um para dentro de outro para)

É feita uma comparação do primeiro elemento do vetor com o segundo, se o segundo elemento do vetor for menor que o primeiro o valor do segundo elemento irá para uma variável auxiliar o valor do primeiro elemento irá para o segundo logo após o valor q está na variável auxiliar assumirá o valor do primeiro elemento do vetor aí novamente será feira a comparação do primeiro elemento, com o terceiro elemento e segue sequencialmente

Após percorrer todo o vetor comparando o primeiro elemento com os demais, passa-se a comparação do segundo elemento com os demais, logo após o terceiro e sequencialmente...

### Exemplo

```
 para(p=0;p<(u.numero_elementos(vet)-1);p++) {
   para(paux=p+1;paux<u.numero_elementos(vet);paux++) {
     se(vet[p]>vet[paux]) {
       aux=vet[p]
       vet[p]=vet[paux]
       vet[paux]=aux
     }
   }
 }
```
Veja que o "para" principal só vai até o penúltimo elemento do vetor, e o para secundário começa com a posição auxiliar "paux" sempre começa uma posição depois da posição principal!!

**A ordenação Bubble Sort pode ser crescente ou decrescente basta alterar o sinal da condicional SE**

OBS.: em questão de desempenho a o bubble-sort é a técnica menos recomendável a ser feita pela quantidade de verificações que é executada onde torna nosso programa lento "pesado", porém é a melhor técnica e a técnica mais simples para começar a entender o conceito de ordenação 

## Aula 18
Algumas técnicas adicionais

#### Busca Binária em vetores
A primeira coisa q temos q ter em mente é que a busca binária só será possível em um vetor **ORDENADO**, chamamos busca binária pois o vetor é divido em 2 partes para que isso seja possivel é necessário 3 variáveis auxiliarees: inicio, fim, meio
Inicialmente a variável "inicio" receberá o valor de 0, a variável "fim" o numero e indices do vetor -1 e a variavel "meio" dentro do laço de repetição fará o calculo do ((inicio+fim)/2)

Ao fazer a busca em um vetor **ordenado** com as 3 variáveis ele irá comparar valor que está na posição "meio", com o valor da busca caso o valor seja maior o "inicio" assumirá o valor "meio+1" aonde a busca novamente irá dividir essa nova parte em mais duas partes, caso o valor do que está na posição meio seja menor que o valor da busca a variavel "fim" assumirá o valor do "meio-1" e a busca irá dividir essa nova parte em duas partes e esse processo acontecerá enquanto a variavel "inicio" for <= a variavel "fim", acho o valor que está na posição meio seja igual o valor procurado o laço de repetição de busca irá ser parado imediatamente

#### Exemplo 
```
inteiro	chave, ini=0, fim=(	u.numero_elementos(vet)-1), meio=0
    escreva("\n\nDigite o numero que deseja encontrar:  ")
    leia(chave)
    enquanto(ini<=fim) {
      meio=(ini+fim)/2
      se(vet[meio]==chave) {
        pare
      }senao se(vet[meio]<chave) {
        ini=meio+1
      }senao {
        fim=meio-1
      }
    }
    se(vet[meio]==chave) {
      escreva("\nO numero ", chave, " está na posição ", meio)
    }senao {
      escreva("\nNão encontrei o valor ", chave)
    }
```
Note que a busca binária vai sempre segmentando o vetor em duas partes ou seja ela divide o meio ao meio e se necessário o meio do meio também é dividido ao meio, isso ocorre porque a divisão por variáveis do tipo inteiro sempre será um resultado do tipo inteiro ou seja se o resultado dá divisão for 4,5 a variável meio irá assumir o valor 4

Obs.: O processo de busca binária é muito mais rápido que a busca sequencial principalmente se a chave se encontra no final do vetor porem sua desvantagem é que se o vetor não estiver ordenado ela não irá funcionar


### [Voltar](https://github.com/lex4brao/01.CURSOS.E.ESTUDOS/blob/main/README.md)

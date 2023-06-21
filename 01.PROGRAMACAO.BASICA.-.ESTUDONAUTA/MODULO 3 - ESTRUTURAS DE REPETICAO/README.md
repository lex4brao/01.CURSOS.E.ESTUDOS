# MÓDULO 3 - ESTRUTURAS DE REPETICAO

## Aula 0

### As estruturas de repetição

## Aula 1

### Estrutura Enquanto [while]

A estrutura enquanto é uma estrutura de repetição com teste lógico no início, ou seja, é uma estrutura que repete um bloco de comandos e toda vez q ela vai iniciar o bloco de comandos ela faz um teste lógico no seu inicio

## Aula 2

### Estrutura Enquanto [while]

Para entendermos na pratica vamos desenvolver um contador no Portugol Studio, ou seja, vamos fazer um contator q mostre a contagem de 1 a 10 na tela porem utilizaremos 10 escreva e sim a estrutura enquanto

### Exemplo

```
programa
{

  funcao inicio()
  {
    inteiro	cont = 0
    enquanto(cont <=10) {
      escreva("\n", cont)
      cont++
    }
    escreva("\n\n")
  }
}
```

Note que utilizamos uma variável para o contador e utilizamos o operador de atribuição para que cada vez que fosse executado o bloco de comandos da estrutura enquanto fosse adicionado mais 1 na variável contador

### Resolva os exercícios 29, 30, 31
### [Veja a Lista de Exercícios Aqui](https://github.com/lex4brao/01-CURSO-DE-PROGRAMACAO-BASICA/tree/main/RESOLUCAO%20DOS%20EXERCICIOS)

## Aula 3

### Lendo valores dentro da estrutura de repetição (laço)

Veja um exemplo de a leitura de uma variável dentro de um laço de repetição

### Exemplo

Veja o exemplo abaixo do que é uma leitura de uma variável dentro de uma repetição

```
programa
{

  funcao inicio()
  {
    inteiro	cont=0, n
    enquanto(cont<=4) {
      escreva("\nDigite um numero")
      escreva("\n>> ")
      leia(n)
      cont ++
    }
    escreva("\n")
    escreva("\n\n")
  }
}
```

Só que isso nos traz um problema uma variável só pode assumir um valor por vez ou seja cada vez que o valor n é lido novamente o seu valor anterior é apagado

## Aula 4
Estruturas de repetição também pode ser chamado de laços e laços são os comandos executados, são variáveis que são lidos dentro de uma estrutura de repetição, ou seja, um laço

### Executando operações dentro do laço
Como disse na aula anterior quando uma variável recebe um novo valor seu valor é apagado e com isso podemos fazer operações dentro do laço para q essas informações não sejam perdidas

### Exemplo
Veja o exemplo de uma operação de adição dentro do laço de repetição aonde não importa os dados que serão perdidos mais sim a somatória dos valores digitados

```
programa
{

  funcao inicio()
  {
    inteiro	c, n, s
    c = 1
    s = 0
    enquanto(c<=4) {
      escreva("\nDigite ", c, "º número :")
      escreva("\n>>> ")
      leia(n)
      s = s+n
      c++
    }
    escreva("\nO valor da soma dos números digitados é ", s)
    escreva("\n\n")
  }
}

```

Note que não é porque perdemos os valores digitados na variável "n" anteriormente isso não significa que o programa não tem utilidade, estamos começando e veremos muitos outros laços e formas e resolver problemas como esse de perder o valor digitado pela variável e mesmo assim utilizando em uma somatória como o exemplo assim

### Exemplo
Veja o exemplo de utilizar uma variável, para receber uma informação outra variável para conseguirmos uma somatória e ainda assim conseguir no final a média dos valores digitados

```
programa
{

  funcao inicio()
  {
    inteiro	c=1, n, s=0, tot, med
    escreva("\nQuantos valores você deseja digitar ")
    escreva("\n>> ")
    leia(tot)
    enquanto(c<=tot) {
      escreva("\nDigite o ", c, " numero")
      escreva("\n>> ")
      leia(n)
      s=s+n
      c++
    }
    med=s/tot
    escreva("\nA soma dos valores digitados é ", s)
    escreva("\nA média dos valores digitados é ", med)
    escreva("\n\n")
  }
}
```

### Resolva os exercícios 32 e 33 
### [Veja a Lista de Exercícios Aqui](https://github.com/lex4brao/01-CURSO-DE-PROGRAMACAO-BASICA/tree/main/RESOLUCAO%20DOS%20EXERCICIOS)

## Aula 5

### Testes de mesa no Portugol Studio

## Aula 6
Nas aulas passadas vimos que pelo laço de repetição poderíamos usar operações para somar valores recebidos e perdidos de uma variável logo após vemos que poderemos usas essa operação para obter a medias dos valores inseridos

### Utilizando o Laço de Repetição para contar elementos de categorias
Lembra do exercício 32 onde fizemos a somatória dos números pares e dos números impares, ou seja, categorizamos os tipos de números porem essa situação pode ser feita para saber quantos homens e quantas mulheres existem em um grupo de pessoas.

### Exemplo
Veja o exemplo de um programa para contar quantos homens e quantas mulheres estão em um grupo de 5 pessoas

```
programa
{
  funcao inicio()
  {
    inteiro	c=1, ch=0, cm=0
    caracter	sexo
    escreva("\n----------------------------------")
    escreva("\n Contador de Homens e Mulheres")
    escreva("\n----------------------------------")
    enquanto(c<=5) {
      escreva("\nDigite o sexo da ", c, " pessoa")
      escreva("\nDigite [H/M]>>> ")
      leia(sexo)
      se(sexo=='h' ou sexo=='H') {
        ch=ch+1
      }senao se(sexo=='m' ou sexo=='M') {
        cm=cm+1
      }
      c++
    }
    escreva("\nForam cadastrados ", ch, " homens")
    escreva("\nForam cadastradas ", cm, " mulheres")
    escreva("\n\n")
  }
}

```

### Resolva os exercícios 34, 35, 36 
### [Veja a Lista de Exercícios Aqui](https://github.com/lex4brao/01-CURSO-DE-PROGRAMACAO-BASICA/tree/main/RESOLUCAO%20DOS%20EXERCICIOS)

## Aula 7

### Utilizando laços de repetição para encontrar o maior e o menor valor
Assim como utilizamos os laços de repetição para podermos categorizar e contar elementos das categorias, nós também podemos utilizar os laços de repetição para encontrarmos o maior e o menor valores, em um cadastro acharmos quem é mais velho e ou qual funcionário tem o maior salário

### O primeiro número recebido
A partir do primeiro cadastro ou o primeiro número recebido, ele tanto será o maior numero quanto o menor número pois ainda não existe nem um valor menor que ele e nem um número maior que ele, vamos ao código como exemplo

### Exemplo
```
programa
{
  inclua biblioteca Util --> u  
  funcao inicio()
  {
    inteiro	c=1, sort=0, maior=0, menor=0
    escreva("\nIrei sortear 5 valores")
    escreva("\nSorteando ...  ")
    enquanto(c<=2) {
      sort = u.sorteia(1,100)
      escreva(sort, " - ")
      se(c==1) {
        maior = sort
        menor = sort
      } senao {
        se(maior>= sort) {
          maior = sort
        }
        se(menor <= sort) {
          menor = sort
        }
      }
    c++
    }
    escreva("\nO maior numero sorteado foi ", maior)
    escreva("\nO menor número sorteado foi ", menor)
    escreva("\n\n")
  }
}
```

Note que quando o contador se iniciou valendo 1, tanto o maior quando o menor valore recebem o valor do sorteio pois ambos valiam zero e não tinham paramentos para receberem nem valores menores nem maiores, a partir do valor inicial é possível saber se o valor do próximo sorteio será maior ou menor do valor do primeiro sorteio

### Resolva os exercícios 37 e 38
### [Veja a Lista de Exercícios Aqui](https://github.com/lex4brao/01-CURSO-DE-PROGRAMACAO-BASICA/tree/main/RESOLUCAO%20DOS%20EXERCICIOS)

## Aula 8

### Repetições com flag
Até agora utilizamos os laços de repetições utilizando contadores ou determinávamos a quantidade quando perguntávamos ao usuário, fosse um programa de cadastro de pessoas e fosse determinado 5 cadastros porem se na hora dos cadastros aumentasse mais 5 cadastros para não termos esse problema utilizamos as flag dentro do laço de repetição, vamos ao exemplo

### Exemplo
veja no exemplo que é criado uma variável resp para servir de resposta e essa resposta é nossa flag 
```
programa
{
    
  funcao inicio()
  {
    caracter	resp=' '
    inteiro	id, soma=0
    enquanto(resp!='n') {
      escreva("\nDigite uma a idade")
      escreva("\n>>> ")
      leia(id)
      soma += id
      escreva("\nDeseja continuar? [s/n]")
      leia(resp)
    }
    escreva("\nA soma das idades é ", soma)
    escreva("\n\n")
  }
} 
``` 
Porem esse tipo de flag ainda não é uma forma muito correta de ser feita pois já temos q atribuir um valor na declaração da variável e pegando o exemplo assim de referência se o usuário digitar 'N' em maiúsculo o programa mesmo assim irá continuar então vamos continuar assim para entendermos a linha de raciocino com flags porem aprenderemos formais mais corretas e mais bonitas de se escrever um programa

### Resolva os exercícios 39 e 40
### [Veja a Lista de Exercícios Aqui](https://github.com/lex4brao/01-CURSO-DE-PROGRAMACAO-BASICA/tree/main/RESOLUCAO%20DOS%20EXERCICIOS)

## Aula 9

### Repetição com interrupções
quando usamos a estrutura de repetição enquanto ela só vai ser executada enquanto a condição for verdadeira se colocarmos no enquanto uma condição q sempre for verdadeira isso ocasionará em um looping infinito.
Porem existe o comando pare o mesmo que utilizamos dentro da estrutura escolha caso, e colocarmos o comando pare dentro de uma estrutura condicional e a partir do momento que o comando pare é executado ele interrompe o laço de repetição mesmo que existe comandos a serem executados dentro do laço após o pare

### Exemplo 
Veja no exemplo q a condição da estrutura enquanto está fixada como verdadeira causando um looping infinito e a partir do momento que o usuário de digita acabou no nome o comando pare é acionado finalizando todo o laço de repetição mesmo que exista procedimentos dentro do laço após o comando pare

```
programa
{
    
  funcao inicio()
  {
    cadeia nome
    inteiro	id
    enquanto(verdadeiro) {
      escreva("\nNome: ")
      leia(nome)
      se(nome=="ACABOU" ou nome=="acabou") {
        pare
      }
      escreva("Idade: ")
      leia(id)
    }
    escreva("\nO usuário finalizou o programa")
    escreva("\n\n")
  }
}
```

Note que esse caso podemos ter um controle de parar a repetição do laço a partir dos momentos que determinamos ou achamos apropriados 

### Resolva os exercícios 41 e 42
### [Veja a Lista de Exercícios Aqui](https://github.com/lex4brao/01-CURSO-DE-PROGRAMACAO-BASICA/tree/main/RESOLUCAO%20DOS%20EXERCICIOS)

## Aula 10
Estrutura de repetição com teste lógico no final, na estrutura enquanto o teste lógico é feito no início do laço de repetição 

### Estrutura Faça Enquanto 
Melhor falando é  o laço de repetição será executado enquanto a condição for verdadeira porem a condição do enquanto só será verificada após o laço já ter sido executado uma vez, essa estrutura é muito similar a estrutura enquanto porem é uma ferramenta a mais que teremos nas mãos para criar nossos programas, sendo assim poderemos escolher quando é melhor usar uma ou outra estrutura 

### Exemplo
Veja que nessa estrutura não é necessário iniciar a variável resp(resposta) com o valor de 's'(sim) para forçar a execução do laço de repetição e nesse caso também não é necessário usar uma estrutura condicional "se" para usar o comando pare para forçar o laço de repetição

```
programa
{
    
  funcao inicio()
  {
    inteiro n
    caracter	resp
    faca {
      escreva("\nDigite um numero: ")
      leia(n)

      escreva("\nDeseja continuar? [S/N]: ")
      leia(resp)
    } enquanto(resp=='S' ou resp=='s' )
    escreva("\n\n")
  }
}
```

## Aula 11
Resolver exercícios utilizando a estrutura faça enquanto

### Resolva os exercícios 43, 44 e 45
### [Veja a Lista de Exercícios Aqui](https://github.com/lex4brao/01-CURSO-DE-PROGRAMACAO-BASICA/tree/main/RESOLUCAO%20DOS%20EXERCICIOS)

## Aula 12
Repetição com uma variável de controle, 
Na maioria das vezes que utilizamos a estrutura enquanto utilizávamos um contado para controlar quantas repetições seria feita na estrutura enquanto, normalmente utilizamos uma variável c como um contado e o c++ para incrementar + 1 no valor da variável

```
programa
{
    
  funcao inicio()
  {
    inteiro	c=1
    faca {
      escreva("\n", c)
      c++
    } enquanto(c<=4)
  }
}
```
note que precisamos atribuir valor a variável c, colocar a operação de incremento c++ e o enquanto c<=4, ou seja temos 3 comandos chaves para fazer o laço de repetição funcionar corretamente

### Estrutura de repetição PARA [FOR]
Na estrutura PARA pegamos os 3 comandos chaves para o laço de repetição funcionar corretamente e colocamos isso em apenas uma linha de comando separando os comandos chaves por ;(ponto e vírgula)
Ou seja (c=1,c<=4,c++), note que segue a mesma sequência da estrutura enquanto
1º atribuir a valor 
2º condição do laço de repetição
3º operação de incremento na variável de controle

### Exemplo
Veja um contador utilizando a estrutura para igual fizemos utilizando a estrutura enquanto
```
programa
{
    
  funcao inicio()
  {
    inteiro	c
    para(c=1;c<=10;c++) {
      escreva("\n", c)
    }
  }
}
```
Note como a estrutura PARA simplifica e resume bastante nosso código e seu comportamento é o mesmo porem fica a seu critério utilizar a estrutura ENQUANTO
Porem a estrutura para é indicara para sempre q houver um limitador ou uma variável de controle em outros caso é melhor utilizar o FAÇA ENQUANTO ou o ENQUANTO

### Exemplo 2
veja um gerador de tabuadas utilizando a estrutura para 
```
programa
{
    
  funcao inicio()
  {
    inteiro tab
    escreva("\nVocê deseja ver a tabuada de qual numero: ")
    leia(tab)
    para(inteiro c=0;c<=10;c++) {
      escreva("\n", c, " * ", tab, " = ", c*tab)
    }
    escreva("\n\nFim da Tabuada")
    escreva("\n\n")
  }
}
```

Veja que é possível declara o tipo primitivo da variável e seu valor dentro da estrutura para

NOTE que a estrutura PARA não é muito útil para quando precisamos fazer testes lógicos no final

## Aula 13
Resolver exercícios utilizando a estrutura PARA

### Resolva os exercícios 46, 47, 48 e 49
### [Veja a Lista de Exercícios Aqui](https://github.com/lex4brao/01-CURSO-DE-PROGRAMACAO-BASICA/tree/main/RESOLUCAO%20DOS%20EXERCICIOS)

## Aula 14
Laços de repetições aninhadas, praticamente é um laço dentro do outro ou até mesmo uma estrutura repetição dentro da outra podendo ser um ENQUANTO dentro de um PARA que pode ser dentro de um FAÇA ENQUANTO
É bem similar as  estruturas de condições aninhadas do SE, SENAO, SENAO-SE

### PARA dentro de um PARA
laços de repetições é a uma repetição dentro da outra, ou seja, quando a estrutura de repetição de dentro terminar e voltar para estrutura de repetição de fora a estrutura de repetição interna recomeçará novamente igual o estado inicial e a repetição continuarão até a condição da estrutura de fora for resolvida

### Exemplo
No exemplo será escrito coordenadas x,y note q o y volta a seu estado inicial a cada nova repetição do x

```
programa
{
    
  funcao inicio()
  {
    inteiro	x, y
    para(x=0;x<=2;x++) {
      para(y=1;y<=3;y++) {
        escreva("\n[", x, " , ", y, "]")
      }
      escreva("\n")
    }
  }
}
```
Veja os resultados e note que y volta ao valor inicial 1 em cada nova repetição do valor de x

```

[0 , 1]
[0 , 2]
[0 , 3]

[1 , 1]
[1 , 2]
[1 , 3]

[2 , 1]
[2 , 2]
[2 , 3]

```
Note q no final de cada laço de repetição de y foi coloca uma linha para espaço e quando o laço de x se inicia novamente y volta ao seu estado inicial que é 1

### Resolva os exercícios 50, 51, e 52
### [Veja a Lista de Exercícios Aqui](https://github.com/lex4brao/01-CURSO-DE-PROGRAMACAO-BASICA/tree/main/RESOLUCAO%20DOS%20EXERCICIOS)


## Aula 15

### Validação de dados com laços de repetições
Para que você entenda sobre validação de dados você precisa entender bem o conceito de laços de repetições aninhados

### Validação com FAÇA ENQUANTO
é muito comum o usuário inserir dados incorretos em nossos programas por isso utilizamos a validação de dados normalmente é feita com a estrutura FAÇA ENQUANTO

### Exemplo
```
programa
{
    
  funcao inicio()
  {
    caracter	sx
    faca {
      escreva("\nSexo [H/M]: ")
      leia(sx)
    } enquanto(nao(sx=='M' ou sx=='H'))    
  }
}

```
note que o laço de repetição irá se repetir enquanto as condições de sexo sx 'H' ou 'M' NÃO forem digitadas corretamente

### Validação com mensagem de erro
Normalmente colocamos mensagens nos programas para instruir o usuário como ele deverá inserir os dados, quando algo é inserido errado podemos colocar mensagens de erro

```
programa
{
    
  funcao inicio()
  {
    inteiro id
    enquanto(verdadeiro) {
      escreva("\nIdade: ")
      leia(id)
      se(id>=0 e id<=150) {
        pare
      } senao {
        escreva("ERRO!!! - A idade deve ser entre 0 a 150 anos")
      }

    }
  }
}
```
Ou seja, o laço de repetição só irá para caso a idade atender a idade entre 0 até 150 anos

### ENQUANTO DENTRO DO PARA
Imagina a situação de cadastro de 5 pessoas onde só se cadastra a idade

```
programa
{
    
  funcao inicio()
  {
    inteiro	c, id
    para(c=1;c<=5;c++) {
      escreva("\n", c, "º Cadastro")
      escreva("\n------------------")
      faca {
        escreva("\nDigite a idade: ")
        leia(id)
        se(nao(id>=0 e id<=150)) {
          escreva("ERRO!!! - A idade de ver entre 0 até 150 anos")
        }
      } enquanto(nao(id>=0 e id<=150))

    }
    escreva("\n")
    escreva("\n\n")
  }
}
```
Note que enquanto o usuário não digitar a idade corretamente o programa irá ficar repetindo a mensagem de erro até e não seguirá para o próximo cadastro

### Resolva os exercícios 53 e 54
### [Veja a Lista de Exercícios Aqui](https://github.com/lex4brao/01-CURSO-DE-PROGRAMACAO-BASICA/tree/main/RESOLUCAO%20DOS%20EXERCICIOS)


### [Voltar](https://github.com/lex4brao/01.CURSOS.E.ESTUDOS/blob/main/README.md)

# Exercicíos

## Lista de Exercícios Aula 13

1. Faça um Programa que mostre a mensagem "Alo mundo" na tela.

2. Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].

3. Faça um Programa que peça dois números e imprima a soma.

4. Faça um Programa que peça as 4 notas bimestrais e mostre a média.

5. Faça um Programa que converta metros para centímetros.

6. Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.

7. Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.

8. Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.

9. Faça um Programa que peça a temperatura em graus Farenheit, transforme e mostre a temperatura em graus Celsius.
  - Formula: C = (5 * (F-32) / 9).

10.Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Farenheit.
  - Formula: F =1,8*C + 32
 
11.Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
  a. o produto do dobro do primeiro com metade do segundo .
  b. a soma do triplo do primeiro com o terceiro.
  c. o terceiro elevado ao cubo.

12.Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58

13. Faça um programa que pergunte  quanto você ganha por hora e o numero de horas trabalhadas no mês. Calcule e mostre o total do salário recebido no mês. Sabendo-se que são descontados 11% para Imposto de Renda, 8% para o INSS, 5% sindicado. Faça um programa que nos de:
  a. Quanto pagou de INSS
  b. Quanto pagou de Sindicato
  c. Salário Liquido


14. Faça um programa que peça o tamanho de um arquivo para download em MB, e a velocidade de um link de Internet(Mbps). Calcule e infome o tempo aproximado em minutos para download do arquivo 

## Lista de Exercícios Aula 14 e 15

15. Faça um Programa que peça dois números e imprima o maior deles.

16. Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.

17. Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
    obs: use o .IgnoreCase para comparação na String

18. Faça um Programa que verifique se uma letra digitada é vogal ou consoante.

19. Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:
  - A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
  - A mensagem "Reprovado", se a média for menor do que sete;
  - A mensagem "Aprovado com Distinção", se a média for igual a dez.

20.	Faça um Programa que leia três números e mostre o maior deles.

21.	Faça um Programa que leia três números e mostre o maior e o menor deles.

22.	Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.

23.	Faça um Programa que leia três números e mostre-os em ordem decrescente.

24.	Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.

25.	As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contraram para desenvolver o programa que calculará os reajustes.
o	Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
  - salários até R$ 280,00 (incluindo) : aumento de 20%
  - salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
  - salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
  - salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser realizado, informe na tela:
  - o salário antes do reajuste;
  - o percentual de aumento aplicado;
  - o valor do aumento;
  - o novo salário, após o aumento.

26.	Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda, que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é a empresa que deposita). O Salário Líquido corresponde ao Salário Bruto menos os descontos. O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
  - Desconto do IR:
  - Salário Bruto até 900 (inclusive) - isento
  - Salário Bruto até 1500 (inclusive) - desconto de 5%
  - Salário Bruto até 2500 (inclusive) - desconto de 10%
  - Salário Bruto acima de 2500 - desconto de 20% 
Imprima na tela as informações, dispostas conforme o exemplo abaixo. No exemplo o valor da hora é 5 e a quantidade de hora é 220.

```
                  Salário Bruto: (5 * 220) : R$ 1100,00
                  (-) IR (5%) : R$ 55,00
                  (-) INSS ( 10%) : R$ 110,00
                  FGTS (11%) : R$ 121,00
                  Total de descontos : R$ 165,00
                  Salário Liquido : R$ 935,00
```

27.	Faça um Programa que leia um número e exiba o dia correspondente da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido.

28.	Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre, e calcule a sua média. A atribuição de conceitos obedece à tabela abaixo:
  Média de Aproveitamento Conceito
    - Entre 9.0 e 10.0 A
    - Entre 7.5 e 9.0 B
    - Entre 6.0 e 7.5 C
    - Entre 4.0 e 6.0 D
    - Entre 4.0 e zero E
O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e a mensagem “APROVADO” se o conceito for A, B ou C ou “REPROVADO” se o conceito for D ou E.

29.	Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem ser um triângulo. Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.
o	Dicas:
  - Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
  - Triângulo Equilátero: três lados iguais;
  - Triângulo Isósceles: quaisquer dois lados iguais;
  - Triângulo Escaleno: três lados diferentes;
 
30.	Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2 + bx + c. O programa deverá pedir os valores de a, b e c e fazer as consistências, informando ao usuário nas seguintes situações:
  a.	Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o programa não deve fazer pedir os demais valores, sendo encerrado;
  b.	Se o delta calculado for negativo, a equação não possui raizes reais. Informe ao usuário e encerre o programa;
  c.	Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe-a ao usuário;
  d.	Se o delta for positivo, a equação possui duas raiz reais; informe-as ao usuário;

31.	Faça um Programa que peça um número correspondente a um determinado ano e em seguida informe se este ano é ou não bissexto.

32.	Faça um Programa que peça um numero inteiro e determine se ele é par ou impar.

33.	Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação ele deseja realizar. O resultado da operação deve ser acompanhado de uma frase que diga se o número é:
  - par ou ímpar;
  - positivo ou negativo;
  - inteiro ou decimal.

34.	Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
  - "Telefonou para a vítima?"
  - "Esteve no local do crime?"
  - "Mora perto da vítima?"
  - "Devia para a vítima?"
  - "Já trabalhou com a vítima?"

O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".


35.	Um posto está vendendo combustíveis com a seguinte tabela de descontos:
  Álcool:
    - até 20 litros, desconto de 3% por litro
    - acima de 20 litros, desconto de 5% por litro 
  Gasolina:
    - até 20 litros, desconto de 4% por litro
    - acima de 20 litros, desconto de 6% por litro 
  
Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível (codificado da seguinte forma: A-álcool, G- gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço do litro do álcool é R$ 1,90.

36.	Uma fruteira está vendendo frutas com a seguinte tabela de preços:
  - Até 5 Kg
    - Morango R$ 2,50 Kg 
    - Maçã R$ 1,80 Kg
  - Acima de 5 Kg
    - Morango R$ 2,20 Kg
    - Maçã R$ 1,50 por Kg
    
Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.
 
37.	O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira:
  - Até 5 Kg 
    - File Duplo R$ 4,90 por Kg
    - Alcatra R$ 5,90 por Kg
    - Picanha R$ 6,90 por Kg

  - Acima de 5 Kg
    - File Duplo R$ 5,80 por Kg
    - Alcatra R$ 6,80 por Kg
    - Picanha R$ 7,80 por Kg

Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos de carne da promoção, porém não há limites para a quantidade de carne por cliente. Se compra for feita no cartão Tabajara o cliente receberá ainda um desconto de 5% sobre o total a compra. Escreva um programa que peça o tipo e a quantidade de carne comprada pelo usuário e gere um cupom fiscal, contendo as informações da compra: tipo e quantidade de carne, preço total, tipo de pagamento, valor do desconto e valor a pagar.

38.	Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao usuário a valor do saque e depois informar quantas notas de cada valor serão fornecidas. As notas disponíveis serão as de 2, 5, 10, 20, 50 e 100 reais. O valor mínimo é de 10 reais e o máximo de 600 reais. O programa não deve se preocupar com a quantidade de notas existentes na máquina.
  - Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas notas de 100, uma nota de 50, uma nota de 5 e uma nota de 2;
  
  - Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece três notas de 100, uma nota de 50, quatro notas de 10, uma nota de 5 e quatro notas de 2.

## Lista de Exercícios Aula 16 e 17

39.	Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.

40.	Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações.

41.	Faça um programa que leia e valide as seguintes informações:
  a.	Nome: maior que 3 caracteres;
  b.	Idade: entre 0 e 150;
  c.	Salário: maior que zero;
  d.	Sexo: 'f' ou 'm';
  e.	Estado Civil: 's', 'c', 'v', 'd';

42.	Supondo que a população de um país A seja da ordem de 80. 000 habitantes com uma taxa anual de crescimento de 3% e que a população de B seja 200.000 habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule e escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.

43.	Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais. Valide a entrada e permita repetir a operação.

44.	Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro. Depois modifique o programa para que ele mostre os números um ao lado do outro.

45.	Faça um programa que leia 5 números e informe o maior número.

46.	Faça um programa que leia 5 números e informe a soma e a média dos números.

47.	Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.

48.	Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido por eles.

49.	Altere o programa anterior para mostrar no final a soma dos números.

50.	Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:
```
    Tabuada de 5:
    5 X 1 = 5
    5 X 2 = 10
    ...
    5 X 10 = 50
```

51.	Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro número elevado ao segundo número. Não utilize a função de potência da linguagem.

52.	Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de números pares e a quantidade de números impares.

53.	A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,... Faça um programa capaz de gerar a série até o n−ésimo termo.

54.	A série de Fibonacci é formada pela seqüência 0,1,1,2,3,5,8,13,21,34,55,... Faça um programa que gere a série até que o valor seja maior que 500.

55.	Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120

56.	Faça um programa que peça um número inteiro e determine se ele é ou não um número primo. Um número primo é aquele que é divisível somente por ele mesmo e por 1.

57.	Faça um programa que calcule o mostre a média aritmética de N notas.

58.	Faça um programa que peça para n pessoas a sua idade, ao final o programa devera verificar se a média de idade da turma varia entre 0 e 25,26 e 60 e maior que 60; e então, dizer se a turma é jovem, adulta ou idosa, conforme a média calculada.

59.	Faça um programa que calcule o número médio de alunos por turma. Para isto, peça a quantidade de turmas e a quantidade de alunos para cada turma. As turmas não podem ter mais de 40 alunos.

60.	Faça um programa que calcule o valor total investido por um colecionador em sua coleção de CDs e o valor médio gasto em cada um deles. O usuário deverá informar a quantidade de CDs e o valor para em cada um.

61.	O Sr. Manoel Joaquim possui uma grande loja de artigos de R$ 1,99, com cerca de 10 caixas. Para agilizar o cálculo de quanto cada cliente deve pagar ele desenvolveu um tabela que contém o número de itens que o cliente comprou e ao lado o valor da conta. Desta forma a atendente do caixa precisa apenas contar quantos itens o cliente está levando e olhar na tabela de preços. Você foi contratado para desenvolver o programa que monta esta tabela de preços, que conterá os preços de 1 até 50 produtos, conforme o exemplo abaixo:
```
Lojas Quase Dois - Tabela de preços
1 - R$ 1.99 
2 - R$ 3.98 
... 
50 - R$ 99.50
```
62.	O Sr. Manoel Joaquim acaba de adquirir uma panificadora e pretende  implantar a metodologia da tabelinha, que já é um sucesso na sua loja de 1,99. Você foi contratado para desenvolver o programa que monta a tabela de preços de pães, de 1 até 50 pães, a partir do preço do pão informado pelo usuário, conforme o exemplo abaixo:

``` 
Preço do pão: R$ 0.18 
 Panificadora Pão de Ontem - Tabela de preços
 1 - R$ 0.18 
 2 - R$ 0.36 
 ... 
 50 - R$ 9.00
```

63.	O Sr. Manoel Joaquim expandiu seus negócios para além dos negócios de 1,99 e agora possui uma loja de conveniências. Faça um programa que implemente uma caixa registradora rudimentar. O programa deverá receber um número desconhecido de valores referentes aos preços das mercadorias. Um valor zero deve ser informado pelo operador para indicar o final da compra. O programa deve então mostrar o total da compra e perguntar o valor em dinheiro que o cliente forneceu, para então calcular e mostrar o valor do troco. Após esta operação, o programa deverá voltar ao ponto inicial, para registrar a próxima compra. A saída deve ser conforme o exemplo abaixo:

```
Lojas Tabajara 
  Produto 1: R$ 2.20 
  Produto 2: R$ 5.80 
  Produto 3: R$ 0 
  Total: R$ 9.00 
  Dinheiro: R$ 20.00 
  Troco: R$ 11.00 
  ...
```

64.	Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120. A saída deve ser conforme o exemplo abaixo:
```
Fatorial de: 5 
5! = 5 . 4 . 3 . 2 . 1 = 120

```
65.	O Departamento Estadual de Meteorologia lhe contratou para desenvolver um programa que leia as um conjunto indeterminado de temperaturas, e informe ao final a menor e a maior temperaturas informadas, bem como a média das temperaturas.

66.	Os números primos possuem várias aplicações dentro da Computação, por exemplo na Criptografia. Um número primo é aquele que é divisível apenas por um e por ele mesmo. Faça um programa que peça um número inteiro e determine se ele é ou não um número primo.

67.	Encontrar números primos é uma tarefa difícil. Faça um programa que gera uma lista dos números primos existentes entre 1 e um número inteiro informado pelo usuário.

68.	Desenvolva um programa que faça a tabuada de um número qualquer inteiro que será digitado pelo usuário, mas a tabuada não deve necessariamente iniciar em 1 e terminar em 10, o valor inicial e final devem ser informados também pelo usuário, conforme exemplo abaixo:
```
Montar a tabuada de: 5 
Começar por: 4 
Terminar em: 7 
Vou montar a tabuada de 5 começando em 4 e terminando em 7: 
5 X 4 = 20 
5 X 5 = 25 
5 X 6 = 30 
5 X 7 = 35
```
Obs: Você deve verificar se o usuário não digitou o final menor que o inicial.

69.	Um funcionário de uma empresa recebe aumento salarial anualmente: Sabe-se que:
  - Esse funcionário foi contratado em 1995, com salário inicial de R$ 1.000,00;
  - Em 1996 recebeu aumento de 1,5% sobre seu salário inicial;
  -	A partir de 1997 (inclusive), os aumentos salariais sempre correspondem ao dobro do percentual do ano anterior. 

70.	O cardápio de uma lanchonete é o seguinte:
  - Especificação	  Código	Preço
  - Cachorro Quente	  100	R$ 1,20
  - Bauru Simples	101	R$ 1,30
  - Bauru com ovo	102	R$ 1,50
  - Hambúrguer	103	R$ 1,20
  - Cheeseburguer	104	R$ 1,30
  - Refrigerante 105 R$ 1,00

Faça um programa que leia o código dos itens pedidos e as quantidades desejadas. Calcule e mostre o valor a ser pago por item (preço * quantidade) e o total geral do pedido. Considere que o cliente deve informar quando o pedido deve ser encerrado.

71.	Faça um programa que mostre os n termos da Série a seguir:
  - S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m
  
72.	Faça um programa que mostre os n termos da Série a seguir:
  - S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m
  - Imprima no final a soma da série.

73.	Sendo H= 1 + 1/2 + 1/3 + 1/4 + ... + 1/N, Faça um programa que calcule o valor de H com N termos.

74.	Sendo H= 1 + 1/2 + 1/3 + 1/4 + ... + 1/N, Faça um programa que calcule o valor de H com N termos.
  - Imprima no final a soma da série.

## Lista de Exercícios Aula 19

75.	Criar um vetor A com 5 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho e com os "mesmos" elementos do vetor A, ou seja, B[i] = A[i].

76.	Criar um vetor A com 8 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho e com os elementos do vetor A multiplicados por 2, ou seja: B[i] = A[i] * 2.

77.	Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá ser o quadrado do respectivo elemento de A, ou seja:
    B[i] = A[i] * A[I].

78.	Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tamanho, sendo que cada elemento do vetor B deverá ser a raiz quadrada do respectivo elemento de A, ou seja:
    B[i] = sqrt(A[i]).

79.	Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá ser o respectivo elemento de A multiplicado por sua posição (ou índice), ou seja:
    B[i] = A[i] * i.

80.	Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C, onde cada elemento de C é a soma dos respectivos elementos em A e B, ou seja:
    C[i] = A[i] + B[i].

81.	Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C, onde cada elemento de C é a subtração dos respectivos elementos em A e B, ou seja:
    C[i] = A[i] – B[i].

82.	Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C, onde cada elemento de C é a multiplicação dos respectivos elementos em A e B, ou seja:
    C[i] = A[i] * B[i].

83.	Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C, onde cada elemento de C é a divisão dos respectivos elementos em A e B, ou seja:
    C[i] = A[i] / float(B[i]).

84.	Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá ser o resto da divisão do respectivo elemento de A por 2 (dois), ou seja: 
    B[i] := A[i] % 2.

85.	Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a quantidade de elementos armazenados neste vetor que são pares.

86.	Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a soma de todos os elementos armazenados neste vetor.

87.	Criar um vetor A com 10 elementos inteiros. Implementar um programa que determine a soma dos elementos armazenados neste vetor que são múltiplos de 5.

88.	Criar um vetor A com 10 elementos inteiros. Escrever um programa que calcule e escreva: 
    a) a soma de elementos armazenados neste vetor que são inferiores a 15;
    b) a quantidade de elementos armazenados no vetor que são iguais a 15;
    c) a média dos elementos armazenados no vetor que são superiores a 15.

89.	Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de pessoas. Escreva um programa que determine e escreva a quantidade de pessoas que possuem idade superior a 35 anos.

90.	Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de pessoas. Escreva um programa que determine e escreva a menor e a maior idades e suas respectivas posições.

91.	Ler as duas notas bimestrais para um conjunto de 10 alunos. Armazenar as notas informadas em dois vetores “Nota1” e “Nota2” do tipo real. Escreva um programa que calcule a média aritmética simples das notas informadas armazenando o resultado em um vetor “Result” de mesmo tipo e tamanho. Ao mostrar os resultados exibir a situação de cada aluno. Se a média calculada for superior ou igual a 7 o aluno estará “aprovado”, caso contrário, a situação do aluno será “reprovado”.

92.	Implementar um programa que obtenha a cotação do dólar (U$) em relação ao real (R$) e a seguir armazene em vetor A com 20 elementos as seguintes conversões:
  A[i] = cotação do dolar * i, para todo i variando de 1 até 20.

93.	Gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a 0 e 1, sugestão: A[i] = (int)Math.round(Math.random() * 1); Pede-se para implementar um programa que determine o percentual de números 0's e 1's existentes no vetor A.

94.	Números palíndromos são aqueles que escritos da direita para a esquerda têm o mesmo valor quando escritos da esquerda para a direita. Exemplo: 545; 789987; 97379; 123454321; etc. Escreva um programa que verifique se um dado vetor A de 10 elementos inteiros é um palíndromo, ou seja, se o primeiro elemento do vetor e igual ao último, se o segundo elemento do vetor é igual ao penúltimo e assim por diante até verificar todos os elementos ou chegar a conclusão que o vetor não é um palíndromo.

95.	Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, obedecendo as seguintes regras de formação:
    a)	Bi deverá receber 1 quando Ai for par;
    b) Bi deverá receber 0 quando Ai for ímpar.

96.	Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C de mesmo tipo e tamanho, obedecendo as seguintes regras de formação: 
    a) Ci deverá receber 1 quando Ai for maior que Bi;
    b) Ci deverá receber 0 quando Ai for igual a Bi;
    c) Ci deverá receber -1 quando Ai for menor que Bi.

97.	Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, obedecendo as seguintes regras de formação:
    a)	Bi deverá receber 'a' quando Ai for menor que 7;
    b) Bi deverá receber 'b' quando Ai for igual a 7;
    c) Bi deverá receber 'c' quando Ai for maior que 7 e menor que 10;
    d) Bi deverá receber 'd' quando Ai for igual a 10; e
    e) Bi deverá receber 'e' quando Ai for maior que 10. Sugestão: char B[10];

98.	Ler um vetor A com 10 elementos e construir um vetor B de mesmo tipo e tamanho e com os mesmos elementos de A, sendo que estes deverão estar invertidos, ou seja, o primeiro elemento de A passa a ser o último de B, o segundo elemento de A passa a ser o penúltimo de B e assim por diante.

99.	Ler dois vetores A e B com 10 elementos cada. Construir um vetor C, sendo este a junção dos dois outros vetores. Os primeiros 10 elementos de C deverão receber os elementos de A e os últimos elementos C deverão receber os elementos de B. Desta forma, C deverá ter o dobro de elementos de A e B, ou seja, 20 elementos.

100.	Ler um vetor A com 20 elementos. Construir dois vetores B e C, sendo que nos vetor B e C serão armazenados o valores pares e ímpares de A, respectivamente.

101.	Ler um vetor A com 20 elementos. Separar os elementos pares e ímpares de A utilizando apenas um vetor extra B. Sugestão: no início do vetor B armazene os elementos pares de A e nas posições restantes do vetor B armazene os elementos de A que são ímpares.

102.	Criar um vetor A com 5 elementos inteiros. Escreva um programa que imprima a tabuada de cada um dos elementos do vetor A.

103.	Criar um vetor A com 10 elementos inteiros. Escreva um programa que imprima cada elemento do vetor A e uma mensagem indicando se o respectivo elemento é um número primo ou não.

104.	Criar um vetor A com 10 elementos inteiros. Escreva um programa que imprima cada elemento do vetor A e a relação de todos os pares de 0 até o respectivo elemento.

105.	Criar um vetor A com 10 elementos inteiros. Escreva um programa que imprima cada elemento do vetor A e a relação de todos os divisores do respectivo elemento.

106.	Criar um vetor A com 11 elementos, indexados de 0 até 10. Sendo que cada elemento do vetor A é formado pela potência de base 2 elevado ao expoente igual a posição do respectivo elemento, ou seja:
    A[i] = 2i. Sugestão int A[11];

107.	Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tamanho, sendo que cada elemento do vetor B seja o fatorial do elemento correspondente em A.
 
## Lista de Exercícios Aula 20

108.	Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9. Após isso determine o maior número da matriz e a sua posição (linha, coluna).

109.	Gere e imprima uma matriz M 10x10 com valores aleatórios entre 0-9. Após isso indique qual é o maior e o menor valor da linha 5 e qual é o maior e o menor valor da coluna 7.

110.	Capture do teclado valores para preenchimento de uma matriz M 3x3. Após a captura imprima a matriz criada e encontre a quantidade de números pares, a quantidade de números ímpares.

111.	Faça um programa para armazenar em uma matriz os compromissos de uma agenda pessoal. Cada dia do mês deve conter 24 horas, onde para cada uma destas 24 horas podemos associar um tarefa específica (compromisso agendado). O programa deve ter um menu onde o usuário indica o dia do mês que deseja alterar e a hora, entrando em seguida com o compromisso, ou então, o usuário pode também consultar a agenda, fornecendo o dia e a hora para obter o compromisso armazenado.

112.	Modifique o programa anterior de maneira a guardar os compromissos de todo o ano, organizados por mês, dia e hora (só 8 horas por dia).

113.	Faça um programa para jogar o jogo da velha. O programa deve permitir que dois jogadores façam uma partida do jogo da velha, usando o computador para ver o tabuleiro. Cada jogador vai alternadamente informando a posição onde deseja colocar a sua peça (‘O’ ou ‘X’). O programa deve impedir jogadas inválidas e determinar automaticamente quando o jogo terminou e quem foi o vencedor (jogador1 ou jogador2). A cada nova jogada, o programa deve atualizar a situação do tabuleiro na tela.


## Lista de Exercícios Aula 21

114. Escreva um programa que verifique se um número é positivo, negativo ou zero usando um operador ternário.

115. Escreva um programa que determine se um caractere é uma vogal ou uma consoante usando um operador ternário.

116. Crie um programa que verifique se um número é par ou impar, usando um operador ternário.

117. Escreva um programa que compare dois números inteiros e retorne o maior deles usando um operador ternário.

118. Escreva um programa que classifique uma nota em conceitos A, B, C, D ou F usando um operador ternário.




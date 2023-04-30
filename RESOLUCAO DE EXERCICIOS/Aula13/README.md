# Exercicíos

## Lista de Exercícios Aula 13

1. 1. Faça um Programa que mostre a mensagem "Alo mundo" na tela.

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

35.	Uma fruteira está vendendo frutas com a seguinte tabela de preços:
  Até 5 Kg
    Morango R$ 2,50 Kg 
    Maçã R$ 1,80 Kg
  Acima de 5 Kg
    Morango R$ 2,20 Kg
    Maçã R$ 1,50 por Kg

Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.
 
36.	O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira:
  Até 5 Kg 
    File Duplo R$ 4,90 por Kg
    Alcatra R$ 5,90 por Kg
    Picanha R$ 6,90 por Kg

  Acima de 5 Kg
    File Duplo R$ 5,80 por Kg
    Alcatra R$ 6,80 por Kg
    Picanha R$ 7,80 por Kg
    
  Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos de carne da promoção, porém não há limites para a quantidade de carne por cliente. Se compra for feita no cartão Tabajara o cliente receberá ainda um desconto de 5% sobre o total a compra. Escreva um programa que peça o tipo e a quantidade de carne comprada pelo usuário e gere um cupom fiscal, contendo as informações da compra: tipo e quantidade de carne, preço total, tipo de pagamento, valor do desconto e valor a pagar.

34.	Faça um Programa para leitura de três notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e presentar:
  - A mensagem "Aprovado", se a média for maior ou igual a 7, com a respectiva média alcançada;
  - A mensagem "Reprovado", se a média for menor do que 7, com a respectiva média alcançada;
  - A mensagem "Aprovado com Distinção", se a média for igual a 10.

35.	Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao usuário a valor do saque e depois informar quantas notas de cada valor serão fornecidas. As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais. O valor mínimo é de 10 reais e o máximo de 600 reais. O programa não deve se preocupar com a quantidade de notas existentes na máquina.
  Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas notas de 100, uma nota de 50, uma nota de 5 e uma nota de 1;
  Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece três notas de 100, uma nota de 50, quatro notas de 10, uma nota de 5 e quatro notas de 1.

36.	Faça um Programa que peça um número inteiro e determine se ele é par ou impar. Dica: utilize o operador módulo (resto da divisão).
 
37.	Faça um Programa que peça um número e informe se o número é inteiro ou decimal. Dica: utilize uma função de arredondamento.


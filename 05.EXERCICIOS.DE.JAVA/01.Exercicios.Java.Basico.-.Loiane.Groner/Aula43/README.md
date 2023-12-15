# Lista de Exericios  - Aula 43

## Veja as correções dos exercicios no youtube

### [Correção Exercicios Aula 43  - parte 1](https://www.youtube.com/watch?v=Ghp5pmbxDTU&list=PLGxZ4Rq3BOBq0KXHsp5J3PxyFaBIXVs3r&index=82&ab_channel=LoianeGroner)

### [Correção Exercicios Aula 43  - parte 2](https://www.youtube.com/watch?v=ZSyCf11JJOM&list=PLGxZ4Rq3BOBq0KXHsp5J3PxyFaBIXVs3r&index=83&ab_channel=LoianeGroner)

### [Correção Exercicios Aula 43  - parte 3](https://www.youtube.com/watch?v=M631ZCkX-Dg&list=PLGxZ4Rq3BOBq0KXHsp5J3PxyFaBIXVs3r&index=84&ab_channel=LoianeGroner)

### 1 – ContaBancária

Elabore uma classe ContaBancaria com os seguintes atributos:
  - nomeCliente
  - numConta
  - saldo
E os seguintes métodos:
  - sacar (o saldo não pode ficar negativo)
  - depositar

Crie também duas subclasses chamadas ContaPoupanca e ContaEspecial, com as seguintes características:
  - ContaPoupanca
    - atributo diaRendimento
    - método calcularNovoSaldo, recebe taxa de rendimento da poupaça e atualiza o saldo
  - ContaEspecial
    - atributo limite
    - sobrescreva o método sacar com a nova lógica necessária

Crie uma classe Teste que contenha a seguinte lógica:
  - Criar contas
  - Sacar um valor das contas
  - Depositar
  - Mostrar um novo saldo a partir de um rendimento
  - Mostrar os dados da conta do cliente

### 2 – Imposto de Renda

A Receita Federal possui um cadastro dos contribuintes. Cada contribuinte possui nome.
Escreva um programa para calcular o imposto a ser pago para 5 contribuintes.
Os contribuintes podem ser:
Pessoa Jurídica O imposto corresponde a 10% da renda bruta da empresa.
Pessoa Física: Renda Bruta Alíquota Parcela a deduzir
0 a 1400 0% R  0
1400,01 a 2100 10% R  100
2100,01 a 2800 15% R  270
2800,01 a 3600 25% R  500
3600,01 ou mais 30% R  700
Escreva um programa para calcular e imprimir na tela o imposto a ser pago de 6 contribuintes, sendo 3 PJ e 3 PF

### 3 – Animais

Um animal contém nome, comprimento, número de patas (padrão é 4), cor, ambiente e velocidade (em m/s).
Um peixe é um animal, tem 0 patas, seu ambiente é o mar (padrão), cor cinzenta(padrão). Além disso tem como características barbatanas e cauda. Um mamífero é um animal e seu ambiente padrão é terra. Um urso é um mamífero, cor castanho e seu alimento preferido é o mel.
Crie as classes Animal, Peixe e Mamífero.
Para a classe Animal, coloque os atributos:
  Nome, comprimento, patas, cor, ambiente, velocidade
Para a classe Peixe, codifique o atributo características.
Para a classe Mamifero, coloque o atributo alimento.
Por último, crie uma classe teste de forma a ter um jardim zoológico com os seguintes animais: camelo, tubarão, urso`do`canadá

### [Voltar](../README.md)

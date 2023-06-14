# Seção 2 - Introdução sobre programação
## Aula 4 -  Algoritmo, Automação, Programa de Computador
### Algoritmo:
Sequência finita de instruções para se resolver um problema
Exemplo: lavar roupa suja

Algoritmo:
  1. Colocar a roupa em um recipiente
  2. Colocar um pouco de sabão e amaciante
  3. Encher de água
  4. Mexer tudo até dissolver todo o sabão
  5. Deixar de molho por vinte minutos
  6. Esfregar a roupa
  7. Enxaguar
  8. Torcer

### Automação:
Consiste em utilizar máquina(s) para executar o procedimento desejado de forma automática ou semiautomática

**💥Mas o que algoritmo e automação tem a ver com programação de computadores?**
- Programas de computador são algoritmos executados pelo computador (em linhas gerais).
- Conclusão: o computador é uma máquina que automatiza a execução de algoritmos.
Qualquer algoritmo? Não. Apenas algoritmos computacionais:
  - Processamento de dados
  - Cálculos
## Aula 5 - O que é preciso para se fazer um programa de computador?

**Vamos precisar de:**
1. Uma linguagem de programação: regras léxicas e sintáticas para se escrever o programa
2. Uma IDE: software para editar e testar o programa
3. Um compilador: software para transformar o código fonte em código objeto
4. Um gerador de código ou máquina virtual: software que permite que o programa seja executado

## Aula 6 - Linguagem de programação, léxica, sintática

### Linguagem de programação
É um conjunto de regras léxicas (ortografia) e sintáticas (gramática) para se escrever programas.
Exemplos de linguagens de programação: C, Pascal, C++, Java, C#, Python, Ruby, PHP, JavaScript, etc.
  - Léxica - Diz respeito à correção das palavras "isoladas" (ortografia).
  - Sintática - Diz respeito à correção das sentenças (gramática).
Exemplo de um programa: Suponha um programa que solicita do usuário dois números e depois mostra a média aritmética deles:

Solução em Java
```java
import java.util.Scanner;
public class Main {
  public static void main (String[] args){
    Scanner scan = new Scanner(System.in);
    double x, y, media;
    System.out.println("Digite o Primeiro numero: ");
    x = scan.nextDouble();
    System.out.println("Digite o Segundo numero: ");
    y = scan.nextDouble();
    media = x+y/2.0;
    System.out.println("Media: "+media);
    scan. Close();
  }
}
```

## Aula 7 - IDE: Ambiente de Desenvolvimento Integrado
IDE – Ambiente Integrado de Desenvolvimento. É um conjunto de softwares utilizado para a construção de programas

**Funcionalidades de uma IDE**
- Edição de código fonte (endentação, autocompletar, destaque de palavras, etc.)
- Depuração e testes
- Construção do produto final (build)
- Sugestão de modelos (templates)
- Auxiliar em várias tarefas do seu projeto
- Etc

## Aula 8 - Compilação e interpretação de Código fonte e objeto, Máquina virtual
Código fonte: é aquele escrito pelo programador em linguagem de programação

### Compilação: 
  Codigo Fonte -> [Compilador] -> Código Objeto -> [Gerador de código: construção (build)] -> Código Executável
Linguagens que tipicamente usam essa abordagem: C, C++

### Interpretação:
  Codigo Fonte -> [Interpretador] -> Código Executável
Linguagens que tipicamente usam essa abordagem: PHP, JavaScript, Python, Ruby

### Abordagem híbrida
  Codigo Fonte -> [Compilador] -> ByteCode -> [Máquina virtual: interpretação] -> Execução
Linguagens que tipicamente usam essa abordagem: Java (JVM), C# (Microsoft .NET Framework)

### Vantagens da Compilação: 
- Velocidade do programa
- Auxílio do compilador antes da execução

### Vantagens da Interpretação: 
- Flexibilidade de manutenção do aplicativo em produção
- Expressividade da linguagem
- Código fonte não precisa ser recompilado para rodar em plataformas diferentes

### [Voltar](https://github.com/lex4brao/01.CURSOS.E.ESTUDOS/blob/main/03.JAVA.COMPLETO-2023.-.NELIO.ALVES/README.md)

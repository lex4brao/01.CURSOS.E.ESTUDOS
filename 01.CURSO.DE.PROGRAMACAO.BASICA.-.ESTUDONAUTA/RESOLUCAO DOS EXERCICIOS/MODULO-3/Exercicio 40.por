programa
{
    inclua biblioteca Tipos --> t
    inclua biblioteca Matematica --> m
  funcao inicio()
  {
    inteiro	n1, n2, esc=0
    escreva("\nDigite o valor do 1º operando")
    escreva("\n>> ")
    leia(n1)
    escreva("\nDigite o valor do 2º operando")
    escreva("\n>> ")
    leia(n2)
    enquanto(esc!=6) {
      escreva("\n")
      escreva("\nDigite o numero da opção")
      escreva("\n[1] Soma")
      escreva("\n[2] Subtração")
      escreva("\n[3] multiplicação")
      escreva("\n[4] divisão")
      escreva("\n[5] entrar com outros operandos")
      escreva("\n[6] encerrar o programa")
      escreva("\n>>> ")
      leia(esc)
      escolha(esc) 
      {
        caso 1:
          escreva("\n", n1, "+", n2, "=", n1+n2)
        pare
        caso 2:
          escreva("\n", n1, "-", n2, "=", n1-n2)
        pare
        caso 3:
          escreva("\n", n1, "*", n2, "=", n1*n2)
        pare
        caso 4:
          escreva("\n", n1, "/", n2, "=", m.arredondar(n1/t.inteiro_para_real(n2), 2))
        pare
        caso 5:
          escreva("\nDigite o valor do 1º operando")
          escreva("\n>> ")
          leia(n1)
          escreva("\nDigite o valor do 2º operando")
          escreva("\n>> ")
          leia(n2)      
        pare
        caso 6:
          escreva("\nCalculadora encerrada")
        pare
        caso contrario:
          escreva("\nVocês escolheu um opção invalida")
        pare
      }
  
    }
    escreva("\n\n")
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 979; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
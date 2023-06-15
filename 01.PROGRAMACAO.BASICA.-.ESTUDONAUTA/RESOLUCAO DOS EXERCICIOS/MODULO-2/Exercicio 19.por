programa
{
    
  funcao inicio()
  {
    real n
    escreva("\n---------------------------------------")
    escreva("\n Inverso ou Oposto(valor absoluto)")
    escreva("\n---------------------------------------")
    escreva("\nDigite um numero ")
    escreva("\n>> ")
    leia(n)
    se(n>0) {
      escreva("\nO inverso de ", n, " é ", 1/n)
    } senao {
      escreva("\nO oposto de ", n, " é ", n*(-1))
    }
    escreva("\n\n")
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 46; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
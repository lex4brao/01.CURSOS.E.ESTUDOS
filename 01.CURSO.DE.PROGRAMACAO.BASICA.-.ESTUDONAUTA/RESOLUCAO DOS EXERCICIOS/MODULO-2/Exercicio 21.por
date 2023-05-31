programa
{
    
  funcao inicio()
  {
    inteiro	n
    escreva("\nDigite um numero ")
    escreva("\n>> ")
    leia(n)
    se(n>0) {
      escreva("\n", n, " é positivo")
    }senao se(n<0) {
      escreva("\n", n, " é negativo")
    } senao {
      escreva("\n", n, " é nulo")
    }
    escreva("\n\n")
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 310; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
programa
{
  funcao tabuada(inteiro num)
  {
    para(inteiro	p=0;p<=10;p++) {
      escreva("\n", p, "*", num, " = ", p*num)
    }
  }
  funcao inicio()
  {
    inteiro	nun
    escreva("\nDigite o numero da tabuada que deseja")
    escreva("\n>> ")
    leia(nun)
    tabuada(nun)
    escreva("\n\n")
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 116; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
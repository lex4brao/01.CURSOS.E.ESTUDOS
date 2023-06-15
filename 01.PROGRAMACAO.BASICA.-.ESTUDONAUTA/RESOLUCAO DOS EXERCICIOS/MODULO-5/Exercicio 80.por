programa
{
  
  funcao inicio()
  {
    inteiro	x
    escreva("\nDigite um valor inteiro positivo:  ")
    leia(x)
    escreva("\n\nA soma dos inteitros até ", x, " é ", soma(x))
    escreva("\n\n")
  }

  funcao inteiro soma(inteiro x)
  {
    se(x==1) {
      retorne(1)
    }senao {
      retorne(x+soma(x-1))
    }
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 169; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
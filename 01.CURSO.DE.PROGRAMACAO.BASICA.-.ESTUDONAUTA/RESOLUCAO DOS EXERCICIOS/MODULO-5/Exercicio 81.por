programa
{
  
  funcao inicio()
  {
    inteiro	x
    escreva("\nDeseja ver o resultado fatorial de que numero: ")
    leia(x)
    escreva("\n", x, "! = ", fatorial(x))
    escreva("\n\n")
  }

  funcao inteiro fatorial(inteiro x)
  {
    se(x==0) {
      retorne(1)
    }senao {
      retorne(x*fatorial(x-1))
    }
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 322; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
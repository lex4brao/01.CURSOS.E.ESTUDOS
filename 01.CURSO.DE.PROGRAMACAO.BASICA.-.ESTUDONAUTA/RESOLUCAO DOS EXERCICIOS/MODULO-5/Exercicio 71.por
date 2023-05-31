programa
{
  inclua biblioteca Texto --> txt
  inclua biblioteca Util --> u

  funcao borda(inteiro tam)
  {
    para(inteiro p=0;p<tam;p++) {
      escreva("-")
      u.aguarde(150)
    }
    escreva("\n")
  }

  funcao escrita(cadeia	msg)
  {
    inteiro tam= txt.numero_caracteres(msg)
    escreva("\n")
    borda(tam)
    para(inteiro p=0;p<tam;p++) {
      escreva(txt.obter_caracter(msg, p))
      u.aguarde(100)
    }
    escreva("\n")
    borda(tam)
    escreva("\n")
  }

  funcao inicio()
  {
    escrita("Estou aprendendo programar")
    escrita("O proximo passo é o Java")
    escreva("\n\n")
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 610; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
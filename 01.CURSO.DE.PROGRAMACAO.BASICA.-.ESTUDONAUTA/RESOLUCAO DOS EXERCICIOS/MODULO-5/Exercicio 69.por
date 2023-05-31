programa
{

  funcao mensagem(cadeia msg, inteiro repete, inteiro borda)
  {
    cadeia tipo_borda=" "
    escolha(borda) 
    {
      caso 1:
        tipo_borda="<<<<<<--------------->>>>>>"
      pare
      caso 2:
        tipo_borda="============================"
      pare
      caso 3:
        tipo_borda="º~~~~~~~~~~~~~~~~~~~~~~~~~~~º"
      pare
      caso contrario:
      pare
    }
    escreva("\n", tipo_borda)
    para(inteiro p=0;p<=repete;p++) {
      escreva("\n", msg)
    }
    escreva("\n", tipo_borda)
    escreva("\n")
  }

  funcao inicio()
  {
    
    mensagem("Estou aprendendo programar", 2, 1)
    mensagem("Proxima missão é o java", 4, 2)
    mensagem("Sucesso TOTAL", 3, 3)
    mensagem("Vamo para cima", 1, 0)
    escreva("\n\n")
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 539; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
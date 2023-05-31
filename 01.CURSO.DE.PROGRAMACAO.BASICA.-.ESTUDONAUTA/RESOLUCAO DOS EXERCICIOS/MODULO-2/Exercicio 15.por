programa
{
  inclua biblioteca Calendario --> c
  funcao inicio()
  {
    inteiro	ano_nas
    escreva("\nB E M  V I N D O ")
    escreva("\nAo banco TAXALTA")
    escreva("\nEm que ano você nasceu [AAAA]")
    escreva("\n>>> ")
    leia(ano_nas)
    escreva("\nDirija-se a Fila")
    se((c.ano_atual() -  ano_nas)>= 65)
      {
        escreva("\nATENÇÃO - Você tem direito a fila preferencial ")
      }
    escreva("\n\n")
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 356; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
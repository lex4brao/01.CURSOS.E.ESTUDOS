programa
{
    
  funcao inicio()
  {
    inteiro	cont, mult
    escreva("\n----------------------")
    escreva("\n Contador Regressivo")
    escreva("\n----------------------")
    escreva("\nDigite o numero do inicio da contagem")
    escreva("\n>> ")
    leia(cont)
    escreva("\nVigite o multiplo do marcador")
    escreva("\n>> ")
    leia(mult)
    enquanto(cont>=0) {
      se(cont%mult==0) {
        escreva("[", cont, "]\n")
      }senao {
        escreva("", cont, " - ")
      }
      cont --
    }
    
    escreva("\n\n")
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 431; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
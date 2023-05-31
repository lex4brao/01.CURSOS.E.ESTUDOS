programa
{
  funcao quad(inteiro tam)
  {
    escreva("\n")
    para(inteiro p=0;p<=tam;p++) {
      para(inteiro i=0;i<=tam;i++) {
        escreva("██")
      }
      escreva("\n")
    }
    escreva("\nQuadrado ", tam, "X", tam)
  }

  funcao inicio()
  {
    inteiro	tamanho
    quad(2)
    quad(4)
    quad(8)
    escreva("\n")
    escreva("\nDigite o tamanho do seu quadrado: ")
    leia(tamanho)
    escreva("\n")
    quad(tamanho)
    escreva("\n\n")
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 462; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
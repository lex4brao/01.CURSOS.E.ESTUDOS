programa
{
    
  funcao inicio()
  {
    inteiro	a, l, esp, fl, fe=1
    escreva("\nQuantos andares a piramide tem: ")
    leia(a)
    escreva("\n")
    para(a;a>=1;a--) {
      fl=a
      para(l=1;l<=fl;l++) {
        escreva("**")
      }
      escreva("\n")
      para(esp=1;esp<=fe;esp++) {
        escreva(" ")
      }
      fe++
    }
    escreva("\n\n")
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 290; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
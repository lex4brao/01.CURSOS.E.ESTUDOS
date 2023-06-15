programa
{
    
  funcao inicio()
  {
    inteiro c, a, esp, l, fl
    escreva("\nDigite quantos andares tem a piramide")
    escreva("\n>> ")
    leia(a)
    escreva("\n")
    esp=a
    para(c=1;c<=a;c++) {
      para(esp;esp>=0;esp--) {
        escreva(" ")
      }
      esp=a-c
      fl=c
      para(l=1;l<=fl;l++) {
        escreva("**")
      }
      escreva("\n")
    }
    escreva("\n\n")
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 402; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
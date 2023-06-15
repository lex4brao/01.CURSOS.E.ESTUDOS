programa
{
    
  funcao inicio()
  {
    inteiro	c1, c2, a, f=1
    escreva("\nDigite quantos andares do triangulo você deseja")
    escreva("\n>> ")
    leia(a)
    escreva("\n\n")
    para(c1=1;c1<=a;c1++) {
      para(c2=1;c2<=f;c2++) {
        escreva("*")
      }
      escreva("\n")
      f++
    }
    escreva("\n\n")
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 180; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
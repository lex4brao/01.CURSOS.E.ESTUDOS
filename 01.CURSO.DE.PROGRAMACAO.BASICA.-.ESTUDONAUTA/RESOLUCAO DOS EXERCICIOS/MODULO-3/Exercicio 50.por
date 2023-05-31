programa
{
    
  funcao inicio()
  {
    inteiro	c1, c2, f
    escreva("\nDigite a primeira q tabuada que deseja da sequencia")
    escreva("\n>>")
    leia(c1)
    escreva("\nDigite a ultima tabuada que deseja da sequencia")
    escreva("\n>>")
    leia(f)
    para(c1;c1<=f;c1++) {
      escreva("\n------------------")
      escreva("\n  Tabuada do ", c1)
      escreva("\n------------------")
      para(c2=0;c2<=10;c2++) {
        escreva("\n", c1, " * ", c2, " = ", c1*c2)
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
 * @POSICAO-CURSOR = 539; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
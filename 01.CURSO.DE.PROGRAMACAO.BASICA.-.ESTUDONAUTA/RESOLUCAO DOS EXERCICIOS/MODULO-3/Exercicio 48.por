programa
{
    
  funcao inicio()
  {
    inteiro	c, p, div=0
    escreva("\nDigite o valor que deseja saber se é primo")
    escreva("\n>>")
    leia(p)
    para(c=1;c<=p;c++) {
      se(p%c==0) {
        escreva("[", c, "] - ")
        div++
      }senao {
        escreva(c, " - ")
      }
      se(c%10==0) {
        escreva("\n")
      }
    }
    se(div==2) {
      escreva("\nO numero ", p, " é PRIMO")
    }senao {
      escreva("\nO numero ", p, " NÃO é primo")
    }
    escreva("\n\n")
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 502; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
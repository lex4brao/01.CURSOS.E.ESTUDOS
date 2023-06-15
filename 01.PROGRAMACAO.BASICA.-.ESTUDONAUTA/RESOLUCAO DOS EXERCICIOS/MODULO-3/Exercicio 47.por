programa
{
    
  funcao inicio()
  {
    inteiro	i, f, p, c
    escreva("\nDigite o inicio da contagem =>  ")
    leia(i)
    escreva("\nDigite o passo da contagem =>  ")
    leia(p)
    escreva("\nDigite o fim da contagem => ")
    leia(f)
    se(p<0) {
      p = p*1
    }
    se(i<f) {
      para(i;i<=f;i+=p) {
        escreva(i, " - ")
      }
    }senao {
      para(i;i>=f;i-=p) {
        escreva(i, " - ")
      }
    }
    escreva("\n\n")
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 341; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
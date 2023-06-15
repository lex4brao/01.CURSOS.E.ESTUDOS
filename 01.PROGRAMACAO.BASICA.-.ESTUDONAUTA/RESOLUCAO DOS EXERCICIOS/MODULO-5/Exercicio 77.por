programa
{
  
  funcao inicio()
  {
    inteiro	n  
    escreva("\nDigite um valor para verificar se ele é primo ou não ")
    leia(n)
    escreva("O numero ", n, primo(n))
    escreva("\n\n")
  }

  funcao cadeia  primo(inteiro x)
  {
    inteiro	p, soma=0
    para(p=1;p<=x;p++) {
      se(x%p==0) {
        soma++
      }
    }
    se(soma<=2) {
      retorne(" é PRIMO")
    }senao {
      retorne(" NÃO É PRIMO")
    }
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 404; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
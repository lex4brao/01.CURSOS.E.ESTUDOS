programa
{
  
  funcao inicio()
  {
    inteiro	ini, fim, passo
    escreva("\nDigite o começo da contagem")
    escreva("\n>> ")
    leia(ini)
    escreva("\nDigite o fim da contagem")
    escreva("\n>> ")
    leia(fim)
    escreva("\nDigite o passo da contagem")
    escreva("\n>> ")
    leia(passo)
    contador(ini, fim, passo)
    escreva("\n\n")
  }

  funcao contador(inteiro i, inteiro f, inteiro pas)
  {
    inteiro	p, ini, fim, passo
    ini=i
    fim=f
    passo=pas
    se(passo<0) {
      passo= passo*-1
    }
    se(ini<fim) {
      para(p=ini;p<=fim;p+=passo) {
        escreva("\t", p)
      }
    }senao {
      para(p=ini;p>=fim;p-=passo) {
        escreva("\t", p)
      }
    }
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 408; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
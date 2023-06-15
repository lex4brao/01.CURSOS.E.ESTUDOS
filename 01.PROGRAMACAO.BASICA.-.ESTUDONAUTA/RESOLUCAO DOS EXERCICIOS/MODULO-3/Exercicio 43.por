programa
{
    
  funcao inicio()
  {
    inteiro	n, c=1, par=0, imp=0, me_imp=0
    caracter	resp
    escreva("\n------ANALIZADOR NUMÉRICO-------")
    faca {
      escreva("\nDigite o ", c, "º valor => ")
      leia(n)
      se(n%2==0) {
        par++
      }senao {
        se(imp==0) {
          me_imp=n
        } senao {
          se(n<me_imp) {
            me_imp=n
          }
        }
        imp++
      }
      escreva("\nDeseja continuar?[S/N] =>")
      leia(resp)
      se(resp=='s' ou resp=='S') {
        c++
      }
    } enquanto(resp=='s' ou resp=='S')
    escreva("\n=======RESULTADOS=======")
    escreva("\nForam digitados ", c, " valores")
    escreva("\n", par, " valores são pares")
    escreva("\n", imp, " valores são impares")
    escreva("\nO menor valor impar digitado foi ", me_imp)
    escreva("\n\n")
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 840; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
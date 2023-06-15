programa
{
    inclua biblioteca Tipos --> t
  funcao inicio()
  {
    cadeia	tc, resp=" "
    inteiro	n=0, c=0, soma=0, maior=0, menor=0
    faca {
      escreva("\n----------------")
      escreva("\n ", c+1, " Valor")
      escreva("\n----------------")
      enquanto(verdadeiro) {
        escreva("\nDigite o valor =>  ")
        leia(tc)
        se(t.cadeia_e_inteiro(tc,10)) {
          n=t.cadeia_para_inteiro(tc,10)
          se(n>=1 e n<=10) {
            pare
          }senao {
            escreva("Digite um valor entre 1 até 10\n")
          }
        } senao {
          escreva("Você deve digitar um numero\n")
        }
      }
      se(c==0) {
        maior=n
        menor=n
      }senao {
        se(n>maior) {
          maior=n
        }
        se(n<menor) {
          menor=n
        }
      }
      c++
      soma+=n
      enquanto(verdadeiro) {
        escreva("\nDeseja continuar? [S/N] ==>  ")
        leia(tc)
        se(tc=="S" ou tc=="s" ou tc=="N" ou tc=="n") {
          resp=tc
          pare
        }senao {
          escreva("Voce deve digitar")
          escreva("\n[S] para SIM")
          escreva("\n[N] para NÃO\n")
        }
      }
    } enquanto(resp=="S" ou resp=="s")
    escreva("\n\n========RESULTADOS==========")
    escreva("\nForam cadastrados ", c, " valores")
    escreva("\nA soma dos valores é ", soma)
    escreva("\nO maior valor cadastrado é ", maior)
    escreva("\nO menor valor cadastrado é ", menor)
    escreva("\n\n")
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1486; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
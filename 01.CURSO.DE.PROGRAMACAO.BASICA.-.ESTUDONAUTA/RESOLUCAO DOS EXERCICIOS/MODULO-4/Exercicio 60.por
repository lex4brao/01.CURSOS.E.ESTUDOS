programa
{
    inclua biblioteca Util --> u
  funcao inicio()
  {
    inteiro	vet[10], p, par=0, spar=0, imp=0, simp=0, maior=0
    escreva("\nSorteio de 10 valores\n")
    para(p=0;p<u.numero_elementos(vet);p++) {
      vet[p]= sorteia(1,15)
      escreva(p,"-[", vet[p], "]  ")
      se(vet[p]%2==0) {
        par++
        spar+=vet[p]
      }senao {
        imp++
        simp+=vet[p]
      }
      se(p==0) {
        maior=vet[p]
      }senao {
        se(vet[p]>maior) {
          maior=vet[p]
        }
      }
    }
    escreva("\n------------------------------")
    escreva("\n    Analize do Sorteio")
    escreva("\n------------------------------")
    escreva("\nForam sorteados ", par, " numeros pares")
    escreva("\nForam sorteados ", imp, " numeros impares")
    escreva("\nO maior valor sorteado é ", maior, "\n")
    escreva("\n-------------------------------")
    escreva("\nOs numeros pares estão nas posições: \n")
    para(p=0;p<u.numero_elementos(vet);p++) {
      se(vet[p]%2==0) {
        escreva("[", p, "] - ")
      }
    }
    escreva("\nA soma dos numeros pares é ", spar)
    escreva("\n-------------------------------")
    escreva("\nOs numeros impares estão nas posições: \n")
    para(p=0;p<u.numero_elementos(vet);p++) {
      se(vet[p]%2!=0) {
        escreva("[", p, "] - ")
      }
    }
    escreva("\nA soma dos numeros impares é ", simp)
    escreva("\n-------------------------------")
    escreva("\nO maior valor sorteado é ", maior, " está nas posições: \n")
    para(p=0;p<u.numero_elementos(vet);p++) {
      se(vet[p]==maior) {
        escreva("[", p, "] - ")
      }
    }
    escreva("\n\nTHANKS!!!!!!!! =)")
    escreva("\n\n")
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1642; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
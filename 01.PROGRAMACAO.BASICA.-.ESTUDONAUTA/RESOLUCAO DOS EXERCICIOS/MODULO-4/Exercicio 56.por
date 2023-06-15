programa
{
    inclua biblioteca Util --> u
  funcao inicio()
  {
    inteiro	vet[10], p, maior=0, menor=0, pmenor=0, pmaior=0
    para(p=0;p<u.numero_elementos(vet);p++) {
      vet[p]= sorteia(1,50)
      se(p==0) {
        maior=vet[p]
        menor=vet[p]
        pmaior=p
        pmenor=p
      }senao {
        se(vet[p]>maior) {
          maior=vet[p]
          pmaior=p
        }
        se(vet[p]<menor) {
          menor=vet[p]
          pmenor=p
        }
      }
    } 
    escreva("\nForam sorteados 10 valores\n")
    para(p=0;p<u.numero_elementos(vet);p++) {
      escreva("[", p, "]= ", vet[p], " - ")
    }
    escreva("\n")
    escreva("\nO maior valor sorteado é [", pmaior, "]= ", maior)
    escreva("\nO menor valor sorteado é [", pmenor, "]= ", menor)
    escreva("\n\n")
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 799; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
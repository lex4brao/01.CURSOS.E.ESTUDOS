programa
{
    inclua biblioteca Util --> u
  funcao inicio()
  {
    inteiro	m[4][4], l, c, maior=0
    escreva("\nPreencha uma Matriz com valores inteiros\n")
    para(l=0;l<u.numero_linhas(m);l++) {
      para(c=0;c<u.numero_colunas(m);c++) {
        escreva("Digite o valor da posição [", l, "][", c,"]:  ")
        leia(m[l][c])
        se(l==0 e c==0) {
          maior=m[l][c]
        }senao {
          se(m[l][c]>maior) {
            maior=m[l][c]
          }
        }
      }
    }
    escreva("\n-----------------------------")
    escreva("\n   Analizando a Matriz")
    escreva("\n-----------------------------")
    escreva("\nO maior valor na matriz é: ", maior, " nas posições\n")
    para(l=0;l<u.numero_linhas(m);l++) {
      para(c=0;c<u.numero_colunas(m);c++) {
        se(m[l][c]==maior) {
          escreva("\n[",l,"][",c,"]")
        }
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
 * @POSICAO-CURSOR = 158; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
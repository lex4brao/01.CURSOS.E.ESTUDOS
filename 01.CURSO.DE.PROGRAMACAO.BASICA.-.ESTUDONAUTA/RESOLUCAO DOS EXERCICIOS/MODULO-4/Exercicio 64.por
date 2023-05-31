programa
{
    inclua biblioteca Util --> u
  funcao inicio()
  {
    inteiro	m[4][4], l, c, somal=0
    para(l=0;l<u.numero_linhas(m);l++) {
      para(c=0;c<u.numero_colunas(m);c++) {
        m[l][c]=sorteia(1,10)
        escreva(m[l][c],"\t")
      }
      escreva("\n")
    }
    escreva("\n--------------------------")
    escreva("\nSomatória das Linhas")
    escreva("\n--------------------------")
    para(l=0;l<u.numero_linhas(m);l++) {
      escreva("\nLinha ", l, ": ")
      para(c=0;c<u.numero_colunas(m);c++) {
        escreva(m[l][c])
        somal+=m[l][c]
        se(c!=u.numero_colunas(m)-1) {
          escreva(" + ")
        }
      }
      escreva(" = ", somal)
    }
    escreva("\n\n")
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 715; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
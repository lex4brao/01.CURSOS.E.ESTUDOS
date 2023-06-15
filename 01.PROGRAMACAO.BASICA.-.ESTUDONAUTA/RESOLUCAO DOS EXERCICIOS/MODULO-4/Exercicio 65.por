programa
{
    inclua biblioteca Util --> u
  funcao inicio()
  {
    inteiro	m[4][4], l, c, somac=0
    para(l=0;l<u.numero_linhas(m);l++) {
      para(c=0;c<u.numero_colunas(m);c++) {
        m[l][c]=sorteia(1,10)
        escreva(m[l][c],"\t")
      }
      escreva("\n")
    }
    escreva("\n--------------------------")
    escreva("\nSomatória das Colunas")
    escreva("\n--------------------------")
    para(c=0;c<u.numero_colunas(m);c++) {
      escreva("\nColuna ", c, ": ")
      para(l=0;l<u.numero_linhas(m);l++) {
        somac+= m[l][c]
        escreva(m[l][c])
        se(l!=u.numero_linhas(m)-1) {
          escreva(" + ")
        }
      }
      escreva(" = ", somac)
    }
    escreva("\n\n")
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 717; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
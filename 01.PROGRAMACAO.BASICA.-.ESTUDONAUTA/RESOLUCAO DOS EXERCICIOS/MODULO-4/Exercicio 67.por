programa
{
    inclua biblioteca Util --> u
    inclua biblioteca Tipos --> t
  funcao inicio()
  {
    inteiro	m[5][5], l, c, soma=0
    real	med
    para(l=0;l<u.numero_linhas(m);l++) {
      para(c=0;c<u.numero_colunas(m);c++) {
        m[l][c]= sorteia(1,100)
        escreva(m[l][c], "\t")
        soma+=m[l][c]
      }
      escreva("\n")
    }
    med=t.inteiro_para_real(soma)/(u.numero_colunas(m)*u.numero_linhas(m))
    escreva("\n--------------------------------------------------------")
    escreva("\nA média de valores da matriz é ", med)
    escreva("\nOs valores acima da média da linha 1 são: \n")
    para(c=0;c<u.numero_colunas(m);c++) {
      se(med<m[1][c]) {
        escreva(m[1][c],"\t")
      }
    }
    escreva("\n--------------------------------------------------------")
    escreva("\nOs valores abaixo da média da coluna 2 são: \n")
    para(l=0;l<u.numero_linhas(m);l++) {
      se(med>m[l][2]) {
        escreva(m[l][2],"\t")
      }
    }
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 953; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
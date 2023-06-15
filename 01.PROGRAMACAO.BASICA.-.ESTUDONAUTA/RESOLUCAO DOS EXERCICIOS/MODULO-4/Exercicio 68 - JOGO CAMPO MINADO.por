  programa
  {
      inclua biblioteca Util --> u
      inclua biblioteca Tipos --> t
    funcao inicio()
    {
      cadeia	jogo[5][5]
      inteiro	l, c, j, pts=0, bomba=0, linhabomba, colunabomba , qtbomba=5, qtjogada=5
      escreva("\n-----------------------------------------------")
      escreva("\n  JOGO CAMPO MINADO")
      escreva("\n-----------------------------------------------")
  
      // POSICIONANDO AS BOMBAS
      faca {
        linhabomba = sorteia(0,u.numero_linhas(jogo)-1)
        colunabomba= sorteia(0,u.numero_colunas(jogo)-1)
        jogo[linhabomba][colunabomba]= "*"
        bomba++
      } enquanto(bomba<= qtbomba)

      // MONTANTO O TABULEIRO
      escreva("\n")
      para(l=0;l<u.numero_linhas(jogo);l++) {
        escreva("\t",l)
      }
      para(l=0;l<u.numero_linhas(jogo);l++) {
        escreva("\n",l)
        para(c=0;c<u.numero_colunas(jogo);c++) {
          se(jogo[l][c]!="*") {
            jogo[l][c]=" "
          }
          escreva("\t?")
        }
      }
      
      // Jogadas
      escreva("\n-----------------------------------------------")
      escreva("\nVocê tem ",qtjogada, " jogadas cada joga vale 2 pts")
      escreva("\n-----------------------------------------------")
      para(j=1;j<=qtjogada;j++) {
        escreva("\nDigite a posição do ", j, " tiro:")
        faca {
          escreva("\nLinha: ")
          leia(l)
        } enquanto(l>=u.numero_linhas(jogo))
        faca {
          escreva("Coluna: ")
          leia(c)
        } enquanto(c>=u.numero_colunas(jogo))
        
        //Jogada repetida - acrecentada por ultimo
        se(jogo[l][c]=="X") {
          escreva("\nVoce ja fez essa jogada")
          escreva("\nJogue novamente")
          faca {
            escreva("\nLinha: ")
            leia(l)
          } enquanto(l>=u.numero_linhas(jogo))
          faca {
            escreva("Coluna: ")
            leia(c)
          } enquanto(c>=u.numero_colunas(jogo))
        }

        // Acertou a bomba
        senao se(jogo[l][c]=="*") {
          escreva("\nVoce Acertou uma Bomba\n")
          jogo[l][c]="#" 
          pare
        }
        
        // Pontuou
        senao {
          escreva("\nURRUL - Ganhou 2 pts\n")
          pts+=2
          jogo[l][c]="X"
          escreva("\n")
          para(l=0;l<u.numero_linhas(jogo);l++) {
            escreva("\t",l)
          }
          para(l=0;l<u.numero_linhas(jogo);l++) {
            escreva("\n",l)
            para(c=0;c<u.numero_colunas(jogo);c++) {
              se(jogo[l][c]=="X") {
                escreva("\t", jogo[l][c])
              }senao {
                escreva("\t?")
              }
            }
          }
        }
      }


      escreva("\n-----------------------------------------------")
      escreva("\n\tFIM DO JOGO VOCÊ FEZ ", pts, " pts")
      se(pts==(qtjogada*2)) {
        escreva("\n\tPARABENS VOCÊ GANHOU")
      }senao {
        escreva("\n\tVoce acertou a bomba")
      }
      escreva("\n-----------------------------------------------")
      escreva("\n")
      para(l=0;l<u.numero_linhas(jogo);l++) {
        escreva("\t",l)
      }
      para(l=0;l<u.numero_linhas(jogo);l++) {
        escreva("\n",l)
        para(c=0;c<u.numero_colunas(jogo);c++) {
          escreva("\t", jogo[l][c])
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
 * @POSICAO-CURSOR = 2875; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {jogo, 7, 13, 4};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
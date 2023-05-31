programa
{
  inclua biblioteca Tipos --> t
  inclua biblioteca Texto --> txt  
  funcao inicio()
  {
    inteiro	c=0, id=0, velho=0, novo=0
    cadeia	tc=" ", nome=" ", sx=" ", resp=" ", nvelho=" ", nnovo=" "
    escreva("\n--------------------------")
    escreva("\n  Cadastro de Amigos") 
    escreva("\n--------------------------\n")
    faca {
      escreva("\nCadastro ", c+1)
      escreva("\n------------------")
      enquanto(verdadeiro) {
        escreva("\nNome:  ")
        leia(tc)
        se(txt.numero_caracteres(tc)>=3) {
          nome=tc
          pare
        } senao {
          escreva("ATENÇÃO - o nome deve conter mais que 3 letras\n\n")
        }
      }
      enquanto(verdadeiro) {
        escreva("Sexo[M/F]: ")
        leia(tc)
        se(tc=="M" ou tc=="m" ou tc=="F" ou tc=="f") {
          sx=tc
          pare
        }senao {
          escreva("Voce deve digitar")
          escreva("\n[M] para MASCULINO")
          escreva("\n[F] para FEMININO\n\n")
        }
      }
      enquanto(verdadeiro) {
        escreva("Idade:  ")
        leia(tc)
        se(t.cadeia_e_inteiro(tc,10)) {
          id=t.cadeia_para_inteiro(tc,10)
          se(id>0 e id<=130) {
            pare
          }senao {
            escreva("A idedade deve ser entre 1 até 130 anos\n\n")
          }
        }senao {
          escreva("Voce deve digitar um numero para idade!\n\n")
        }
      }
      se(c==0) {
        velho=id
        nvelho=nome
        novo=id
        nnovo=nome
      }senao {
        se(id>velho) {
          velho=id
          nvelho=nome
        }
        se(id<novo) {
          novo=id
          nnovo=nome
        }
      }
      c++
      enquanto(verdadeiro) {
        escreva("\nDeseja continuar? [S/N] => ")
        leia(tc)
        tc=txt.caixa_baixa(tc)
        se(tc=="s" ou tc=="n") {
          resp=tc
          pare
        }senao {
          escreva("Voce deve digitar ")
          escreva("\n[S] para SIM")
          escreva("\n[N] para NÃO")
        }
      }
    } enquanto(resp!="n")
    escreva("\n\n========RESULTADOS======")
    escreva("\nVocê cadastrou ", c, " amigos")
    escreva("\nO amigo mais velho é ", nvelho, " com ", velho, " anos")
    escreva("\nO amigo mais novo é ", nnovo, " com ", novo, " anos")
    escreva("\n\n")
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2295; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
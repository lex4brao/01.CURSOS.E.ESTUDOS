programa
{
    inclua biblioteca Util --> u
    inclua biblioteca Tipos --> t
    inclua biblioteca Texto --> txt
  funcao inicio()
  {
    cadeia	nome[10]
    inteiro	idade[10], p, sid=0, velho=0
    real	med
    escreva("\n   Cadastro de Amigos")
    escreva("\n--------------------------------")
    para(p=0;p<u.numero_elementos(nome);p++) {
      escreva("\n Cadastro ", p+1)
      escreva("\n--------------------------------")
      escreva("\nNome: ")
      leia(nome[p])
      nome[p]=txt.caixa_alta(nome[p])
      escreva("Idade:  ")
      leia(idade[p])
      sid+=idade[p]
    }
    escreva("\n\n\tGerando Lista de Amigos")
    u.aguarde(2000)
    limpa()
    escreva("\n")
    escreva("\n\tLISTA DE AMIGOS ")
    escreva("\n-------------------------------")
    escreva("\nNOME\t\t IDADE")
    para(p=0;p<u.numero_elementos(nome);p++) {
      escreva("\n", nome[p], "\t\t ", idade[p])
    }
    escreva("\n-------------------------------")
    u.aguarde(500)
    med= t.inteiro_para_real(sid)/u.numero_elementos(nome)
    escreva("\nA média das idades é ", med)
    escreva("\nOs amigos acima da média é")
    para(p=0;p<u.numero_elementos(nome);p++) {
      se(idade[p]>med) {
        escreva("\n\t- ", nome[p])
      }
      se(p==0) {
        velho=idade[p]
      }senao {
        se(idade[p]>velho) {
          velho=idade[p]
        }
      }
    }
    escreva("\n-------------------------------")
    u.aguarde(500)
    escreva("\nSeu amigo mais velho tem ", velho, " anos é:")
    para(p=0;p<u.numero_elementos(nome);p++) {
      se(velho==idade[p]) {
        escreva("\n\t- ", nome[p])
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
 * @POSICAO-CURSOR = 176; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
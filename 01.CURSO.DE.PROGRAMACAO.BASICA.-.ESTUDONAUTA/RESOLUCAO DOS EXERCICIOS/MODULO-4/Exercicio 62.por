programa
{
    inclua biblioteca Util --> u
    inclua biblioteca Texto --> txt
  funcao inicio()
  {
    cadeia	nome[4], sexo[4]
    real	sal[4]
    inteiro	p
    escreva("\n------------------------------")
    escreva("\n  CADASTRO DE FUNCIONÁRIOS")
    escreva("\n------------------------------")
    para(p=0;p<u.numero_elementos(nome);p++) {
      escreva("\nCadastro ", p+1)
      escreva("\nNome:  ")
      leia(nome[p])
      nome[p]=txt.caixa_alta(nome[p])
      escreva("Sexo[M/F]: ")
      leia(sexo[p])
      sexo[p]= txt.caixa_alta(sexo[p])
      escreva("Salário  R$:")
      leia(sal[p])
    }
    escreva("\n\n\t\t CADASTROS FINALIZADOS")
    escreva("\n\t\t GERANDO LISTA DE FUNCIONARIOS")
    u.aguarde(2000)
    limpa()
    escreva("\n")
    escreva("\n\t\t LISTA DE FUNCIONÁRIOS")
    escreva("\n--------------------------------------------------------")
    u.aguarde(200)
    escreva("\nNome\t\t\t Sexo\t\t\tSalário")
    escreva("\n")
    u.aguarde(200)
    para(p=0;p<u.numero_elementos(nome);p++) {
      escreva("\n", nome[p], "\t\t\t ", sexo[p], "\t\t\t R$", sal[p])
      u.aguarde(200)
    }
    escreva("\n\n")
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 464; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
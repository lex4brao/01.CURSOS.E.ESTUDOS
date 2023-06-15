programa
{
    inclua biblioteca Matematica --> m
  funcao inicio()
  {
    real peso
    inteiro	op
    cadeia	plan = " "
    escreva("\n------------------------------")
    escreva("\nSeu peso em outro planeta")
    escreva("\n------------------------------")
    escreva("\nEscolha a opção:")
    escreva("\n\t [1] - Mercúrio")
    escreva("\n\t [2] - Vênus")
    escreva("\n\t [3] - Marte")
    escreva("\n\t [4] - Jupter")
    escreva("\n\t [5] - Saturno")
    escreva("\n\t [6] - Urano")
    escreva("\n\t [7] - Netuno")
    escreva("\n>>> ")
    leia(op) 
    escreva("\nQual é seu peso atualç [Kgr]")
    escreva("\n>>> ")
    leia(peso)
    
    escolha(op) 
    {
      caso 1:
        peso = peso *  0.37
        plan = "Mercúrio"
      pare
      caso 2:
        peso = peso *  0.88
        plan = "Vênus"
      pare
      caso 3:
        peso = peso *  0.38
        plan = "Marte"
      pare
      caso 4:
        peso = peso *  2.64
        plan = "Jupter"
      pare
      caso 5:
        peso = peso *  1.15
        plan = "Saturno"
      pare
      caso 6:
        peso = peso *  1.17
        plan = "Urano"
      pare
      caso 7:
        peso = peso *  1.18
        plan = "Nertuno"
      pare
    }

    escreva("\n")
    escreva("\nSeu peso em ", plan, " será ", m.arredondar(peso,2))
    escreva("\n\n")
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 599; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
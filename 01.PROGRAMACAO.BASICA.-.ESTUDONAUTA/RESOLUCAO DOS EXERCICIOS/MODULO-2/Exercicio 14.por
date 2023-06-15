programa
{
    
  funcao inicio()
  {
    real compra
    escreva("\nQual o Valor total da compra?")
    escreva("\n>> R$")
    leia(compra)
    escreva("\nObrigado, Volte sempre")
    se(compra>200)
      {
        escreva("\nA T E N Ç Ã O ")
        escreva("\nVocê ganhou 10% de desconto na sua compra")
        escreva("\nO valor total da sua compra é de R$", (compra*0.90))
      }
    escreva("\n\n")
  }
}
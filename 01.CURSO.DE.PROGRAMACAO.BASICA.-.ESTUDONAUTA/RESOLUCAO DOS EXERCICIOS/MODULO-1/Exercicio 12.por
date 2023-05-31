programa
{
  inclua biblioteca Texto --> txt
  funcao inicio()
  {
    cadeia nome, pnome
    escreva("\nQual é seu nome Completo? ")
    escreva("\n>> ")
    leia(nome)
    inteiro	pos = txt.posicao_texto(" ", nome, 0)
    pnome = txt.extrair_subtexto(nome, 0, pos)
    escreva("\nSeu primeiro nome é ", txt.caixa_alta(pnome))

    escreva("\n\n")
  }
}
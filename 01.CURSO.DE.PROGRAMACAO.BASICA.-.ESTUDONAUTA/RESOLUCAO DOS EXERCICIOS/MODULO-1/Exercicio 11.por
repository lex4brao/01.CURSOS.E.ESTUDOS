programa
{
  inclua biblioteca Texto --> txt  
  funcao inicio()
  {
    cadeia	cid
    escreva("\nQual no nome da cidade onde você mora")
    escreva("\n>>  ")
    leia(cid)
    escreva("\n")
    escreva("\nA primeira letra do nome da cidade é ", txt.obter_caracter(cid, 0))
    escreva("\n", cid, " tem ", txt.numero_caracteres(cid))
    escreva("\n\n")
  }
}

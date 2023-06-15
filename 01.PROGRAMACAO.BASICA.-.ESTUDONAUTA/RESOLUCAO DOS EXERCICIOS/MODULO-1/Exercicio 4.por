programa
{
  inclua biblioteca Tipos --> t   
  funcao inicio()
  {
    real	n1, n2
    escreva("\nDigite um numero")
    escreva("\n>> ")
    leia(n1)
    escreva("\nDigite outro numero")
    escreva("\n>> ")
    leia(n2)
    escreva("\n")
    escreva("\nA soma de ", n1, " + ", n2, " = ", n1+n2)
    escreva("\nA subtração de ", n1, " - ", n2, " = ", n1-n2)
    escreva("\nA multiplicação de ", n1, " * ", n2, " = ", n1*n2)
    escreva("\nA divisão inteira ", n1, " / ", n2, " = ", (t.real_para_inteiro(n1)/t.real_para_inteiro(n2)))
    escreva("\nA divisão real de ", n1, " / ", n2, " = ", n1/n2)
    escreva("\nA resto da divisão de ", n1, " % ", n2, " = ", (t.real_para_inteiro(n1)%t.real_para_inteiro(n2)))
    escreva("\n\n")
  }
}

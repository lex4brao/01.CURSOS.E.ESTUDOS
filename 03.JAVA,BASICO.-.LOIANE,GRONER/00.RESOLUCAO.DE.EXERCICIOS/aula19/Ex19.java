package aula19;

import java.util.Random;

public class Ex19 {
    public static void main(String[] args) {
        Random random = new Random();
        double[] nota1 = new double[10];
        double[] nota2 = new double[10];
        double[] med = new double[10];
        for (int i=0;i< med.length;i++){
            nota1[i] = random.nextDouble(10);
            nota2[i] = random.nextDouble(10);
            med[i] = (nota1[i]+nota2[i])/2;
        }
        System.out.println("Aluno  \t     Nota 1\tNota 2 \tMédia");
        for (int i=0;i< med.length;i++){
            System.out.printf("Aluno "+i+": ");
            System.out.printf("\t %.2f",nota1[i]);
            System.out.printf("\t %.2f",nota2[i]);
            System.out.printf("\t %.2f",med[i]);
            if (med[i]>=7){
                System.out.printf("  Aprovado\n");
            } else {
                System.out.printf("  REPROVADO\n");
            }
        }
    }
}

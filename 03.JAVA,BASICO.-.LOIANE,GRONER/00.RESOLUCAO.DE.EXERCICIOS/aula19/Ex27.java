package aula19;

public class Ex27 {
    public static void main(String[] args) {
        long[] vetA = new long[10];
        long[] vetB = new long[vetA.length];
        for (int i=0;i< vetA.length;i++){
            vetA[i]=Math.round(Math.random()*100);
            vetB[((vetA.length-i)-1)]=vetA[i];
        }
        for (int i=0;i< vetA.length;i++){
            System.out.printf(" "+vetA[i]);
        }
        System.out.println();
        for (int i=0;i< vetB.length;i++){
            System.out.printf(" "+vetB[i]);
        }

    }
}

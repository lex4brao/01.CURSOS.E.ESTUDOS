package aula19;

public class Ex24 {
    public static void main(String[] args) {
        long[] vetA = new long[10];
        long[] vetB = new long[10];
        for (int i=0;i< vetA.length;i++){
            vetA[i]= Math.round(Math.random()*10);
            if (vetA[i]%2==0){
                vetB[i]=1;
            }else {
                vetB[i]=0;
            }
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

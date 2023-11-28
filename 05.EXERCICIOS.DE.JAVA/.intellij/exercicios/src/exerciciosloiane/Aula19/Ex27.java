package exerciciosloiane.Aula19;

public class Ex27 {
  public static void main(String[] args) {
    int[] vetA = new int[]{0,1,2,3,4,5,6,7,8,9};
    int[] vetB =new int[vetA.length];
    for (int i = 0; i < vetB.length ; i++) {
      vetB[vetA.length-1-i] = vetA[i];
    }
    System.out.println();
    System.out.println();
    for (int valor:vetA){
      System.out.printf(" %2d ", valor);
    }
    System.out.println();
    for (int valor:vetB){
      System.out.printf(" %2d ", valor);
    }
  }
}

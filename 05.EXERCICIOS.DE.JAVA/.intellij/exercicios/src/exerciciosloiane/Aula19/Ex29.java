package exerciciosloiane.Aula19;

public class Ex29 {
  public static void main(String[] args) {
    double[] vet = new double[20];
    for (int i = 0; i < vet.length; i++) {
      vet[i]=Math.pow(2,i);

      System.out.printf(" 2^%-2d = ",i);
      System.out.println(vet[i]);
    }
  }
}

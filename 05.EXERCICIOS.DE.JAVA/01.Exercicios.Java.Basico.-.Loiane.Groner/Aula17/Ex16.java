package exerciciosloiane.Aula17;

public class Ex16 {
  public static void main(String[] args) {
    int n1 = 0;
    int n2 = 1;
    int n3=0;
    System.out.print("\n"+n1+"-"+n2+"-");
    while (n3<500){
      n3 = n1+n2;
      if (n3>500){
        System.out.print(n3);
      } else {
        System.out.print(n3+"-");
      }
      n1 = n2;
      n2 = n3;
    }
  }
}

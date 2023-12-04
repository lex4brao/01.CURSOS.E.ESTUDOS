package CAP06.ex2prop;

public class Ex05 {
  public static void main(String[] args) {
    int[] logica = { 1002, 1003, 1004, 1005, 1007, 1009, 1011, 1012, 1013, 1014, 1015, 1016};
  int[] linguagem = {1001, 1003, 1004, 1005, 1006, 1009, 1010, 1011, 1013, 1014, 1015, 1017};
    System.out.println("A matriculas que estão nos dois cursos são ");
    for (int i = 0; i < logica.length ; i++) {
      System.out.print((logica[i]==linguagem[i])?(linguagem[i]+"\n"):"");
    }
  }
}

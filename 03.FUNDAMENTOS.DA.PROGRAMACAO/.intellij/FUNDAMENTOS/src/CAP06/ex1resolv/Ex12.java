package CAP06.ex1resolv;

public class Ex12 {
  public static void main(String[] args) {

    String[] modelosCarros = {"Fusca", "Gol", "Vectra", "Civic", "Corolla"};
    double[] consumoCarros = {12.5, 14.2, 10.8, 16.5, 18.3};
    double menor= Double.MAX_VALUE;
    String menorMod="";
    for (int i = 0; i < consumoCarros.length; i++) {
      menor = Math.min(consumoCarros[i], menor);
      if (Math.min(consumoCarros[i], menor)==consumoCarros[i]){
        menorMod = modelosCarros[i];
      }
    }
    for (int i = 0; i < modelosCarros.length; i++) {
      double consumo1000=1000;
      consumo1000/=consumoCarros[i];
      System.out.printf("%-10s", modelosCarros[i]);
      System.out.printf("%-10.2f Litros em 1000km%n", consumo1000);
    }
    System.out.println("O Carro com menor consumo: ");
    System.out.println("\t "+menorMod+" Cosumo "+menor+" km/l");


  }
}

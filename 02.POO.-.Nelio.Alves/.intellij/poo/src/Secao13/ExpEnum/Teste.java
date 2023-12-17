package Secao13.ExpEnum;

public class Teste {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(508, "televisão", Status.Entregando);
        Status status = Status.Pagamento;
        Status status2 = Status.valueOf("Processando");

    }
}

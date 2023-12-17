package exerciciosloiane.Aula52;

public class Agenda {
    private Contato[] contatos;
    public Agenda(){
        contatos = new Contato[5];
    }
    public void adicionarContato(Contato contato) throws AgendaLotada {
        if (contato.getId()>=contatos.length){
            throw new AgendaLotada("Agenda está lotada");
        }
        contatos[contato.getId()] = contato;
    }

    public Contato getContato(int id) {
        return contatos[id];
    }

    public void BuscarContato(String nome) {
        boolean existe = false;
        for (Contato contato : contatos){
            if (contato.getNome().equalsIgnoreCase(nome)){
                System.out.println(contato);
                existe = true;
            }
        }
        if (!existe){
            throw new ContatoNaoExiste("Contato não existe");
        }
    }
}

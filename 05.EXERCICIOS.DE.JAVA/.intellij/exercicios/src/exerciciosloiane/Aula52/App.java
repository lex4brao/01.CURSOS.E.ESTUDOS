package exerciciosloiane.Aula52;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();
        Contato contato1 = new Contato("João", "454654654");
        Contato contato2 = new Contato("Maria", "987654321");
        Contato contato3 = new Contato("Carlos", "123456789");
        Contato contato4 = new Contato("Ana", "555666777");
        Contato contato5 = new Contato("Pedro", "999888777");

        try {
            agenda.adicionarContato(contato1);
            agenda.adicionarContato(contato2);
            agenda.adicionarContato(contato3);
            agenda.adicionarContato(contato4);
            agenda.adicionarContato(contato5);
        } catch (AgendaLotada e) {
            System.out.println("Agenda Lotada");
            e.printStackTrace();
        }
        int resp;
        do {
            System.out.println("Menu");
            System.out.println("0 - Sair");
            System.out.println("1 - Cadastra Contato");
            System.out.println("2 - Buscar contato");
            System.out.print(">> ");
            resp = sc.nextInt();
            sc.nextLine();
            if (resp==0){

            } else  if (resp==1){
                sc.nextLine();
                System.out.println("cadastra contato");
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Telefone: ");
                String telefone=sc.nextLine();
                Contato contatoadd = new Contato(nome, telefone);
                try {
                    agenda.adicionarContato(contatoadd);
                } catch (AgendaLotada e) {
                    System.out.println("Agenda Lotada");
                    e.printStackTrace();

                } catch ( ArrayIndexOutOfBoundsException e){
                    System.out.println("Array lotado");
                }
            } else if (resp==2) {
                System.out.println("Digite o nome que deseja buscar");
                System.out.println("Nome: ");
                String nome = sc.nextLine();
                try {
                agenda.BuscarContato(nome);
                } catch (ContatoNaoExiste e){
                    System.out.println(e.getMessage());
                }

            }
        } while (resp != 0);

    }
}

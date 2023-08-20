package aula20;

import java.util.Scanner;

public class Ex02V2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[][] agenda = new String[31][24];
        int op=0, dia=0, hora=0;
        String resp="s";
        for (int i=0; i<agenda.length;i++){
            for (int j=0; j<agenda[i].length;j++){
                agenda[i][j]="Sem compromisso";
            }
        }
        /*for (int i=0; i<agenda.length;i++){
            for (int j=0; j<agenda[i].length;j++){
                System.out.println(agenda[i][j]);
            }
            System.out.println();
        }*/
        System.out.println("Agenda");
         do {
                System.out.println("Digite a opção desejada");
                System.out.println("[1] - Para ver compromissos");
                System.out.println("[2] - Listar compromissos do dia");
                System.out.println("[3] - Para cadastrar compromissos");
                System.out.printf(">> ");
                op = sc.nextInt();
                switch (op){
                    case 1:
                        System.out.printf("Qual o dia: ");
                        dia = sc.nextInt();
                        System.out.printf("Qual a hora: ");
                        hora = sc.nextInt();
                        System.out.println("Dia: "+dia+" ás "+hora+":00 - "+agenda[dia][hora]);
                        System.out.println();
                        break;
                    case 2:
                        System.out.printf("Qual o dia: ");
                        dia = sc.nextInt();
                        for (int i=0; i<agenda[dia].length;i++){
                            System.out.println(i+":00 hrs - "+agenda[dia][i]);
                        }
                        System.out.println();
                        break;
                    case 3:
                        System.out.printf("Qual o dia: ");
                        dia = sc.nextInt();
                        System.out.printf("Qual a hora: ");
                        hora = sc.nextInt();
                        System.out.printf("Digite o compromisso: ");
                        sc.nextLine();
                        agenda[dia][hora] = sc.nextLine();
                        System.out.println();
                        break;
                    default:
                        System.out.println("Opção Inválida");
                        continue ;
                }
            System.out.println("Deseja continuar? [S]im ou [N]ão");
            System.out.printf(">> ");
            resp= sc.next();
        }while (resp.equalsIgnoreCase("s"));
        System.out.println();
        System.out.println("Obrigado volte sempre");
    }
}

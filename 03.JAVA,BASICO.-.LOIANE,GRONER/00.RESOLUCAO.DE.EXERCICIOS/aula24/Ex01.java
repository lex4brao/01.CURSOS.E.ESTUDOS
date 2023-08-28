package aula24;

import aula24.ex01.Lampada;

public class Ex01 {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.modelo = "A60";
        lampada.tensao = "bivolt";
        lampada.potencia = 15;
        lampada.tipo = "branca";
        System.out.println(lampada);
    }
}

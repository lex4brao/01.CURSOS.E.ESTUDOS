package exerciciosloiane.Aula43.Ex03;

public class Peixe extends Animal{
    private String caracteristicas;


    public Peixe(){
        setPatas(0);
        setAmbiente("Mar");
        setCor("Cinzento");
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
}

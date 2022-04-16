package Entidades;

public class Cadena {

    private String frase;
    private Integer numeroFijoDeJuan;

    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + '}';
    }

}

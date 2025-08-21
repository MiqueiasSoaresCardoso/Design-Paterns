package Decorator;

public class Aventureiro implements Personagem{

    @Override
    public String getDescricao() {
        return "Aventureiro Básico, pronto para a jornada";
    }

    @Override
    public double getDano() {
        return 10; //Dano de soco
    }

    @Override
    public String toString() {
        return "Aventureiro " + getDescricao();
    }
}

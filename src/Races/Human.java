package Races;

import gameProject.Raca;

public class Human extends Raca {

    private int inteligencia;
    public Human(String caracteristicas) {
        super("A classe mais inteligente");
        this.inteligencia = 20;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }
}

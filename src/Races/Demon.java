package Races;

import gameProject.Raca;

public class Demon extends Raca {

    private boolean magia;
    public Demon(String caracteristicas) {
        super("A unica que usa magia");
        this.magia = true;
    }

    public boolean isMagia() {
        return magia;
    }

    public void setMagia(boolean magia) {
        this.magia = magia;
    }
}

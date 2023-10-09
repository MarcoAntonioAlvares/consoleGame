package Races;

import gameProject.Raca;

public class Orc extends Raca {

    private int forca;

    public Orc(String caracteristicas) {
        super("Raca mais forte de todas");
        this.forca = 20;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        forca = forca;
    }
}

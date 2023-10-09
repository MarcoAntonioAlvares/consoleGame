package Races;

import gameProject.Raca;

public class Elf extends Raca {
    private int agilidade;


    public Elf() {
        super("Agilidade maior que as outras racas");
        this.agilidade = 20; //

    }

    public int getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }


}


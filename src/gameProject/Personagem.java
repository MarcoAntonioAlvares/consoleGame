package gameProject;

public class Personagem {

    public String nome;

    public Raca raca;

    public int nivel;

    public int HP;

    public int experiencia;

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Raca getRaca() {
        return raca;
    }

    public void setRaca(Raca raca) {
        this.raca = raca;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        if (nivel >= 0) {
            this.nivel = nivel;
        } else {
            throw new IllegalArgumentException("O nivel não pode ser negativo");
        }
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        if (HP >= 1) {
            this.HP = HP;
        }
        else if (HP == 0){
                throw new IllegalArgumentException("Voce esta Morto!!"); }
        else {
            throw new IllegalArgumentException("O HP não pode ser negativo");
        }

    }
    public void atacar(Personagem alvo, int poderDeAtaque) {
        if (poderDeAtaque > 0) {
            alvo.receberDano(poderDeAtaque);
            System.out.println(this.nome + " atacou " + alvo.getNome() + " causando " + poderDeAtaque + " de dano!");
        } else {
            System.out.println(this.nome + " atacou " + alvo.getNome() + ", mas o ataque não causou dano!");
        }
    }

    private void receberDano(int danoCausado) {
    }

    public void ganharExperiencia(int experienciaGanha) {
        this.experiencia += experienciaGanha;
        System.out.println(this.nome + " ganhou " + experienciaGanha + " de experiência.");
        verificarNivel();
    }

    private void verificarNivel() {
    }


    public boolean fugirDeBatalha() {
        boolean conseguiuFugir = Math.random() < 0.5;
        if (conseguiuFugir) {
            System.out.println(this.nome + " conseguiu fugir da batalha!");
        } else {
            System.out.println(this.nome + " tentou fugir, mas não teve sucesso e continua na batalha.");
        }
        return conseguiuFugir;
    }


    public Personagem(String nome, Raca raca, int nivel, int HP) {
        this.nome = nome;
        this.raca = raca;
        this.nivel = 1;
        this.HP = 100;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                ", nivel=" + nivel +
                ", HP=" + HP +
                '}';
    }
}

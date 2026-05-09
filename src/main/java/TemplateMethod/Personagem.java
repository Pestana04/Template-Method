package TemplateMethod;

public abstract class Personagem {

    private String nome;
    private int nivel;
    private int vida;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }


    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public abstract int calcularDano();

    public abstract String usarHabilidade();

    public String getTipo() {
        return "Personagem";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "nome='" + this.nome + '\'' +
                ", nivel=" + this.nivel +
                ", vida=" + this.vida +
                ", dano=" + this.calcularDano() +
                ", habilidade='" + this.usarHabilidade() + '\'' +
                '}';
    }
}
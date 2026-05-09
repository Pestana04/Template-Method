package TemplateMethod;

public class PersonagemGuerreiro extends Personagem {

    public int calcularDano() {
        return 20;
    }

    public String usarHabilidade() {
        return "Golpe pesado";
    }

    @Override
    public String getTipo() {
        return "Guerreiro";
    }
}
package TemplateMethod;

public class PersonagemArqueiro extends Personagem {

    public int calcularDano() {
        return 15;
    }

    public String usarHabilidade() {
        return "Disparo preciso";
    }

    @Override
    public String getTipo() {
        return "Arqueiro";
    }
}
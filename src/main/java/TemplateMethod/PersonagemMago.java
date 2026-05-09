package TemplateMethod;

public class PersonagemMago extends Personagem {

    public int calcularDano() {
        return 30;
    }

    public String usarHabilidade() {
        return "Bola de fogo";
    }

    @Override
    public String getTipo() {
        return "Mago";
    }
}
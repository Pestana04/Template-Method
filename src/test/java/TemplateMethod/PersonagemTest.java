package TemplateMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonagemTest {

    @Test
    void deveRetornarInfoGuerreiro() {
        PersonagemGuerreiro personagem = new PersonagemGuerreiro();
        personagem.setNome("Thorin");
        personagem.setNivel(5);
        personagem.setVida(100);

        assertEquals(
                "Guerreiro{nome='Thorin', nivel=5, vida=100, dano=20, habilidade='Golpe pesado'}",
                personagem.getInfo()
        );
    }

    @Test
    void deveRetornarInfoMago() {
        PersonagemMago personagem = new PersonagemMago();
        personagem.setNome("Merlin");
        personagem.setNivel(7);
        personagem.setVida(70);

        assertEquals(
                "Mago{nome='Merlin', nivel=7, vida=70, dano=30, habilidade='Bola de fogo'}",
                personagem.getInfo()
        );
    }

    @Test
    void deveRetornarInfoArqueiro() {
        PersonagemArqueiro personagem = new PersonagemArqueiro();
        personagem.setNome("Legolas");
        personagem.setNivel(6);
        personagem.setVida(85);

        assertEquals(
                "Arqueiro{nome='Legolas', nivel=6, vida=85, dano=15, habilidade='Disparo preciso'}",
                personagem.getInfo()
        );
    }
}
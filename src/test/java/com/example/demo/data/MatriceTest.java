package com.example.demo.data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class MatriceTest {

    private Echantillon echantillon;

    @BeforeEach
    public void setUp() {
        echantillon = new Echantillon();
    }

    @Test
    public void testAjoutVoitureUnique() {
        Voiture voiture = new Voiture("Renault", 20000);
        echantillon.ajouter(voiture);

        ArrayList<Voiture> voitures = echantillon.getVoitures();
        assertEquals(1, voitures.size());
        assertEquals(voiture, voitures.get(0));
    }

    @Test
    public void testAjoutPlusieursVoitures() {
        Voiture voiture1 = new Voiture("Peugeot", 18000);
        Voiture voiture2 = new Voiture("Citroen", 22000);
        echantillon.ajouter(voiture1);
        echantillon.ajouter(voiture2);

        ArrayList<Voiture> voitures = echantillon.getVoitures();
        assertEquals(2, voitures.size());
        assertTrue(voitures.contains(voiture1));
        assertTrue(voitures.contains(voiture2));
    }

    @Test
    public void testCalculPrixMoyenAvecUneVoiture() {
        Voiture voiture = new Voiture("Renault", 20000);
        echantillon.ajouter(voiture);

        float prixMoyen = echantillon.prixMoyen();
        assertEquals(20000.0f, prixMoyen);
    }

    @Test
    public void testCalculPrixMoyenAvecPlusieursVoitures() {
        Voiture voiture1 = new Voiture("Renault", 20000);
        Voiture voiture2 = new Voiture("Peugeot", 18000);
        echantillon.ajouter(voiture1);
        echantillon.ajouter(voiture2);

        float prixMoyen = echantillon.prixMoyen();
        assertEquals((20000.0f + 18000.0f) / 2, prixMoyen);
    }

    @Test
    public void testCalculPrixMoyenAucuneVoiture() {
        assertThrows(ArithmeticException.class, () -> echantillon.prixMoyen());
    }
}

package com.example.demo.data;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EchantillonTest {

    @Test
    void creerEchantillon() {
        Echantillon e = new Echantillon();

        Voiture v1 = new Voiture("Peugeot", 13400);
        Voiture v2 = new Voiture("Suzuki", 15000);

        e.ajouter(v1);
        e.ajouter(v2);

        Assertions.assertEquals(e.arraySize(), 2);
        Assertions.assertNotNull(e.getVoiture(1));
        Assertions.assertSame(v1, e.getVoiture(0));
    }

    @Test
    void testThrows() {
        Echantillon e = new Echantillon();
        Assertions.assertThrows(ArithmeticException.class, () -> e.prixMoyen());
    }

    @Test
    void testPrixMoyen() {
        Echantillon e = new Echantillon();
        Voiture v1 = new Voiture("Renault", 45000);
        Voiture v2 = new Voiture("Mercedes-Benz", 150000);
        Voiture v3 = new Voiture("Audi", 84000);
        e.ajouter(v1);
        e.ajouter(v2);
        e.ajouter(v3);

        Assertions.assertEquals(93000, e.prixMoyen());
    }
}

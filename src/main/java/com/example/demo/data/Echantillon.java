package com.example.demo.data;

import com.example.demo.service.Statistique;

import java.util.ArrayList;

public class Echantillon implements Statistique {

    private ArrayList<Voiture> echantillons ;

    public Echantillon() {
        this.echantillons = new ArrayList<Voiture>();
    }

    public void ajouter(Voiture voiture) {
        this.echantillons.add(voiture);
    }

    @Override
    public float prix() throws ArithmeticException {
        float total = 0;
        for (int i=0; i<echantillons.size(); i++) {
            total = total + echantillons.get(i).getPrix();
        }
        return total;
    }

    public float prixMoyen() throws ArithmeticException {
        if (echantillons.size() == 0) {
            throw new ArithmeticException("L'ArrayList est vide");
        }
        float total = 0;
        for (int i=0; i<echantillons.size(); i++) {
            total = total + echantillons.get(i).getPrix();
        }
        total = total / echantillons.size();
        return total;
    }

    public int arraySize() {
        return this.echantillons.size();
    }

    public Voiture getVoiture(int i) {
        return this.echantillons.get(i);
    }

    public ArrayList<Voiture> getVoitures() {
        return echantillons ;
    }
}

package fr.umontpellier.iut;

import java.time.LocalDate;
import java.time.LocalTime;

public class Produit {

    private int numero;
    private String description;
    private int prixCourant;
    private LocalDate dateDebut;
    private LocalTime heureDebut;
    private LocalDate dateFin;
    private LocalTime heureFin;
    private boolean enVente=false;
    private int pasEnchere;
    private int coutParticipation;

    public void setPasEnchere(int pasEnchere) {
        this.pasEnchere = pasEnchere;
    }

    public Produit(int numero, String description, int prixCourant, int coutParticipation) {
        this.numero = numero;
        this.description = description;
        this.prixCourant = prixCourant;
        this.coutParticipation = coutParticipation;
    }


    public void demarrerEnchere () {
        this.dateDebut = LocalDate.now();
        this.heureDebut = LocalTime.now();
        this.enVente=true;
    }

    public void arreterEnchere () {
        this.dateFin = LocalDate.now();
        this.heureFin = LocalTime.now();
        this.enVente=false;
    }


    @Override
    public String toString() {
        return "Produit{" +
                "numero=" + numero +
                ", description='" + description + '\'' +
                ", prixCourant=" + prixCourant +
                ", dateDebut=" + dateDebut +
                ", heureDebut=" + heureDebut +
                ", dateFin=" + dateFin +
                ", heureFin=" + heureFin +
                ", enVente=" + enVente +
                ", pasEnchere=" + pasEnchere +
                ", coutParticipation=" + coutParticipation +
                '}';
    }
}

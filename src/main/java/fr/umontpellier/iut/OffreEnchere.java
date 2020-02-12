package fr.umontpellier.iut;

import java.time.LocalDate;
import java.time.LocalTime;

public class OffreEnchere {

    private LocalDate dateOffre;
    private LocalTime heureOffre;
    private double prixEnCour;
    private double prixMax;


    public OffreEnchere(double prixEnCour, double prixMax) {
        this.prixEnCour = prixEnCour;
        this.prixMax = prixMax;
    }




    @Override
    public String toString() {
        return "OffreEnchere{" +
                "dateOffre=" + dateOffre +
                ", heureOffre=" + heureOffre +
                ", prixEnCour=" + prixEnCour +
                ", prixMax=" + prixMax +
                '}';
    }

    public double getPrixEnCour() {
        return prixEnCour;
    }

    public double getPrixMax() {
        return prixMax;
    }

    public void setPrixEnCour(double prixEnCour) {
        this.prixEnCour = prixEnCour;
    }



}

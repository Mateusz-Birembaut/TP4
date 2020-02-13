package fr.umontpellier.iut;

import java.time.LocalDate;
import java.time.LocalTime;

public class OffreEnchere {

    private LocalDate dateOffre;
    private LocalTime heureOffre;
    private double prixPropose;
    private double prixMax;


    public OffreEnchere(double prixPropose, double prixMax) {
        this.prixPropose = prixPropose;
        this.prixMax = prixMax;
    }


    @Override
    public String toString() {
        return "OffreEnchere{" +
                "dateOffre=" + dateOffre +
                ", heureOffre=" + heureOffre +
                ", prixEnCour=" + prixPropose +
                ", prixMax=" + prixMax +
                '}';
    }

    public double getPrixPropose() {
        return prixPropose;
    }

    public double getPrixMax() {
        return prixMax;
    }

    public void setPrixEnCour(double prixEnCour) {
        this.prixPropose = prixEnCour;
    }



}

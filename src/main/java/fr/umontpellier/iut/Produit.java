package fr.umontpellier.iut;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Produit {

    private int numero;
    private String description;
    private double prixCourant;
    private LocalDate dateDebut;
    private LocalTime heureDebut;
    private LocalDate dateFin;
    private LocalTime heureFin;
    private boolean enVente=false;
    private double pasEnchere;
    private double coutParticipation;
    private ArrayList<OffreEnchere> listeOffres;

    public void setPasEnchere(int pasEnchere) {
        this.pasEnchere = pasEnchere;
    }

    public Produit(int numero, String description, double prixCourant, double coutParticipation) {
        this.numero = numero;
        this.description = description;
        this.prixCourant = prixCourant;
        this.coutParticipation = coutParticipation;
        this.listeOffres = new ArrayList<>();
        this.pasEnchere = 5;
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

    public void ajouterOffre(OffreEnchere a){
        if (a.getPrixPropose()-this.prixCourant>=this.pasEnchere && this.enVente ){
            this.listeOffres.add(a);
            this.prixCourant = a.getPrixPropose();
        }
    }

    public String gagnant(){
        if (!this.listeOffres.isEmpty()){
            OffreEnchere offreGagnante = this.listeOffres.get(0);
            for (int i = 1; i < this.listeOffres.size(); i++) {
                if (this.listeOffres.get(i).getPrixPropose()>offreGagnante.getPrixPropose()){
                    offreGagnante = this.listeOffres.get(i);
                }
            }
            return offreGagnante.toString();
        }
        return ("Pas d'offres trouvé");
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
                ", listeOffres=" + listeOffres +
                '}';
    }
}

package fr.umontpellier.iut;

import java.util.ArrayList;


public class Compte {

    private String pseudo;
    private String email;
    private String adresse;
    private double soldeCompte;
    private ArrayList<OffreEnchere>ListeEnchere;


    public Compte(String pseudo, String email, String adresse, double soldeCompte) {
        this.pseudo = pseudo;
        this.email = email;
        this.adresse = adresse;
        this.soldeCompte = soldeCompte;
        this.ListeEnchere = new ArrayList<>();
    }

    public void crediter(double somme){
        this.soldeCompte += somme;
    }


    public void creerOffre(Produit a,double prixCourant, double prixMax) {
        if (this.soldeCompte >= prixMax) {
            this.ListeEnchere.add(new OffreEnchere(prixCourant, prixMax));
            a.ajouterOffre(new OffreEnchere(prixCourant, prixMax));
        }
    }


    @Override
    public String toString() {
        return "Compte{" +
                "pseudo='" + pseudo + '\'' +
                ", email='" + email + '\'' +
                ", adresse='" + adresse + '\'' +
                ", soldeCompte=" + soldeCompte +
                ", ListeEnchere=" + ListeEnchere +
                '}';
    }
}

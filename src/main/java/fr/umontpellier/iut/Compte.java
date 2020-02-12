package fr.umontpellier.iut;

import java.util.ArrayList;


public class Compte {

    private String pseudo;
    private String email;
    private String adresse;
    private double soldeCompte;
    private ArrayList<String> listeOffres = new ArrayList<String>();


    public Compte(String pseudo, String email, String adresse, double soldeCompte) {
        this.pseudo = pseudo;
        this.email = email;
        this.adresse = adresse;
        this.soldeCompte = soldeCompte;
    }

    public void crediter(double somme){
        this.soldeCompte += somme;
    }


    public void creerOffre(Produit a,double prixCourant, double prixMax) {
    }



    @Override
    public String toString() {
        return "Compte{" +
                "pseudo='" + pseudo + '\'' +
                ", email='" + email + '\'' +
                ", adresse='" + adresse + '\'' +
                ", soldeCompte=" + soldeCompte +
                '}';
    }
}

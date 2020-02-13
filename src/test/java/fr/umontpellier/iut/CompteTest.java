package fr.umontpellier.iut;

import org.junit.jupiter.api.Test;


class CompteTest {

    private Compte GeGe = new Compte("GeGe","ergzerg@gmail.com","78 rue Truc",100000.045);
    private Produit Ecran = new Produit(1,"Superbe ecran 4k rotatif",100,100);


    @Test
    public void test_crediter() {

        System.out.println(Ecran);
        System.out.println(GeGe);
        GeGe.crediter(1000.52);
        System.out.println(GeGe);

    }


    @Test
    public void test_creerOffre() {

        Ecran.setPasEnchere(10);
        System.out.println(GeGe.toString());
        GeGe.crediter(1000.52);
        System.out.println(GeGe.toString());
        GeGe.creerOffre(Ecran,2000,12000);
        System.out.println(GeGe);

    }

    @Test
    public void test_gagnant() {
        Ecran.demarrerEnchere();
        GeGe.creerOffre(Ecran,2000,12000);
        System.out.println(Ecran.gagnant());

    }

}
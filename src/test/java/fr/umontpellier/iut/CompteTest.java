package fr.umontpellier.iut;

import org.junit.jupiter.api.Test;


class CompteTest {



    @Test
    public void test_produit() {
    Compte GeGe = new Compte("GeGe","ergzerg@gmail.com","78 rue Truc",100.045);
    System.out.println(GeGe.toString());
    GeGe.crediter(1000.52);
    System.out.println(GeGe.toString());

    }

}
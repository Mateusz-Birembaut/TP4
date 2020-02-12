package fr.umontpellier.iut;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProduitTest {

    @Test
    public void test_produit() {
        Produit Ecran = new Produit(1,"Superbe ecran 4k rotatif",2000,10);
        System.out.println(Ecran.toString());
        Ecran.demarrerEnchere();
        System.out.println(Ecran.toString());
        Ecran.arreterEnchere();
        System.out.println(Ecran.toString());

    }
}
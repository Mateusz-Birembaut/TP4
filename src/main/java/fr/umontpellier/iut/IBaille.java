package fr.umontpellier.iut;

public class IBaille {
    public static void main(String[] args) {
        Compte Gaga = new Compte("Gaga","azuvayzug@gmail.com","76 rue Truc",100.045);
        Compte Jojo = new Compte("Jojo","w9841erg@gmail.com","77 rue Truc",29145.12);
        Compte Gege = new Compte("GeGe","ergzerg@gmail.com","78 rue Truc",12235.21);
        Produit Ecran = new Produit(1,"Superbe ecran 4k rotatif",100,100);
        Produit Truc = new Produit(1,"C bien",1000,100);
        Jojo.creerOffre(Ecran,400,600);
        System.out.println(Gaga);
        System.out.println(Jojo);
        System.out.println(Gege);
        Ecran.demarrerEnchere();
        Gaga.creerOffre(Ecran,200,400);
        Gege.creerOffre(Ecran,300,500);
        Jojo.creerOffre(Ecran,400,600);
        System.out.println(Ecran.gagnant());
        System.out.println(Truc.gagnant());
    }
}

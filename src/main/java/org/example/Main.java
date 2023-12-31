package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Enseignant e1 = new Enseignant(1, "nom1", "prenom1");
        Enseignant e2 = new Enseignant(2, "nom2", "prenom2");
        Enseignant e3 = new Enseignant(3, "nom3", "prenom3");
        Enseignant e4 = new Enseignant(4, "nom4", "prenom4");

        EspritHashSet hastSetEsprit = new EspritHashSet();
        hastSetEsprit.ajouterEnseignant(e4);
        hastSetEsprit.ajouterEnseignant(e3);
        hastSetEsprit.ajouterEnseignant(e1);
        hastSetEsprit.ajouterEnseignant(e2);

        hastSetEsprit.displayEnseignants();
        System.out.println(hastSetEsprit.rechercherEnseignant(e1));
        System.out.println(hastSetEsprit.rechercherEnseignant(e3));
        System.out.println(hastSetEsprit.rechercherEnseignant(6));
        hastSetEsprit.supprimerEnseignant(e1);
        hastSetEsprit.displayEnseignants();
        System.out.println("-------------");

        System.out.println(hastSetEsprit.TriParNom());
        System.out.println(hastSetEsprit.TriParIdDec());

        System.out.println("-------------");
        EspritTreeSet treeSetEsprit = new EspritTreeSet(new TriParIdDec());
        treeSetEsprit.ajouterEnseignant(e1);
        treeSetEsprit.ajouterEnseignant(e2);
        treeSetEsprit.ajouterEnseignant(e3);

        treeSetEsprit.displayEnseignants();
        System.out.println(treeSetEsprit.rechercherEnseignant(e1));
        System.out.println(treeSetEsprit.rechercherEnseignant(e3));
        System.out.println(treeSetEsprit.rechercherEnseignant(6));
        treeSetEsprit.supprimerEnseignant(e1);
        treeSetEsprit.displayEnseignants();




    }
}
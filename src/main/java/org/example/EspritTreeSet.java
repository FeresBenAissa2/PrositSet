package org.example;

import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

public class EspritTreeSet implements GestionEnseignant {

    private TreeSet<Enseignant>treeSetSetEnseignant ;
    public EspritTreeSet (TriParNom tr){
        treeSetSetEnseignant = new TreeSet<>(tr);
    }
    public EspritTreeSet (TriParIdDec tr){
        treeSetSetEnseignant = new TreeSet<>(tr);
    }


    @Override
    public void ajouterEnseignant(Enseignant e) {
        this.treeSetSetEnseignant.add(e);
    }

    @Override
    public boolean rechercherEnseignant(Enseignant e) {
        ;
        return this.treeSetSetEnseignant.contains(e);
    }

    @Override
    public boolean rechercherEnseignant(int id) {
        for (Enseignant ens :treeSetSetEnseignant)
            if(ens.getId()==id) return true;
        return false;
    }

    @Override
    public void supprimerEnseignant(Enseignant e) {
        this.treeSetSetEnseignant.remove(e);
    }

    @Override
    public void displayEnseignants() {
        System.out.println(this.treeSetSetEnseignant);
    }


}

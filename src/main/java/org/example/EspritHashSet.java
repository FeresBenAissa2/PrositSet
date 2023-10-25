package org.example;

import java.util.HashSet;
import java.util.TreeSet;

public class EspritHashSet implements GestionEnseignant{

    private HashSet<Enseignant> hashSetEnseignant = new HashSet<>() ;

    @Override
    public void ajouterEnseignant(Enseignant e) {
        this.hashSetEnseignant.add(e);
    }

    @Override
    public boolean rechercherEnseignant(Enseignant e) {
        ;
        return this.hashSetEnseignant.contains(e);
    }

    @Override
    public boolean rechercherEnseignant(int id) {
        for (Enseignant ens :hashSetEnseignant)
            if(ens.getId()==id) return true;
        return false;
    }

    @Override
    public void supprimerEnseignant(Enseignant e) {
        this.hashSetEnseignant.remove(e);
    }

    @Override
    public void displayEnseignants() {
        System.out.println(this.hashSetEnseignant);
    }
    public TreeSet<Enseignant> TriParNom (){
        TreeSet<Enseignant> treeSet = new TreeSet<>(new TriParNom());
        treeSet.addAll(this.hashSetEnseignant);
        return treeSet;
    }
    public TreeSet<Enseignant> TriParIdDec (){
        TreeSet<Enseignant> treeSet = new TreeSet<>(new TriParIdDec());
        treeSet.addAll(this.hashSetEnseignant);
        return treeSet;
    }
}


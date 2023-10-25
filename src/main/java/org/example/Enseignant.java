package org.example;

import java.util.Objects;

public class Enseignant implements  Comparable<Enseignant> {
    private int id ;
    private String nom, prenom ;
    public Enseignant() {
        this.id = 0;
        this.nom = "";
        this.prenom = "";
    }
    public Enseignant(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Enseignant that = (Enseignant) o;
        return id == that.id && Objects.equals(nom, that.nom) && Objects.equals(prenom, that.prenom);
    }

    @Override
    public String toString() {
        return "Enseignant{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, prenom);
    }

    @Override
    public int compareTo(Enseignant o) {
        return Integer.compare(this.id,o.getId());
    }
}

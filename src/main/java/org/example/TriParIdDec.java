package org.example;

import java.util.Comparator;

public class TriParIdDec implements Comparator<Enseignant> {
    @Override
    public int compare(Enseignant o1, Enseignant o2) {
        return o2.getId()-o1.getId();
    }
}

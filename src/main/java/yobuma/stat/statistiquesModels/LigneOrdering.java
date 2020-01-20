package yobuma.stat.statistiquesModels;

import java.util.List;

public class LigneOrdering {
    private String title;
    private int numero;
    private List<ParentLigneWithChild> ligneDeparts;

    private List<ParentLigneWithChild> ligneArrivees;

    public LigneOrdering() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<ParentLigneWithChild> getLigneDeparts() {
        return ligneDeparts;
    }

    public void setLigneDeparts(List<ParentLigneWithChild> ligneDeparts) {
        this.ligneDeparts = ligneDeparts;
    }

    public List<ParentLigneWithChild> getLigneArrivees() {
        return ligneArrivees;
    }

    public void setLigneArrivees(List<ParentLigneWithChild> ligneArrivees) {
        this.ligneArrivees = ligneArrivees;
    }
}

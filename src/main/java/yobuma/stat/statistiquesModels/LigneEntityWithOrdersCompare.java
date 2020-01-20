package yobuma.stat.statistiquesModels;

import java.util.List;

public class LigneEntityWithOrdersCompare {
    private String title;
    private int numero;
    private List<LigneWithReservationsCompare> lignesDepart;
    private List<LigneWithReservationsCompare> lignesArrive;

    public LigneEntityWithOrdersCompare() {
    }

    public List<LigneWithReservationsCompare> getLignesArrive() {
        return lignesArrive;
    }

    public void setLignesArrive(List<LigneWithReservationsCompare> lignesArrive) {
        this.lignesArrive = lignesArrive;
    }

    public List<LigneWithReservationsCompare> getLignesDepart() {
        return lignesDepart;
    }

    public void setLignesDepart(List<LigneWithReservationsCompare> lignesDepart) {
        this.lignesDepart = lignesDepart;
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



}

package yobuma.stat.statistiquesModels;

import java.util.List;

public class LigneEntityWithOrders {
    private String title;
    private int numero;
    private List<LigneWithReservations> lignesDepart;
    private List<LigneWithReservations> lignesArrive;

    public LigneEntityWithOrders() {
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

    public List<LigneWithReservations> getLignesDepart() {
        return lignesDepart;
    }

    public void setLignesDepart(List<LigneWithReservations> lignesDepart) {
        this.lignesDepart = lignesDepart;
    }

    public List<LigneWithReservations> getLignesArrive() {
        return lignesArrive;
    }

    public void setLignesArrive(List<LigneWithReservations> lignesArrive) {
        this.lignesArrive = lignesArrive;
    }
}

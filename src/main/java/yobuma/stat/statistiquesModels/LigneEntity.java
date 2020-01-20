package yobuma.stat.statistiquesModels;

import yobuma.stat.models.YobBookproBustrip;
import java.util.List;

public class LigneEntity {
    private String title;
    private int numero;
    private List<YobBookproBustrip> lignesDepart;
    private List<YobBookproBustrip> lignesArrive;

    public LigneEntity() {
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

    public List<YobBookproBustrip> getLignesDepart() {
        return lignesDepart;
    }

    public void setLignesDepart(List<YobBookproBustrip> lignesDepart) {
        this.lignesDepart = lignesDepart;
    }

    public List<YobBookproBustrip> getLignesArrive() {
        return lignesArrive;
    }

    public void setLignesArrive(List<YobBookproBustrip> lignesArrive) {
        this.lignesArrive = lignesArrive;
    }
}

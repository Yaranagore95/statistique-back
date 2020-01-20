package yobuma.stat.statistiquesModels;

import yobuma.stat.models.YobBookproBustrip;
import yobuma.stat.models.YobBookproOrder;

import java.util.List;

public class LigneWithReservationsCompare {
    private YobBookproBustrip ligne;
    private List<YobBookproOrder> ligneReservations;
    private String compare1;

    public LigneWithReservationsCompare() {
    }

    public String getCompare1() {
        return compare1;
    }

    public void setCompare1(String compare1) {
        this.compare1 = compare1;
    }

    public YobBookproBustrip getLigne() {
        return ligne;
    }

    public void setLigne(YobBookproBustrip ligne) {
        this.ligne = ligne;
    }

    public List<YobBookproOrder> getLigneReservations() {
        return ligneReservations;
    }

    public void setLigneReservations(List<YobBookproOrder> ligneReservations) {
        this.ligneReservations = ligneReservations;
    }
}

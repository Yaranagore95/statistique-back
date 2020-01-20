package yobuma.stat.statistiquesModels;

import yobuma.stat.models.YobBookproBustrip;
import yobuma.stat.models.YobBookproOrder;

import java.util.List;

public class LigneWithReservations {
    private YobBookproBustrip ligne;
    private List<YobBookproOrder> ligneReservations;

    public LigneWithReservations() {
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

package yobuma.stat.statistiquesModels;

import yobuma.stat.models.YobBookproBustrip;

import java.util.List;

public class ParentLigneWithChild {
    private YobBookproBustrip parentLigne;
    private List<YobBookproBustrip> childLignes;

    public ParentLigneWithChild() {
    }

    public YobBookproBustrip getParentLigne() {
        return parentLigne;
    }

    public void setParentLigne(YobBookproBustrip parentLigne) {
        this.parentLigne = parentLigne;
    }

    public List<YobBookproBustrip> getChildLignes() {
        return childLignes;
    }

    public void setChildLignes(List<YobBookproBustrip> childLignes) {
        this.childLignes = childLignes;
    }
}

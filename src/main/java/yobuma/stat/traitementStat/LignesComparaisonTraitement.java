package yobuma.stat.traitementStat;

import java.util.Date;
import java.util.List;

import yobuma.stat.servicesImpl.BustripImpl;
import yobuma.stat.statistiquesModels.LigneEntity;

public class LignesComparaisonTraitement {
    private final BustripImpl bustripSrc;

    public LignesComparaisonTraitement(BustripImpl bustripSrc) {
        this.bustripSrc = bustripSrc;
    }

    public List<LigneEntity> oneCompagnieStatistiqueGettingCompare(final Date dateinf1, final Date dateSup1,
            final Date dateInf2, final Date dateSup2, final int hubId, final int agentId) {
                

        return null;
    }
}

package yobuma.stat.traitementStat;

import org.springframework.stereotype.Service;
import yobuma.stat.models.YobBookproBustrip;
import yobuma.stat.models.YobBookproOrder;
import yobuma.stat.servicesImpl.OrdersImpl;
import yobuma.stat.statistiquesModels.LigneEntity;
import yobuma.stat.statistiquesModels.LigneEntityWithOrders;
import yobuma.stat.statistiquesModels.LigneWithReservations;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class StatistiqueTraitement {

    private final LigneTraitement ligneTraitement;

    private final OrdersImpl orderSrc;

    public StatistiqueTraitement(LigneTraitement ligneTraitement, OrdersImpl orderSrc) {
        this.ligneTraitement = ligneTraitement;
        this.orderSrc = orderSrc;
    }

    public List<LigneEntityWithOrders> allCompagnieStatistiqueGettingByDate(int hubId, Date dateInf, Date dateSup, String type) {
        List<LigneEntityWithOrders> ligneWithOrders = new ArrayList<>();
        List<LigneEntity> ligneAfterTraitement = ligneTraitement.distinctRoutes(hubId);
        return getLigneEntityWithOrders(dateInf, dateSup, ligneWithOrders, ligneAfterTraitement, type);
    }

    public List<LigneEntityWithOrders> getLigneEntityWithOrders(Date dateInf, Date dateSup, List<LigneEntityWithOrders> ligneWithOrders, List<LigneEntity> ligneAfterTraitement, String type) {
        for (LigneEntity ligneEntity: ligneAfterTraitement) {
           LigneEntityWithOrders ligneEntityWithOrders = new LigneEntityWithOrders();
            ligneEntityWithOrders.setTitle(ligneEntity.getTitle());
            ligneEntityWithOrders.setNumero(ligneEntity.getNumero());
            List<LigneWithReservations> ligneDepartWithReservations = new ArrayList<>();
            for (YobBookproBustrip depart: ligneEntity.getLignesDepart()) {
                addOrdersToLigne(dateInf, dateSup, ligneDepartWithReservations, depart, type);
            }
            List<LigneWithReservations> ligneArriveeWithReservation = new ArrayList<>();
            for (YobBookproBustrip arrivee: ligneEntity.getLignesArrive()) {
                addOrdersToLigne(dateInf, dateSup, ligneArriveeWithReservation, arrivee, type);
            }
            ligneEntityWithOrders.setLignesDepart(ligneDepartWithReservations);
            ligneEntityWithOrders.setLignesArrive(ligneArriveeWithReservation);

            if (!ligneEntityWithOrders.getLignesArrive().isEmpty() || !ligneEntityWithOrders.getLignesDepart().isEmpty()){
                ligneWithOrders.add(ligneEntityWithOrders);
            }
        }
        return ligneWithOrders;
    }

    public List<LigneEntityWithOrders> oneCompagnieStatistiqueGettingByDate(int hubId, Date dateInf, Date dateSup, int agentId, String type){
        List<LigneEntityWithOrders> ligneWithOrders = new ArrayList<>();
        List<LigneEntity> ligneAfterTraitement = ligneTraitement.distinctRoutesByAgent(hubId,agentId);
        return getLigneEntityWithOrders(dateInf, dateSup, ligneWithOrders, ligneAfterTraitement, type);
    }

    public void addOrdersToLigne(Date dateInf, Date dateSup, List<LigneWithReservations> ligneDepartWithReservations, YobBookproBustrip depart, String type) {
        LigneWithReservations departWith = new LigneWithReservations();
        List<YobBookproOrder> reservations = new ArrayList<>();
        if (type.toLowerCase().equals("vente")) {
           reservations = orderSrc.reservationByLigneByDateForVente(depart.getId(), dateInf, dateSup);
        }
        if (type.toLowerCase().equals("voyage")){
            reservations = orderSrc.reservationByLigneByDateForVoyages(depart.getId(), dateInf, dateSup);
        }
        if (!reservations.isEmpty()) {
            departWith.setLigne(depart);
            departWith.setLigneReservations(reservations);
            ligneDepartWithReservations.add(departWith);
        }
    }
}

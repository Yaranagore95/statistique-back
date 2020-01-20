package yobuma.stat.services;

import yobuma.stat.models.YobBookproOrder;

import java.util.Date;
import java.util.List;

public interface IOrders {

    List<YobBookproOrder> all();

    YobBookproOrder getOne(int id);

    void delete(int id);

    List<YobBookproOrder> reservationByLigneByDateForVente(int ligneId, Date dateInf, Date dateSup);

    List<YobBookproOrder> reservationByLigneByDateForVoyages(int ligneId, Date dateInf, Date dateSup);

}

package yobuma.stat.services;

import yobuma.stat.models.YobBookproPassenger;

import java.util.Date;
import java.util.List;

public interface IPassenger {

    List<YobBookproPassenger> all();

    YobBookproPassenger getOne(int id);

    void delete(int id);

    List<YobBookproPassenger> passagersByDate(Date dateInf, Date dateSup, int ligneId);

    // List<YobBookproPassenger> orderPassengers(int order_id);

    int distinctDateByLigne(Date date1, Date date2, int ligne_id);

    // List<YobBookproPassenger> passengerByLigneByDate(int ligne_id, Date dt1, Date dt2);

    int distinctDateByAgent(Date dateInf, Date dateSup, int agentId);
}

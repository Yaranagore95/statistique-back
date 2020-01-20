package yobuma.stat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import yobuma.stat.models.YobBookproPassenger;

import java.util.Date;
import java.util.List;

@Repository(value = "passengerRepository")
public interface YobBookproPassengerRepository extends JpaRepository<YobBookproPassenger, Integer> {

    @Query(value = "SELECT y FROM YobBookproPassenger y WHERE y.start >= :dateInf AND y.start <= :dateSup and y.yobBookproBustrip.id = :id AND y.yobBookproOrder.payStatus = 'SUCCESS' AND y.yobBookproBustrip.id = :id")
    List<YobBookproPassenger> passagersByDateByAgent(@Param("dateInf") Date dateInf, @Param("dateSup") Date dateSup, @Param("id") int ligneId);

    @Query("SELECT count(distinct y.start) FROM YobBookproPassenger y where y.start >= :dateInf and y.start <= :dateSup and y.yobBookproBustrip.id = :id AND y.yobBookproOrder.payStatus = 'SUCCESS' AND y.yobBookproOrder.orderStatus = 'CONFIRMED'")
    int distinctDates(@Param("dateInf") Date dt1, @Param("dateSup") Date dt2, @Param("id") int ligneId);

    @Query("SELECT count(distinct y.start) FROM YobBookproPassenger y where y.start >= :dateInf and y.start <= :dateSup and y.yobBookproBustrip.yobBookproAgent.id = :id AND y.yobBookproOrder.payStatus = 'SUCCESS' AND y.yobBookproOrder.orderStatus = 'CONFIRMED'")
    int distinctDatesByAgent(@Param("dateInf") Date dt1, @Param("dateSup") Date dt2, @Param("id") int agentId);


    /*@Query("SELECT y FROM YobBookproPassenger y WHERE y.yobBookproCountry.id = :id")
    List<YobBookproPassenger> countryPassengers(@Param("id") int country_id);

    @Query("SELECT y FROM YobBookproPassenger y WHERE y.yobBookproOrder.id = :id")
    List<YobBookproPassenger> orderPassengers(@Param("id") int order_id);

    */
    /*@Query("SELECT y FROM YobBookproPassenger y WHERE y.yobBookproBustrip.id = :id and y.start >= :date1 and y.start < :date2")
    List<YobBookproPassenger> passengerByLigneByDate(@Param("id") int ligne_id, @Param("date1") Date date1, @Param("date2") Date date2);
*/
}

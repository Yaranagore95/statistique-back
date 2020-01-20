package yobuma.stat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import yobuma.stat.models.YobBookproOrder;

import java.util.Date;
import java.util.List;

@Repository(value = "orderRepository")
public interface YobBookproOrderRepository extends JpaRepository<YobBookproOrder, Integer> {

    @Query(value = "SELECT y FROM YobBookproOrder y WHERE y.created >= :dateInf AND y.created <= :dateSup")
    List<YobBookproOrder> reservationByDate(@Param("dateInf")Date dateInf, @Param("dateSup") Date dateSup);

    @Query(value = "SELECT y FROM YobBookproOrder y WHERE y.yobBookproBustrip.id = :id and y.created >= :dateInf and y.created <= :dateSup and y.payStatus = 'SUCCESS'")
    List<YobBookproOrder> ligneReservationsByDateForVente(@Param("id") int ligneId, @Param("dateInf") Date dateInf, @Param("dateSup") Date dateSup);

    @Query(value = "SELECT y FROM YobBookproOrder y WHERE y.yobBookproBustrip.id = :id and y.start >= :dateInf and y.start <= :dateSup and y.orderStatus = 'CONFIRMED'")
    List<YobBookproOrder> ligneReservationsByDateForVoyage(@Param("id") int ligneId, @Param("dateInf") Date dateInf, @Param("dateSup") Date dateSup);


    // List<YobBookproOrder> reservationByDateByAgent(@Param("dateInf") Date dateInf, @Param("dateSup") Date )

    // @Query(value = "SELECT y FROM YobBookproOrder y WHERE y.yobBookproPassengers.start >= :dateInf AND y.yobBookproPassengers.start <= :dateSup")
    // List<YobBookproOrder> voyagesByDate(@Param("dateInf")Date dateInf, @Param("dateSup") Date dateSup);

    /*@Query(value = "SELECT y FROM YobBookproOrder y WHERE y.created =:date")
    List<YobBookproOrder> liste(@Param("date") LocalDateTime date);

    @Query(value = "SELECT y FROM YobBookproOrder  y WHERE y.created > :date")
    List<YobBookproOrder> selectList(@Param("date") Date date);

    @Query(value = "SELECT y FROM YobBookproOrder y WHERE y.yobBookproCustomer.id = :id")
    List<YobBookproOrder> customerOrders(@Param("id") int customer_id);

    @Query(value = "SELECT y FROM YobBookproOrder y WHERE y.yobBookproCurrency.id =: id")
    List<YobBookproOrder> currencyOrders(@Param("id") int currency_id);

    //@Query(value = "SELECT y FROM YobBookproOrder y WHERE y.yobBookproAgent.id = :id")
    //List<YobBookproOrder> agentOrders(@Param("id") int agent_id);

    @Query(value = "SELECT y FROM YobBookproOrder y WHERE y.yobBookproCoupon.id = :id")
    List<YobBookproOrder> couponOrders(@Param("id") int coupon_id);

    @Query(value = "SELECT y FROM YobBookproOrder y WHERE y.yobBookproBustrip.id = :id AND y.created >= :date AND y.orderStatus ='CONFIRMED' AND y.payStatus='SUCCESS'")
    List<YobBookproOrder> ligneOrdersAfterDate(@Param("id") int bustrip_id, @Param("date") Date date);

    @Query(value = "SELECT y FROM YobBookproOrder y WHERE y.created >= :date AND y.created <= :nextDate AND y.yobBookproBustrip.id = :id")
    List<YobBookproOrder> orderByLigneByDate(@Param("date") Date date, @Param("nextDate") Date nextDate, @Param("id") int id);
*/
}

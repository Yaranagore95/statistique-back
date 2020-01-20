package yobuma.stat.servicesImpl;

import org.springframework.stereotype.Service;
import yobuma.stat.models.YobBookproAgent;
import yobuma.stat.models.YobBookproBustrip;
import yobuma.stat.models.YobBookproOrder;
import yobuma.stat.models.YobBookproPassenger;
import yobuma.stat.repositories.YobBookproOrderRepository;
import yobuma.stat.services.IOrders;
import yobuma.stat.statistiquesModels.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service("orderSrc")
public class OrdersImpl implements IOrders {

    private final YobBookproOrderRepository repository;

    public OrdersImpl(YobBookproOrderRepository orderRepository) {
        this.repository = orderRepository;
    }

    @Override
    public List<YobBookproOrder> all() {
        return repository.findAll();
    }

    @Override
    public YobBookproOrder getOne(int id) {
        Optional<YobBookproOrder> yobBookproOrder = repository.findById(id);
        return yobBookproOrder.orElse(null);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }

    @Override
    public List<YobBookproOrder> reservationByLigneByDateForVente(int ligneId, Date dateInf, Date dateSup) {
        return repository.ligneReservationsByDateForVente(ligneId, dateInf, dateSup);
    }

    @Override
    public List<YobBookproOrder> reservationByLigneByDateForVoyages(int ligneId, Date dateInf, Date dateSup) {
        return repository.ligneReservationsByDateForVoyage(ligneId, dateInf, dateSup);
    }
}

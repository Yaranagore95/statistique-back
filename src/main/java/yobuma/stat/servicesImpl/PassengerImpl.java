package yobuma.stat.servicesImpl;

import org.springframework.stereotype.Service;
import yobuma.stat.models.YobBookproPassenger;
import yobuma.stat.repositories.YobBookproPassengerRepository;
import yobuma.stat.services.IPassenger;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service("passengerSrc")
public class PassengerImpl implements IPassenger {

    private final YobBookproPassengerRepository repository;

    public PassengerImpl(YobBookproPassengerRepository passengerRepository) {
        this.repository = passengerRepository;
    }

    @Override
    public List<YobBookproPassenger> all() {
        return repository.findAll();
    }

    @Override
    public YobBookproPassenger getOne(int id) {
        Optional<YobBookproPassenger> yobBookproPassenger = repository.findById(id);
        return yobBookproPassenger.orElse(null);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }

    @Override
    public List<YobBookproPassenger> passagersByDate(Date dateInf, Date dateSup, int ligneId) {
        return repository.passagersByDateByAgent(dateInf, dateSup, ligneId);
    }

    @Override
    public int distinctDateByLigne(Date date1, Date date2, int ligne_id) {
        return  repository.distinctDates(date1, date2, ligne_id);
    }

    @Override
    public int distinctDateByAgent(Date dateInf, Date dateSup, int agentId) {
        return repository.distinctDatesByAgent(dateInf, dateSup, agentId);
    }
}

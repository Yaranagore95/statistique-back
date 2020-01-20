package yobuma.stat.servicesImpl;

import org.springframework.stereotype.Service;
import yobuma.stat.models.YobBookproBaggage;
import yobuma.stat.repositories.YobBookproBaggageRepository;
import yobuma.stat.services.IBaggage;

import java.util.List;
import java.util.Optional;

@Service("baggageSrc")
public class BaggageImpl implements IBaggage {

    private final YobBookproBaggageRepository repository;

    public BaggageImpl(YobBookproBaggageRepository baggageRepository) {
        this.repository = baggageRepository;
    }


    @Override
    public List<YobBookproBaggage> all() {
        return repository.findAll();
    }

    @Override
    public YobBookproBaggage getOne(int id) {
        Optional<YobBookproBaggage> yobBookproBaggage = repository.findById(id);
        return yobBookproBaggage.orElse(null);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}

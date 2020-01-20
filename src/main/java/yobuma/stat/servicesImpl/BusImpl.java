package yobuma.stat.servicesImpl;

import org.springframework.stereotype.Service;
import yobuma.stat.models.YobBookproBus;
import yobuma.stat.repositories.YobBookproBusRepository;
import yobuma.stat.services.IBus;

import java.util.List;
import java.util.Optional;

@Service("busSrc")
public class BusImpl implements IBus {

    private final YobBookproBusRepository repository;

    public BusImpl(YobBookproBusRepository busRepository) {
        this.repository = busRepository;
    }

    @Override
    public List<YobBookproBus> all() {
        return repository.findAll();
    }

    @Override
    public YobBookproBus getOne(int id) {
        Optional<YobBookproBus> yobBookproBus = repository.findById(id);
        return yobBookproBus.orElse(null);
    }


    @Override
    public YobBookproBus findOne(String code) {
        return repository.findByCode(code);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }

}

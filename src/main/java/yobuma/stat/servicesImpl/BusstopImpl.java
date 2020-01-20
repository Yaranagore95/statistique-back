package yobuma.stat.servicesImpl;

import org.springframework.stereotype.Service;
import yobuma.stat.models.YobBookproBusstop;
import yobuma.stat.repositories.YobBookproBusstopRepository;
import yobuma.stat.services.IBusstop;

import java.util.List;
import java.util.Optional;

@Service("busstopSrc")
public class BusstopImpl implements IBusstop {

    private final YobBookproBusstopRepository repository;

    public BusstopImpl(YobBookproBusstopRepository busstopRepository) {
        this.repository = busstopRepository;
    }

    @Override
    public List<YobBookproBusstop> all() {
        return repository.findAll();
    }

    @Override
    public YobBookproBusstop getOne(int id) {
        Optional<YobBookproBusstop> yobBookproBusstop = repository.findById(id);
        return yobBookproBusstop.orElse(null);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}
